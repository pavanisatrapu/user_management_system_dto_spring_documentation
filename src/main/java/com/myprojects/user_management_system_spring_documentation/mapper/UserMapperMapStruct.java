package com.myprojects.user_management_system_spring_documentation.mapper;

import com.myprojects.user_management_system_spring_documentation.dto.UserDto;
import com.myprojects.user_management_system_spring_documentation.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;


@Mapper
public interface UserMapperMapStruct{
    UserMapperMapStruct MAPPER= Mappers.getMapper(UserMapperMapStruct.class);
    UserDto toUserDto(User user);
    User toUser(UserDto userDto);
}