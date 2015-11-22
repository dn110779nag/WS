package com.pb.apb.ws.handlers;


import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Новомлинов Александр
 */
public class MyWsHandler extends TextWebSocketHandler{
    @Override
    public void handleTextMessage(WebSocketSession session, TextMessage message) {
        // ...
    }
}
