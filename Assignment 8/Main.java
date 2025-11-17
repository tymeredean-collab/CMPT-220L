import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        
    
      File inputfile = new File("input.txt");
      
        List<String> allNames = new ArrayList<>();
        List<String> highGpaNames = new ArrayList<>();
        
      
      
      try {
        Scanner input = new Scanner(inputfile);
        
        
        while(input.hasNextLine()){
            String line = input.nextLine().trim();

            String[] parts = line.split("\\s+");

            if (parts.length >= 2) {
                String name = parts[0];
                double gpa = Double.parseDouble(parts[1]);

                allNames.add(name);

                if (gpa > 3.5) {
                    highGpaNames.add(name);
                }
            }
        }
      } catch (FileNotFoundException e) {
        throw new RuntimeException(e);
    }
    System.out.println(allNames);
    System.out.println(highGpaNames);
}
}


