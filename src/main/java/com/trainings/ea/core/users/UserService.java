package com.trainings.ea.core.users;

import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class UserService {

    private UserRepository userRepository;
    private ModelMapper modelMapper;


    public List<UserDto> getAllUsers() {
        return userRepository.findAll()
                .stream()
                .map(userEntity -> modelMapper.map(userEntity, UserDto.class))
                .collect(Collectors.toList());
    }

    public UserDto getUser(UUID userId){

        UserEntity user = userRepository.findById(userId)
                          .orElseThrow(() -> new RuntimeException("User Id not found"));
        return modelMapper.map(user, UserDto.class);
    }

    public UserDto createUser( UserDto userDto){
        UserEntity userEntity = modelMapper.map(userDto, UserEntity.class);
        userEntity = userRepository.save(userEntity);
        return modelMapper.map(userEntity, UserDto.class);
    }


}
