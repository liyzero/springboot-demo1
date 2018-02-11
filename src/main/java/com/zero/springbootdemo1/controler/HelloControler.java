package com.zero.springbootdemo1.controler;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 类或方法的功能描述 :TODO
 *
 * @author: zorro.li
 * @date: ${date}${time}
 */
@RestController
public class HelloControler {
    @RequestMapping("/")
    public String index() {
        return "Greetings from 111 Spring Boot!";
    }
}
