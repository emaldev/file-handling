import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class NotBookWr {
    public static void main(String[] arga){
        Scanner input = new Scanner(System.in);
        System.out.println("Write yout note in NoteBooke..");
        String writeNote = input.nextLine();

        try(FileWriter myfile = new FileWriter("NoteBook.txt")){
            myfile.write(writeNote);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    
}
