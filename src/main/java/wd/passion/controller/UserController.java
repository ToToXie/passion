package wd.passion.controller;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import wd.passion.pojo.User;
import wd.passion.service.IUserService;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author WangDong
 * @since 2019-09-26
 */
@RestController
@RequestMapping("/passion/user")
@Api("UserController")
@Slf4j
public class UserController {
    @Resource
    private IUserService iUserService;
    @ApiOperation(value = "GET",httpMethod = "GET")
    @GetMapping("get")
    public String get(){
        List<User> list = iUserService.list();
        return list.toString();
    }


}
