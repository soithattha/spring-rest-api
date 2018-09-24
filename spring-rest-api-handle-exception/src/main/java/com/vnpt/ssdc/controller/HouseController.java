/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vnpt.ssdc.controller;

import com.vnpt.ssdc.exception.Car1Exception;
import com.vnpt.ssdc.exception.CarException;
import javax.ws.rs.GET;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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

    @RequestMapping(value = "/house/{id}", method = RequestMethod.GET)
    @ResponseBody
    public String get(@PathVariable("id") String id) {
        int id1 = Integer.valueOf(id);
        switch (id1) {
            case 1:
                throw new CarException("Bad day!!!");
            case 2:
                return "Day la house 2";
            default:
                return "Day la house n";
        }
    }

}
