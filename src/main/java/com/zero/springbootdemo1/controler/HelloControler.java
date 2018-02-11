package com.zero.springbootdemo1.controler;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * 类或方法的功能描述 :TODO
 *
 * @param
 * @author zorro.li
 * @date 2018/2/11 17:50
 * @return
 */  
@RestController
public class HelloControler {
    @RequestMapping("/")
    public String index() {
        return "Greetings from 111 Spring Boot!";
    }

    @RequestMapping("/hello")
    /**
     *
     *
     * @author zorro.li
     * @date 2018/2/11 17:41
     * @param []
     * @return java.lang.String
     */
    public String sayHello() {
        return "Greetings from 111 Spring Boot!";
    }

    /**
     * @param [str count]
     * @return java.util.Map
     * @author zorro.li
     * @date 2018/2/11 17:44
     */
    public Map getParam(String str, int count) {
        return null;
    }

}
