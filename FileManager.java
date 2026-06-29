import java.io.*;
import java.util.Scanner;


public class FileManager {
    public static void main(String[] args){
        createFile("hello.txt");
        writeFile("hello.txt");
        readFile("hello.txt");
    }


    public static void createFile(String fileName){
        try{
            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
            File myFile = new File("hello.txt");
            if(myFile.createNewFile()){
                System.out.println("Creat file .");
            }else{
                System.out.println(" Creat file .");
            }

        }catch(IOException e){
            e.printStackTrace();
            
        }

        
    }

    public static void  writeFile(String fileName){
         System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        Scanner input = new Scanner(System.in);
        System.out.println(" \t Welcom. \n Write the your note in this noteBook.");
        String write;
           try(FileWriter myfileWriter = new FileWriter("hello.txt")){
            for(int i = 0; i <=3 ; i++){
                System.out.println("Write Line "+  ( i + 1) + ":");
                write = input.nextLine();
              myfileWriter.write(write + "\n");
            }
            
           }catch(IOException e){
            e.printStackTrace();
           }
        }

    public static void readFile(String fileName){
        try{
             System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
            File myFile = new File("hello.txt");
            Scanner input = new Scanner(myFile);
            int count = 0;
            System.out.println("This is Information file : ");
            while(input.hasNextLine()){
                String note = input.nextLine();
                
                System.out.println(note);
                count++;
            }
            System.out.println("This is the line number: " + count);
        }catch(IOException e){
            e.printStackTrace();
        }
        
    }
    
}
