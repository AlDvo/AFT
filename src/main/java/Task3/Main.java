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
        String dateNew;
        if((date.length() < 9)&&(date.lastIndexOf(".") ==5)&&(Integer.parseInt(date.substring(6,8))< 40)){
            dateNew = date.substring(0,6) + "20" + date.substring(6,8);
        }else if ((date.length() < 9)&&(date.lastIndexOf(".") ==5)&&(Integer.parseInt(date.substring(6,8))> 40)) {
            dateNew = date.substring(0, 6) + "19" + date.substring(6, 8);
        }else{
            dateNew = date;
        }

        DateTimeFormatter germanFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM).withLocale(Locale.GERMAN);
        LocalDate localDate = LocalDate.parse(dateNew, germanFormatter);

        for(int i = 0 ; i < companies1.length; i++){
            LocalDate dateFounded;
            if(companies1[i].getFounded().indexOf(".") < 2){
                germanFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM).withLocale(Locale.GERMAN);
                dateFounded = LocalDate.parse(("0" + companies1[i].getFounded()), germanFormatter);
            }else {
                germanFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM).withLocale(Locale.GERMAN);
                dateFounded = LocalDate.parse(companies1[i].getFounded(), germanFormatter);
            }

            if (dateFounded.isAfter(localDate)){
                System.out.println(companies1[i].getName() + " " + companies1[i].getFounded());
            }
        }

//        На запрос пользователя в виде кода валюты, например EU, USD, RUB и пр.
//        выводить id компании и коды ее ценных бумаг, использующих заданную

        System.out.println("Введите код валюты ");
        String currency = scan.nextLine();
        scan.close();


        for(int i = 0; i < securities0.length; i++){
            for(int j = 0 ; j <securities0[i].getCurrency().length;j++ ){
                if (currency.equals(CURRENCY.toString(securities0[i].getCurrency()[j]))){
                    System.out.println(companies1[0].getId() + " id фирмы, " + securities0[i].getCode());
                }
            }
        }

        for(int i = 0; i < securities1.length; i++){
            for(int j = 0 ; j <securities1[i].getCurrency().length;j++ ){
                if (currency.equals(CURRENCY.toString(securities1[i].getCurrency()[j]))){
                    System.out.println(companies1[1].getId() + " id фирмы, " + securities1[i].getCode());
                }
            }
        }

        for(int i = 0; i < securities2.length; i++){
            for(int j = 0 ; j <securities2[i].getCurrency().length;j++ ){
                if (currency.equals(CURRENCY.toString(securities2[i].getCurrency()[j]))){
                    System.out.println(companies1[2].getId() + " id фирмы, " + securities2[i].getCode());
                }
            }
        }

        for(int i = 0; i < securities3.length; i++){
            for(int j = 0 ; j <securities3[i].getCurrency().length;j++ ){
                if (currency.equals(CURRENCY.toString(securities3[i].getCurrency()[j]))){
                    System.out.println(companies1[3].getId() + " id фирмы, " + securities3[i].getCode());
                }
            }
        }
    }
}
