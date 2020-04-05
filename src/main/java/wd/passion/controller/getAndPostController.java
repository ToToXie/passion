package wd.passion.controller;

import com.alibaba.fastjson.JSONObject;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;
import wd.passion.entity.Person;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Enumeration;
import java.util.Map;

/**
 * @program: passion
 * @description: hello world!!!
 * @author: wd
 * @create: 2019-09-21 16:49
 **/
@RestController
@RequestMapping("/getAndPost")
@Api("同时获取请求地址里面的参数和请求体里面的参数")
public class getAndPostController {

    public static final String HELLO_WORLD = "Hello World!!!";
    @ApiOperation("Get")
    @GetMapping("/get")
    public String get(@RequestParam int id,HttpServletRequest httpRequest, HttpServletResponse httpResponse){
        System.out.println(id);
        return getString(httpRequest,httpResponse);
    }
    @ApiOperation("Post")
    @PostMapping("/post")
    public String post(@RequestParam int id,@RequestBody String name,@RequestBody(required = false) String age ,HttpServletRequest httpRequest, HttpServletResponse httpResponse){
        System.out.println(id + " === "+ name+ " ---"+age);
        return getString(httpRequest,httpResponse);
    }
    @ApiOperation("Post-RequestBody-传map自己反序列化")
    @PostMapping("/post-RequestBody")
    public String post(@RequestBody Map<String,Object> map){
//        JSON.
        JSONObject jsonObject = new JSONObject(map);
        String name = jsonObject.getString("name");
        int age = jsonObject.getIntValue("age");

        System.out.println(name+ " ---"+age);
        System.out.println(map.toString());
        return "ok";
    }
    @ApiOperation("Post-RequestBody-传实体类")
    @PostMapping("/post-one-class")
    public String post(@RequestBody Person person){
        System.out.println(person.toString());
        return "ok";
    }
    @ApiOperation("Put")
    @PutMapping("/put")
    public String put(HttpServletRequest httpRequest, HttpServletResponse httpResponse){
        return getString(httpRequest,httpResponse);
    }
    /**
     * @Description: 代码块复用
     *
     * @param httpServletRequest
     * @param httpServletResponse*/
    private String getString(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {
        StringBuilder sb = new StringBuilder();
        String token = httpServletRequest.getHeader("token");
        Enumeration<String> token1 = httpServletRequest.getHeaders("token");
        Enumeration<String> headerNames = httpServletRequest.getHeaderNames();


        sb.append(token);
        sb.append("\n");
        sb.append(token1.toString());
        sb.append("\n");
        sb.append(headerNames.toString());
        sb.append("\n");


        return sb.toString();
    }
}
