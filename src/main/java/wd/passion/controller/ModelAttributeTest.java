package wd.passion.controller;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(tags = "测试@ModelAttribute")
@RequestMapping(value="model")
public class ModelAttributeTest {
    
    @ModelAttribute
    public void init()
    {
        System.out.println("最先执行的方法");
    }
    
    @ModelAttribute
    public void init02()
    {
        System.out.println("最先执行的方法02");
    }
    
//    @RequestMapping(value="modelTest.do",method = RequestMethod.GET)
    @GetMapping("modelTest.do")
    public String modelTest()
    {
        System.out.println("然后执行的方法");
        return "modelTest";
    }
    
    @ModelAttribute
    public void init03()
    {
        System.out.println("最先执行的方法03");
    }
}