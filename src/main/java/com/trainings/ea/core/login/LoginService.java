package com.trainings.ea.core.login;

import com.trainings.ea.core.services.JsonTokenService;
import com.trainings.ea.core.users.UserDto;
import com.trainings.ea.core.users.UserService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Slf4j
@Service
@AllArgsConstructor
public class LoginService {

    private UserService userService;
    private JsonTokenService jsonTokenService;

    public String login(String username, String password) {

        String accessToken = null;

        Optional<UserDto> user = userService.validateUser(username, password);

        if(user.isPresent()){
            accessToken = jsonTokenService.generateAccessToken(user.get());
        } else {
            throw new RuntimeException("Invalid User");
        }
        return accessToken;
    }


}
