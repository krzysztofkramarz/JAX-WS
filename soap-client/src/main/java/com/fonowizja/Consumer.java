package com.fonowizja;

import com.fonowizja.client.NextWorkingDayProviderService;
import com.fonowizja.client.NextWorkingDayProviderServiceImplService;
import com.fonowizja.client.Person;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Paths;

/**
 * @author krzysztof.kramarz
 */
class Consumer {

    /* wygenerowanie konsumera

        wsimport -keep -p com.fonowizja.client -s ./soap-client/src/main/java/  ctf.wsdl
        walidacja request.xml działa w intellij, nie działa w jarce
        https://stackoverflow.com/questions/17351043/how-to-get-absolute-path-to-file-in-resources-folder-of-your-project
        https://stackoverflow.com/questions/20389255/reading-a-resource-file-from-within-jar
        https://stackoverflow.com/questions/403256/how-do-i-read-a-resource-file-from-a-java-jar-file?rq=1
        https://stackoverflow.com/questions/8275499/how-to-call-getclass-from-a-static-method-in-java
        */
    public static void main(String[] args) throws MalformedURLException, URISyntaxException {
        File xsd = new File(
                Consumer.class.getClassLoader().getResource("student.xsd").getFile()
        );
        File request = new File(
                Consumer.class.getClassLoader().getResource("request.xml").getFile()
        );

        boolean isValid = XMLValidator.validateXMLSchema(
                xsd, request);

        System.out.printf("Request is valid: %s",isValid);

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
