import java.io.IOException;
import java.io.FileWriter;
public class FileW {
    public static void main(String[] args){
        

        try{
            FileWriter myfile = new FileWriter("java.text");
           myfile.write("This is a file for java code and commit .");
           myfile.close();
            System.out.println("Successfully wrote ot the java.text");
            
        }catch(IOException e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    
}
