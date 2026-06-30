import java.io.*;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import HellowFile.Writerfile;


public class ConectManager {
    public static void main(String[] args){
        System.out.println("Enter file Name:  ");
        Scanner input = new Scanner(System.in);

        String NameFile = input.nextLine();
        AddFile(NameFile, input);
        WriteFile(NameFile, input);
        RederFile(NameFile, input);
    
        input.close();

    }

    public static void AddFile(String fileName, Scanner Scane){
        try{
           // String namFile = Scane.nextLine();
            File myFile = new File(fileName);
            if(myFile.createNewFile()){
                System.out.println("The file exist.");
            }else{
                System.out.println("The file not exist..");
            }

        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public static void WriteFile(String fileName, Scanner Scane){
        try(FileWriter myWriter = new FileWriter(fileName)){
            System.out.println("Enter size of note line number : ");
            int size = Scane.nextInt();
            Scane.nextLine();
            for(int i = 0; i < size; i++){
               // System.out.println("Enter connect Name:  ");
                System.out.println("Enter connect Number: " );
                String name = Scane.nextLine();
                System.out.println("Enter number  connect: ");
                String number = Scane.nextLine();
                String record = name + "," + number;
               // record = Scane.nextLine();
                myWriter.write(record +"\n ");
               // System.out.println(record);
              
                System.out.println("Connect Seved: " + record);
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public static void RederFile(String fileName, Scanner Scane){
    
        try{
            File myFile = new File(fileName);
            Scanner scan = new Scanner(myFile);

            while(scan.hasNextLine()){
                String conect = Scane.nextLine();
                System.out.println(conect);
            }
            Scane.close();
        }catch(IOException e){
            e.printStackTrace();
        }

    }
    
}
