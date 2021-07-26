package main.java.Task2;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Paths;
import java.util.Scanner;

public class Buffered {
    public static String readUsingScanner(String fileName) throws IOException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите путь до фаила ");
        String way = scan.nextLine();

        if (way.indexOf(':') == 1 ){
            Scanner scanner = new Scanner(Paths.get(way), StandardCharsets.UTF_8.name());
            String data = scanner.useDelimiter("\\A").next();
            scanner.close();
            return data;
        }else{
        String a = "C:\\Users\\lelik\\IdeaProjects";
        Scanner scanner = new Scanner(Paths.get(a + way), StandardCharsets.UTF_8.name());
        String data = scanner.useDelimiter("\\A").next();
        scanner.close();
        return data;}
    }
}
