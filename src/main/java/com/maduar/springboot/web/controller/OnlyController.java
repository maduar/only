package com.maduar.springboot.web.controller;

import com.maduar.springboot.web.repositoriy.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    private PersonRepository personRepository;

    @GetMapping("/count")
    public String count() {
        return "person count: " + personRepository.count();
    }
}
