/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pb.apb.ws.handlers;

import com.pb.apb.ws.spring.services.Ping;
import java.time.ZonedDateTime;
import org.springframework.messaging.handler.annotation.MessageExceptionHandler;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.annotation.SendToUser;
import org.springframework.messaging.simp.annotation.SubscribeMapping;
import org.springframework.stereotype.Controller;

/**
 *
 * @author Новомлинов Александр
 */
@Controller
public class WsController {

    @SubscribeMapping("/ping")
    public Ping getPing() {
        return new Ping();
    }

    @SubscribeMapping("/topic/inf")
    public String info() {
        return "[" + ZonedDateTime.now() + ": !!!!]" ;
    }

    @MessageExceptionHandler
    @SendToUser("/queue/errors")
    public String handleException(Throwable exception) {
        return exception.getMessage();
    }
}
