package com.ding.web;

import com.ding.common.UserException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: mySpringBoot
 * @description:
 * @author: tinTin
 * @create: 2019-04-24 17:56
 */
@RestController
public class ExceptionTest {

    @GetMapping("exception")
    public String test(String name){
        if (name==null){
            throw new UserException(1,"test exception!");
        }
        return "test";
    }
}
