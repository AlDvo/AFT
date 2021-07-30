package main.java.Task3;


import com.fasterxml.jackson.databind.ObjectMapper;


import java.io.File;
import java.io.IOException;


public class main {
    public static void main(String[] args) throws IOException {

        File file = new File("пример для ДЗ№3.json");
        ObjectMapper objectMapper = new ObjectMapper();

        Companies companies = objectMapper.readValue(file, Companies.class);
//        for (Company company : companies.getCompanies()) {
//            System.out.println(company);
//        }
        //Company[] companies1 = companies.getCompanies().toArray(new Company[0]);

    }
}