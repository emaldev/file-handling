// ----------------------{Java File Manager }---------------------------------
//  ---------------------{Conect Manager in file i\o}-------------------------

import java.io.*;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.util.Scanner;
import java.io.IOException;

public class ConectManager2 {
    public static void main(String[] args){
        // --------------{this is the input Scanner Section in the project }-------------------------
        Scanner input = new Scanner(System.in);
        System.out.println("-------( File creation section )-------");
        System.out.println("\t ------{ Hi }----- \n -----{ Welcome to the contact checklist sectio in java }-----");
        System.out.println("Enter the name of the file you want to create.");
        String NameFile = input.nextLine();
       
 
        //---------------------{Section of the reading classes if java and this project }-------------------------------
        AddFile(NameFile);
        WriteFile(NameFile, input);
        RederFile(NameFile, input);
         System.out.println("Enter the search contact name: ");
        String searchName = input.nextLine();
        SearchCotact(NameFile, searchName);

        input.close();


    }

    // ----------------------{Section of the file Reder in the project }-------------------
    public static void AddFile(String fileName){
        try{

           
             File myFile = new File(fileName);
      if(myFile.createNewFile()){
        System.out.println("The file is exist.");

      }else{
        System.out.println("The file is not exist.");
      }

        }catch(IOException e){
            e.printStackTrace();
        }

     

    }

    //-----------------------{Section of the file Writer the project}--------------------------
    public static void WriteFile(String fileName , Scanner input){
        System.out.println("-----( Text input section in the file )------");
        try(FileWriter myFileWriter = new FileWriter(fileName, true)){
            System.out.println("How many cotacts do you want to create Entered:  ");
            int size = input.nextInt();
            input.nextLine();
            for(int i = 1; i <= size; i++){
                 System.out.println("Enter the conect of the name :");
            String name = input.nextLine();
            System.out.println("Enter the nomber phone of the connect: ");
            String number = input.nextLine();
            String canect = name + "," + number;


            myFileWriter.write("\t " + canect);

            }
           

        }catch(IOException e){
        e.printStackTrace();
        }
    }

    //-----------------------------{Section of the file Reder in project }--------------------------
    public static void RederFile(String fileName, Scanner input){
        try{
            System.out.println("-------( The read section of the file )-------");
            File myFile = new File(fileName);
            Scanner Scane = new Scanner(myFile);

            while(Scane.hasNextLine()){
                String note = Scane.nextLine();
                System.out.println(note + "\n");
            }

        }catch(IOException e){
            e.printStackTrace();
        }
    }

    //---------------------{Section of the search conect in the file in this project}------

    public static void SearchCotact(String fileName, String NameToFound){
        try(Scanner input = new Scanner(new File(fileName))){
            System.out.println("----------------( the rearch contact of the list section )----------------");
            boolean found = false;
            while(input.hasNextLine()){
                
                
                String line = input.nextLine();
                if(line.startsWith(NameToFound + ",")){
                    System.out.println("target audience :  " + line);
                    found = true;
                    break;
                }
            }
            if(!found)
                System.out.println("Contact not found in the list.");
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    
}
