package piglatin;

/**Program: PigLatin Program
 *File: PigLatin.java
 *Summary: Prints words in English and PigLatin from a file
 *Author: Mercedes Thigpen
 *Date: March 8, 2018
 **/


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
        
public class PigLatin {
    public static void main(String[] args) throws IOException {
        BufferedReader input = null;
        List<String> wordList = new ArrayList<>();
        //created ArrayList using the words from my Programming Exercise 4 text file
        try{
            input = new BufferedReader(new FileReader("C:/Users/mthigpen/Desktop/ProgrammingExercise4.txt"));
           //The program is using the words from the file to 
            String file;
            while((file = input.readLine()) != null){
                wordList.add(file);
            }
                
    }finally{
            if(input != null) input.close();
        }
        display(wordList);
            //method to display the list of words
    }
    public static void display(Collection<String> L1){
        L1.forEach((x) -> { //adjustment recommended by IDE
            System.out.println(x);
        });
    
 
    }}
    //End of file
   


