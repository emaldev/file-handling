
import java.io.IOException;
import java.io.File;
public class Main{
    public static void main(String[] args){
try{
      File myfile = new File("fiemy.text");
      if(myfile.createNewFile()){
        System.out.println("File is created: " + myfile.getName());
      }else{
           System.out.println("File is alreedy exist.");
      }
    }catch(IOException e){
        System.out.println("An erro occurred .");
    }
    }
}