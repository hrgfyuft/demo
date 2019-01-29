package com.csyzx.demo.test.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @version V1.0
 * @Title: TestController
 * @Package com.csyzx.demo.test.Controller
 * @Description: ${todo}(用一句话描述该文件做什么)
 * @author: zhangxin02
 * @date: 2019/1/29 14:45
 */

@Controller
public class TestController {
    @RequestMapping(value = "/test")
    public String test(){
        return "test";
    }
}
