/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pb.apb.ws.spring.services;

import java.util.Date;

/**
 *
 * @author Alex
 */
public class Ping {
    private Date date;
    private String msg;
    
    

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Ping() {
        this.date = new Date();
    }

    public Ping(String msg) {
        super();
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "Ping{" + "date=" + date + ", msg=" + msg + '}';
    }
    
    
    
    
}
