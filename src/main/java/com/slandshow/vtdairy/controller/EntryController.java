package com.slandshow.vtdairy.controller;

import com.slandshow.vtdairy.models.Entry;
import com.slandshow.vtdairy.models.User;
import com.slandshow.vtdairy.models.dto.EntryDto;
import com.slandshow.vtdairy.models.dto.RequestEntry;
import com.slandshow.vtdairy.service.EntryService;
import com.slandshow.vtdairy.service.UserService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import io.swagger.annotations.Api;

import javax.validation.Valid;
import java.util.List;


@RestController()
@RequestMapping("/entry")
@Api(value = "/entry", description = "Entry controller", produces = "application/json")
public class EntryController {

    @Autowired
    private EntryService entryService;

    @Autowired
    private UserService userService;

    @ApiOperation(value = "Get entry by id",response = Entry.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Entry details retrieved", response = Entry.class),
            @ApiResponse(code = 500, message = "Internal Server Error"),
            @ApiResponse(code = 404, message= "Customer not found")
    })
    @GetMapping("/{id}")
    public EntryDto getEntryById(@PathVariable Long id) {
        return entryService.getById(id);
    }

    @ApiOperation(value = "Get all entries",response = Entry.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Entry details retrieved", response = Entry.class),
            @ApiResponse(code = 500, message = "Internal Server Error"),
            @ApiResponse(code = 404, message= "Customer not found")
    })
    @GetMapping("/all")
    public List<EntryDto> getAll() {
        return entryService.getAll();
    }

    @ApiOperation(value = "Get entry by criteria",response = Entry.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Entry details retrieved", response = Entry.class),
            @ApiResponse(code = 500, message = "Internal Server Error"),
            @ApiResponse(code = 404, message= "Customer not found")
    })
    @GetMapping("/criteria")
    public List<EntryDto> findEntryByCriteria(@ModelAttribute @Valid RequestEntry requestEntry) {
        return entryService.getEntryByCriteria(requestEntry);
    }


    @GetMapping("/user")
    public User user() {
        return userService.getUserById(1l);
    }

}
