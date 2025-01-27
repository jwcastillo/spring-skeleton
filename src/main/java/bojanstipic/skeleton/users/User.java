package bojanstipic.skeleton.users;

import io.hypersistence.utils.hibernate.type.basic.PostgreSQLEnumType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.NaturalId;
import org.hibernate.annotations.Type;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "application_user")
public class User {

    @Id
    @GeneratedValue(
        strategy = GenerationType.SEQUENCE,
        generator = "application_user_id_seq"
    )
    private Long id;

    @NaturalId
    private String email;

    private String password;

    private String name;

    private String lastName;

    @Enumerated(EnumType.STRING)
    @Column(columnDefinition = "user_role")
    @Type(PostgreSQLEnumType.class)
    @Builder.Default
    private Role role = Role.USER;

    public enum Role {
        USER,
        ADMIN,
    }
}
