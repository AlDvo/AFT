package main.java.Task2;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Paths;
import java.util.Scanner;

public class Buffered {
    public static String readUsingScanner(String fileName) throws IOException {

        if (fileName.indexOf(':') == 1 ){
            Scanner scanner = new Scanner(Paths.get(fileName), StandardCharsets.UTF_8.name());
            String data = scanner.useDelimiter("\\A").next();
            scanner.close();
            return data;
        }else{
        Scanner scanner = new Scanner(Paths.get(fileName), StandardCharsets.UTF_8.name());
        String data = scanner.useDelimiter("\\A").next();
        scanner.close();
        return data;}
    }
}
