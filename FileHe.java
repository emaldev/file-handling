import java.io.File;
import java.io.IOException;
public class FileHe {
    public static void main(String[] arga){
        try{
            File myfile = new File("java.text");
            if(myfile.createNewFile()){
                System.out.println("This is my file : " + myfile.getName());
            }else{
                System.out.println("File not found .");
            }
        }catch(IOException e){
            System.out.println("error: the file is not varible");
        }
        
        
    }
    
}
