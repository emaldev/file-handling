package HellowFile;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Writerfile {
    public static void main(String[] args){
         Scanner input = new Scanner(System.in);
         System.out.println("Write 3-Line text Hear....");
         String WriteText;
        try(FileWriter myfile = new FileWriter("hello.txt")){
            for(int i = 0; i < 3; i++){
                WriteText = input.nextLine();   
                  myfile.write(WriteText + "\n ");
                    }

          

        }catch(IOException e){
            e.printStackTrace();
        }
    }
    
}
