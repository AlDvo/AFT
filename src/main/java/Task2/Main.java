package main.java.Task2;

import java.io.*;
import java.util.*;

import static main.java.Task2.Buffered.readUsingScanner;

public class Main {
    public static void main(String[] args) throws IOException {

        String contents = readUsingScanner("fileExample.txt");

        String[] word = contents.split("[^a-zA-Z]+");
        Arrays.sort(word);
        for (String s : word) {
            System.out.println(s);
        }

        Map<String , Integer > map = new HashMap<>();
        int repeat = 1;

        for(int i = 1; i< word.length; i++){
                if (word[i].equals(word[i-1])){
                    repeat ++;
                }else if(!word[i].equals(word[i-1])){
                repeat = 1;
            }
                map.put(word[i], repeat);
        }

        for (Map.Entry<String, Integer> pair : map.entrySet())
        {
            String key = pair.getKey();
            Integer value = pair.getValue();
            System.out.println(key + ":" + value);

        }

        int maxValueInMap=(Collections.max(map.values()));

        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            if (pair.getValue() == maxValueInMap) {
                System.out.println("Слово " + pair.getKey() + " встречается максимальное количество раз  - " + maxValueInMap);
            }
        }

    }
}