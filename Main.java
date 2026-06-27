
import java.io.IOException;
import java.io.File;
public class Main{
    public static void main(String[] args){

         try{
              File myfile = new File("Test.text");
              if(myfile.createNewFile()){
                System.out.println("This is a file for java practise my .");
                System.out.println("Hi Dear this is a file .");

              }else{
                System.out.println("File is already exist.");
              }
                
              

         }catch(IOException e){
            System.out.println("An error occurred .");
         }

    }
}