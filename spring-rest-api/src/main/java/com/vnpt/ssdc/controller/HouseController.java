/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vnpt.ssdc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author soithattha
 * @date Sep 23, 2018
 * @version
 * @description
 */
@Controller
public class HouseController {

    @GetMapping(path = "/house/{id}")
    @ResponseBody
    public String get(@PathVariable("id") int id) {
        switch (id) {
            case 1:
                return "Day la house 1";
            case 2:
                return "Day la house 2";
            default:
                return "Day la house n";
        }
    }
    

}
