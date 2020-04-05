package wd.passion.controller;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;
import wd.passion.entity.Person;
import wd.passion.enums.GenderEnum;
import wd.passion.service.IPersonService;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author WangDong
 * @since 2019-10-03
 */
@RestController
@RequestMapping("/passion/person")
@Api(tags = "自增主键")
public class PersonController {
    @Resource
    private IPersonService iPersonService;
    @ApiOperation(value = "查询",httpMethod = "GET")
    @GetMapping("get")
    public List<Person> get(@RequestBody Person person){
        return iPersonService.list();
    }

    @ApiOperation(value = "condition-查询",httpMethod = "GET")
    @GetMapping("getCondition")
    public List<Person> getCondition(@ModelAttribute Person person){
        Map<String,Object> map = new HashMap();
        map.put("name", "盖伦");
        return (List<Person>)iPersonService.listByMap(map);
    }
    @ApiOperation(value = "插入",httpMethod = "POST")
    @PostMapping("add")
    public Person add(@ModelAttribute Person person){
        iPersonService.save(person);
        return person;
    }
    @ApiOperation(value = "修改",httpMethod = "PUT")
    @PutMapping("update")
    public Person update(@RequestBody Person person){
        iPersonService.updateById(person);
        return person;
    }
    @ApiOperation(value = "删除",httpMethod = "DELETE")
    @DeleteMapping("delete")
    public Person delete(@RequestBody Person person){
        iPersonService.removeById(person);
        return person;
    }
    @ApiOperation(value = "批量插入",httpMethod = "POST")
    @PostMapping("addBatch")
    public List<Person> addBatch(@RequestBody List<String> names){
        Person person ;
        List<Person> list = new ArrayList<>();
        for(String name :names){
            person = Person.builder().name(name).sex(GenderEnum.MAN).build();
            list.add(person);
        }
        iPersonService.saveBatch(list);
        return iPersonService.list();
    }
}
