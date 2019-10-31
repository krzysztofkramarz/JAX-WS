package com.fonowizja.api;

import javax.xml.ws.Endpoint;

/**
 * @author krzysztof.kramarz
 */
class Publisher {

    public static void main(String[] args) {
        Endpoint.publish("http://127.0.0.1:9999/ctf", new NextWorkingDayProviderServiceImpl());
    }
}
