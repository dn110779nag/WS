/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pb.apb.ws.config.spring.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessageSendingOperations;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 *
 * @author Alex
 */
@Service
public class WsService {
    @Autowired
    private SimpMessagingTemplate  messagingTemplate;

    @Scheduled(fixedDelay = 1500)
    public void sendTradeNotifications() {
        messagingTemplate.convertAndSend("/queue/errors", new Ping());
    }


}
