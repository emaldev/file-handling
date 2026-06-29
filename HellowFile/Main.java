package HellowFile;
import java.io.File;
import java.util.Scanner;
import java.io.IOException;


public class Main {
    public static void main(String[] arga){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your file name..: ");
        String fileName = input.nextLine();
        try{
        File myFile = new File(fileName);
            if(myFile.createNewFile()){
                System.out.println("Creats File ");
            }else{
                System.out.println("not creats file.");
            }
        }catch(IOException e){
            e.printStackTrace();
        }
        input.close();
    }
    
}
