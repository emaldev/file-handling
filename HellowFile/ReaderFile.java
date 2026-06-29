package HellowFile;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class ReaderFile {
    public static void main(String[] args){
         
     try{
           File myFile = new File("hello.txt");
        Scanner input = new Scanner(myFile);
        int count = 0;
        
      while (input.hasNextLine()) {
        String fileRde = input.nextLine();
        System.out.println(fileRde);
        count++;
      }
      System.out.println("This is count: " + count);
      System.out.println("Thie is size File : " + myFile.length() );
      System.out.println("This is ");
       input.close();
     }catch(FileNotFoundException e){
        e.printStackTrace();
     }
     
        
    }
    
}
