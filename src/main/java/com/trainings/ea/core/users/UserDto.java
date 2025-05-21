package com.trainings.ea.core.users;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
public class UserDto {
    private UUID id;
    private String name;
    private String email;
    private String mobile;
}
