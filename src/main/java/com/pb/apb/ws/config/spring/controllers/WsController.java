/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pb.apb.ws.config.spring.controllers;

import java.time.ZonedDateTime;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.stereotype.Controller;

/**
 *
 * @author Новомлинов Александр
 */
@Controller
public class WsController {
    

    @MessageMapping("/greeting") 
    public String handle(String greeting) {
        return "[" + ZonedDateTime.now() + ": " + greeting;
    }
    
    @MessageMapping("/portfolio/info") 
    public String info(String greeting) {
        return "[" + ZonedDateTime.now() + ": " + greeting;
    }
}
