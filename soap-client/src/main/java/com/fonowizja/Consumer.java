package com.fonowizja;

import com.fonowizja.client.NextWorkingDayProviderService;
import com.fonowizja.client.NextWorkingDayProviderServiceImplService;
import com.fonowizja.client.Person;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * @author krzysztof.kramarz
 */
class Consumer {

    /* wygenerowanie konsumera

        wsimport -keep -p com.fonowizja.client -s ./soap-client/src/main/java/  ctf.wsdl */
    public static void main(String[] args) throws MalformedURLException {

        URL url = new URL("http://127.0.0.1:9999/ctf");

        NextWorkingDayProviderServiceImplService service = new NextWorkingDayProviderServiceImplService(url);
        NextWorkingDayProviderService nextWorkingDayProviderServiceImplPort = service.getNextWorkingDayProviderServiceImplPort();

        String nextWorkingDay = nextWorkingDayProviderServiceImplPort.mojaOperacja("2019-10-29");

        System.out.println(nextWorkingDay);
        System.out.println("");
        Person person = nextWorkingDayProviderServiceImplPort.getPerson(1L);
        System.out.println(person);
        nextWorkingDayProviderServiceImplPort.getPerson(-2L);

    }

}
