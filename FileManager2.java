import java.io.*;
import java.io.IOException;
import java.io.FileWriter;
import java.io.File;
import java.util.Scanner;


public class FileManager2{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the file name :");
        String FileName = input.nextLine();
          
        CreaFile(FileName);
        WriteFile(FileName);
        RedFile(FileName);

        input.close();
    }

    public static void CreaFile(String fileName){
        
        try{
            File myfile = new File(fileName);
            System.out.println("Enter file Name foe add a file now.");
            if(myfile.createNewFile()){
                System.out.println("The file is created.");
            }else{
                System.out.println(" The file already exists.");
            }
        }catch(IOException e){
            e.printStackTrace();
        }
       

    }
     public static void WriteFile(String fileName){
        Scanner Scane = new Scanner(System.in);
        

        try(FileWriter myfile = new FileWriter(fileName)){
            
            System.out.println("How many lines do you want to write down?");
             int size = Scane.nextInt();
             Scane.nextLine();

        for(int i = 0 ; i < size; i++){
            System.out.println("Enter three Line notes Hear..");
            System.out.println("Write Line of " + (i + 1) + ": " );
          String  Notes = Scane.nextLine();
          myfile.write(Notes + "\n ");
        }
        Scane.close();
          
        }catch(IOException e ){
            e.printStackTrace();
        }

     }
        public static void RedFile(String fileName){
            try{
                File myFile = new File(fileName);
                Scanner mySCane = new Scanner(myFile);
                 System.out.println("------- Provew of file --------");
                while(mySCane.hasNextLine()){
                    String note = mySCane.nextLine();
                   
                    System.out.println(note);

                }
                mySCane.close();

            }catch(IOException e){
                    e.printStackTrace();

            }

        }
    
}
