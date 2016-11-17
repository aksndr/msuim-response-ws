package ru.terralink.ws.msuim.publisher;

import ru.terralink.ws.msuim.impl.REAttrDataExchangeService;

import javax.xml.ws.Endpoint;

/**
 * Created by AzarovD on 22.01.2016.
 */
public class REAttrDataExchangeServicePublisher {

    public static void main(String[] args) {
        Endpoint.publish("http://localhost:9999/ws", new REAttrDataExchangeService());
    }

}
