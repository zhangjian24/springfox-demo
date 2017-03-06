package com.zhangjian.controller;

import com.zhangjian.model.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by zhangjian on 2017/1/4 0004.
 */
@Api(value = "demo",tags = {"测试"})
@Controller
@RequestMapping("/demo")
public class HelloWorldController {
    @ResponseBody
    @RequestMapping(value = "/hello",method = {RequestMethod.GET})
    @ApiOperation(value = "hello", notes = "打招呼")
    @ApiResponse(code = 200,response = User.class,message = "字符串")
    @ApiParam(name = "id",defaultValue = "1",example = "1",value = "用户id")
    public User hello(Integer id){
        User u = new User();

        u.id = 1;
        u.name = "王二麻子";
        return u;
    }
}
