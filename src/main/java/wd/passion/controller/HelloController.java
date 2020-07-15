package wd.passion.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: passion
 * @description: hello world!!!
 * @author: wd
 * @create: 2019-09-21 16:49
 **/
@RestController
@RequestMapping("/hello")
@Api("Hello World!!!")
public class HelloController {

    public static final String HELLO_WORLD = "Hello World!!!";
    @ApiOperation("Hello World")
    @GetMapping("/world")
    public String hello(){
        System.out.println(HELLO_WORLD);
        return HELLO_WORLD;
    }
}
