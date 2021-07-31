package main.java.Task3;

import com.fasterxml.jackson.databind.ObjectMapper;
import main.java.Task3.Companies;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, ParseException {
        File file = new File("пример для ДЗ№3.json");
        ObjectMapper objectMapper = new ObjectMapper();

        Companies companies = objectMapper.readValue(file, Companies.class);

        Company[] companies1 = companies.getCompanies();
        Securities[] securities0 = companies1[0].getSecurities();
        Securities[] securities1 = companies1[1].getSecurities();
        Securities[] securities2 = companies1[2].getSecurities();
        Securities[] securities3 = companies1[3].getSecurities();

//Вывести все имеющиеся компании в формате «Краткое название» – «Дата
//основания 17/01/98»;

        for(int i = 0 ; i < companies1.length ; i++){
            System.out.println(companies1[i].getName() +" - Дата основания " + companies1[i].getFounded());
        }


//        Вывести все ценные бумаги (их код, дату истечения и полное название
//организации-владельца), которые просрочены на текущий день, а также
//посчитать суммарное число всех таких бумаг;

        LocalDate now = LocalDate.now();
        int count = 0;

         for(int i = 0 ; i < securities0.length ; i++){
             DateTimeFormatter germanFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM).withLocale(Locale.GERMAN);
             LocalDate xmas = LocalDate.parse(securities0[i].getDate(), germanFormatter);

             if(now.isAfter(xmas)){
                 System.out.println("код бумаги " + securities0[i].getCode() + " дата истечения " + securities0[i].getDate() + " Название огранизации-владельца " + companies1[0].getName());
                count++;
             }
        }

        for(int i = 0 ; i < securities1.length ; i++){
            DateTimeFormatter germanFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM).withLocale(Locale.GERMAN);
            LocalDate xmas = LocalDate.parse(securities1[i].getDate(), germanFormatter);

            if(now.isAfter(xmas)){
                System.out.println("код бумаги " + securities1[i].getCode() + " дата истечения " + securities1[i].getDate() + " Название огранизации-владельца " + companies1[1].getName());
                count++;
            }
        }

        for(int i = 0 ; i < securities2.length ; i++){
            DateTimeFormatter germanFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM).withLocale(Locale.GERMAN);
            LocalDate xmas = LocalDate.parse(securities2[i].getDate(), germanFormatter);

            if(now.isAfter(xmas)){
                System.out.println("код бумаги " + securities2[i].getCode() + " дата истечения " + securities2[i].getDate() + " Название огранизации-владельца " + companies1[2].getName());
                count++;
            }
        }

        for(int i = 0 ; i < securities3.length ; i++){
            DateTimeFormatter germanFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM).withLocale(Locale.GERMAN);
            LocalDate xmas = LocalDate.parse(securities3[i].getDate(), germanFormatter);

            if(now.isAfter(xmas)){
                System.out.println("код бумаги " + securities3[i].getCode() + " дата истечения " + securities3[i].getDate() + " Название огранизации-владельца " + companies1[3].getName());
                count++;
            }
        }
        System.out.println(count);

//        На запрос пользователя в виде даты «ДД.ММ.ГГГГ», «ДД.ММ,ГГ»,
//«ДД/ММ/ГГГГ» и «ДД/ММ/ГГ» вывести название и дату создания всех
//организаций, основанных после введенной даты;

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите дату ");
        String date =scan.nextLine().replace('/','.').replace(',','.');
        scan.close();

        DateTimeFormatter germanFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM).withLocale(Locale.GERMAN);
        LocalDate localDate = LocalDate.parse(date, germanFormatter);

        for(int i = 0 ; i < companies1.length; i++){
            germanFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM).withLocale(Locale.GERMAN);
            LocalDate dateFounded = LocalDate.parse(companies1[i].getFounded(), germanFormatter);
            if (dateFounded.isAfter(localDate)){
                System.out.println(companies1[i].getName() + " " + companies1[i].getFounded());
            }
        }


    }
}
