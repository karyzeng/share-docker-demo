package com.zzp.docker.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description demoController
 * @Author Garyzeng
 * @since 2021.04.18
 **/
@RestController
@RequestMapping("/demo")
public class DemoController {

    @RequestMapping(value = "test", method = RequestMethod.GET)
    public String test() {
        return "hello world";
    }

}
