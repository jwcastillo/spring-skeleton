package bojanstipic.skeleton.users.dtos;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.Builder;
import lombok.Value;
import lombok.With;

@Value
@Builder
@With
public class RegisterReq {

    @Email
    @NotBlank
    String email;

    @Size(min = 8)
    @Pattern(regexp = "(?U)^(?=.*\\p{Lower})(?=.*\\p{Upper})(?=.*\\d).+$")
    String password;

    @Pattern(regexp = "(?U)\\p{Alpha}*")
    String name;

    @Pattern(regexp = "(?U)\\p{Alpha}*")
    String lastName;
}
