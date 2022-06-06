package com.example.datastructureproject;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/*
This Class is created for reading information from
file and writing this information to priority queue.
 */
public class FileOperations {
    FileOperations() {}

    public void addIntoQueue(PriorityQueue queue) throws IOException {
        File file = new File("employees.txt");
        FileReader fileReader = new FileReader(file);
        BufferedReader br = new BufferedReader(fileReader);
        String line;

        while ((line = br.readLine()) != null) {
            String[] splitLines = line.trim().split(" ");
            if (splitLines.length == 4){
                Person person = new Person(splitLines[0],splitLines[1],Integer.parseInt(splitLines[2]), Integer.parseInt(splitLines[3]));
                queue.insert(person, person.getScore());
            }
        }
        br.close();
    }
}
