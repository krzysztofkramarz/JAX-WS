package com.fonowizja;

import com.fonowizja.client.NextWorkingDayProviderService;
import com.fonowizja.client.NextWorkingDayProviderServiceImplService;

import javax.jws.WebService;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * @author krzysztof.kramarz
 */
class Consumer {


    public static void main(String[] args) throws MalformedURLException {

        URL url  = new URL("http://127.0.0.1:9999/ctf");

        NextWorkingDayProviderServiceImplService service = new NextWorkingDayProviderServiceImplService(url);
        NextWorkingDayProviderService nextWorkingDayProviderServiceImplPort = service.getNextWorkingDayProviderServiceImplPort();

        String nextWorkingDay = nextWorkingDayProviderServiceImplPort.getNextWorkingDay("2019-10-29");

        System.out.println(nextWorkingDay);

    }

}
