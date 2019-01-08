package com.slandshow.vtdairy.controller;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/content")
@Api(value = "/content", description = "Content controller", produces = "application/json")
public class ContentController {


}
