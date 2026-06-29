import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class ReadFile {
    public static void main(String[] arga){
        try{
            File myfileObj = new File("shopinngList.txt");
            Scanner input = new Scanner(myfileObj);
            while(input.hasNextLine()){
                String note = input.nextLine();
                System.out.println(note);

            }

            input.close();
            
        }catch(FileNotFoundException e){
            System.out.println(e);
        }

        
    }
    
}
