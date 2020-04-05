package wd.passion.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import wd.passion.entity.User;
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
@Api(value = "UserController",tags = "联合主键,id code 没有自增,不自己写xml",description = "没有自增,不自己写xml")
@Slf4j
public class UserController {
    @Resource
    private IUserService iUserService;
    @ApiOperation(value = "查询",httpMethod = "GET")
    @GetMapping("get")
    public List<User> get(@ModelAttribute User user){
//        List<User> list = iUserService.list();
        QueryWrapper<User> objectQueryWrapper = new QueryWrapper<>();
        objectQueryWrapper.gt("id", user.getId());
        objectQueryWrapper.like("user_name", "艾");
        return iUserService.list(objectQueryWrapper);
    }

    @ApiOperation(value = "插入",httpMethod = "POST")
    @PostMapping("add")
    public User add(@ModelAttribute User user){
        iUserService.save(user);
        return user;
    }
    @ApiOperation(value = "修改",httpMethod = "PUT")
    @PutMapping("update")
    public User update(@RequestBody User user){
        iUserService.updateById(user);
        return user;
    }
    @ApiOperation(value = "删除",httpMethod = "DELETE")
    @DeleteMapping("delete")
    public User delete(@RequestBody User user){
        iUserService.removeById(user);
        return user;
    }


}
