package com.company.rpis82.ezhovgleb.task;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.*;
import java.util.Scanner;

public class AppManager {
    public AppManager() {
        init();
    }

    private void init() {
        System.setProperty("javax.xml.accessExternalDTD", "all");  // свойство для разрешения доступа к сторонним DTD

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите имя входного XML файла:");
        String inputFileName = makeCorrectXmlName(scanner.next());

        System.out.println("Введите имя выходного XML файла:");
        String outputFileName = makeCorrectXmlName(scanner.next());

        try {
            // связывание класса с xml и чтение из него.
            JAXBContext jaxbContext = JAXBContext.newInstance(Accounts.class);
            InputStream inputStream = new FileInputStream(inputFileName);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            Accounts accounts = (Accounts)unmarshaller.unmarshal(inputStream);
            inputStream.close();

            // изменение классов
            accounts.getAccount().get(0).getTariff().get(0).getService().get(0).getInternet().setSpeed("200");
            accounts.getAccount().get(1).getTariff().get(0).setCost("150");

            // запись в новый xml
            Marshaller marshaller = jaxbContext.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);  // формат под xml стиль
            File outFile = new File(outputFileName);
            outFile.createNewFile();
            OutputStream outputStream = new FileOutputStream(outFile);
            marshaller.marshal(accounts, outputStream);
            outputStream.close();
        }
        catch (JAXBException e) {
            e.printStackTrace();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String makeCorrectXmlName(String inputString) {
        StringBuilder stringBuilder = new StringBuilder(inputString);
        if (!stringBuilder.toString().endsWith(".xml")) {
            stringBuilder.append(".xml");
        }
        return stringBuilder.toString();
    }
}
