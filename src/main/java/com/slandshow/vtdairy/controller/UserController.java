package com.slandshow.vtdairy.controller;

import com.slandshow.vtdairy.models.Entry;
import com.slandshow.vtdairy.models.User;
import com.slandshow.vtdairy.models.dto.EntryDto;
import com.slandshow.vtdairy.models.dto.UserDto;
import com.slandshow.vtdairy.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/user")
@Api(value = "/user", description = "User controller", produces = "application/json")
public class UserController {

    @Autowired
    private UserService userService;

    @ApiOperation(value = "Get user by id", response = User.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "User details retrieved", response = User.class),
            @ApiResponse(code = 500, message = "Internal Server Error"),
            @ApiResponse(code = 404, message= "User not found")
    })
    @GetMapping("/{id}")
    public UserDto getEntryById(@PathVariable Long id) {
        return userService.getById(id);
    }

}
