package wd.passion.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * @program: passion
 * @description: 测试
 * @author: wd
 * @create: 2020-07-15 17:16
 **/
@RestController
@Api(value = "map传参测试",tags = "map传参测试")
@RequestMapping("/array")
public class MapController {
    @ApiOperation(value = "get",httpMethod = "GET")
    @GetMapping("get")
    public String  get(@RequestParam Map<String,Object> map){
        return map.toString();
    }

    @ApiOperation(value = "post",httpMethod = "POST")
    @PostMapping("post")
    public String getCondition(@RequestBody Map<String,Object> map){
        return map.toString();
    }
}
