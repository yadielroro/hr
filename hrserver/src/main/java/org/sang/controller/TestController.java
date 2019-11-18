package org.sang.controller;

import org.sang.bean.Hr;
import org.sang.mapper.HrMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yeguochong
 * @date 2019/11/9 0009 22:34
 */
@RestController
public class TestController {

    @Autowired
    private HrMapper hrMapper;

    @GetMapping("/test")
    public String test(){
        return "hello";
    }

    @GetMapping("/testGetHrById/{id}")
    public Hr testGetHrById(@PathVariable("id") Long id){
        return hrMapper.getHrById(id);
    }
}
