/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vnpt.ssdc.exception;

/**
 *
 * @author soithattha
 * @date Sep 27, 2018
 * @version
 * @description
 */
public class HomeNotFoundException extends RuntimeException {

    public HomeNotFoundException(String message) {
        super(message);
    }

    public HomeNotFoundException() {
    }

    @Override
    public String getMessage() {
        return "HomeNotFoundException -------";
    }

}
