/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vnpt.ssdc.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 *
 * @author soithattha
 * @date Sep 24, 2018
 * @version
 * @description
 */
public class CarException extends RuntimeException {

    public CarException(String message) {
        super(message);
    }

    public CarException() {
    }

}
