package com.maduar.springboot.web.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description:
 *
 * @author maduar
 * @email maduar@163.com
 * @date 25/07/2019 00:12
 */
@RestController
@CrossOrigin
public class OnlyController {

    @Value("${server.port:7777}")
    private String port;

    @GetMapping("/index")
    public String index() {
        return "index port: " + port;
    }
}
