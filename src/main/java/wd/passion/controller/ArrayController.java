package wd.passion.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;

/**
 * @program: passion
 * @description:
 * @author: wd
 * @create: 2019-09-21 20:34
 **/
@RestController
@Api(value = "数组测试",description = "测试 请求方式 GET POST PUT 和 RequestParam RequestBody ModelAttribute",tags = "数组测试")
@RequestMapping("/array")
public class ArrayController {
    /**
     * @Description: get方式
     **/
    @ApiOperation(value = "GET-RequestParam",httpMethod = "GET")
    @GetMapping("getRequestParam")
    public String getRequestParam(@RequestParam int[] array){
        return Arrays.toString(array);
    }
    @ApiOperation(value = "GET-RequestBody",httpMethod = "GET")
    @GetMapping("getRequestBody")
    public String getRequestBody(@RequestBody int[] array){
        return Arrays.toString(array);
    }
    @ApiOperation(value = "GET-ModelAttribute",httpMethod = "GET")
    @GetMapping("getModelAttribute")
    public String getModelAttribute(@ModelAttribute int[] array){
        return Arrays.toString(array);
    }
    /**
     * @Description: post方式
     **/
    @ApiOperation(value = "POST-RequestParam",httpMethod = "POST")
    @PostMapping("postRequestParam")
    public String postRequestParam(@RequestParam int[] array){
        return Arrays.toString(array);
    }
    @ApiOperation(value = "Post-RequestBody",httpMethod = "POST")
    @PostMapping("postRequestBody")
    public String postRequestBody(@RequestBody int[] array){
        return Arrays.toString(array);
    }
    @ApiOperation(value = "Post-ModelAttribute",httpMethod = "POST")
    @PostMapping("postModelAttribute")
    public String postModelAttribute(@ModelAttribute int[] array){
        return Arrays.toString(array);
    }
    /**
     * @Description: put方式
     **/
    @ApiOperation(value = "PUT-RequestParam",httpMethod = "PUT")
    @PutMapping("putRequestParam")
    public String putRequestParam(@RequestParam int[] array){
        return Arrays.toString(array);
    }
    @ApiOperation(value = "Post-RequestBody",httpMethod = "PUT")
    @PutMapping("putRequestBody")
    public String putRequestBody(@RequestBody int[] array){
        return Arrays.toString(array);
    }
    @ApiOperation(value = "Post-ModelAttribute",httpMethod = "PUT")
    @PutMapping("putModelAttribute")
    public String putModelAttribute(@ModelAttribute int[] array){
        return Arrays.toString(array);
    }
    
}
