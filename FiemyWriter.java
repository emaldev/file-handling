import java.io.IOException;
import java.io.FileWriter;
import java.util.Scanner;

public class FiemyWriter {
    public static void main(String[] args){
        Scanner input  = new Scanner(System.in);
        System.out.println("Enter your text............");
        String text = input.nextLine();
        try(FileWriter myfile = new FileWriter("feimy.text", true)){
            
            myfile.write(text);
            myfile.write("\n هی سلام خوبی چی خبر حالت خوب است بیا این هم یک فایل در جاوا ");

        }catch(IOException e ){
            e.printStackTrace();
        }
    }
    
}
