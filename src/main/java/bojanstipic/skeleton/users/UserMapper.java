package bojanstipic.skeleton.users;

import org.springframework.stereotype.Component;

import bojanstipic.skeleton.users.dtos.RegisterReq;
import bojanstipic.skeleton.users.dtos.UserRes;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class UserMapper {

    User map(RegisterReq registerReq) {
        return User.builder()
            .email(registerReq.getEmail())
            .password(registerReq.getPassword())
            .name(registerReq.getName())
            .lastName(registerReq.getLastName())
            .build();
    }

    UserRes map(User user) {
        return UserRes.builder()
            .email(user.getEmail())
            .name(user.getName())
            .lastName(user.getLastName())
            .build();
    }
}
