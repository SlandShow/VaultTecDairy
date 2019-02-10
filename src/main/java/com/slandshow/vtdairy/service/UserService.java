package com.slandshow.vtdairy.service;

import com.slandshow.vtdairy.models.User;
import com.slandshow.vtdairy.models.dto.UserDto;
import com.slandshow.vtdairy.repository.UserRepository;
import com.slandshow.vtdairy.utils.mapper.MapperUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Slf4j
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private MapperUtils mapperUtils;

    public UserDto getById(Long id) {
        log.debug("Retrieve user from database via id = {}", id);

        Optional<User> optional = userRepository.findById(id);
        return mapperUtils.mapperToUserDto(
                optional.orElseThrow(
                        () -> new NullPointerException("SOSI")
                )
        );
    }



}
