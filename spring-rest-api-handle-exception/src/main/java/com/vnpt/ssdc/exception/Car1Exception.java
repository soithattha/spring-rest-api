/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vnpt.ssdc.exception;

import java.io.Serializable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 *
 * @author soithattha
 * @date Sep 24, 2018
 * @version
 * @description
 */
public class Car1Exception extends RuntimeException implements Serializable {

    public Car1Exception(String message) {
        super("TEST1");
    }

    public Car1Exception() {
    }

}
