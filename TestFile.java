import java.io.IOException;
import java.io.FileWriter;
import java.util.Scanner;
public class TestFile {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Write your note...");
        String note = input.nextLine();

        try(FileWriter myfile = new FileWriter("test.Test.text", true)){
            myfile.write(note);

        }catch(IOException e){
            e.printStackTrace();
        }

        input.close();
    }
    
}
