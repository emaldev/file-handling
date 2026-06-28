import java.util.Scanner;
import java.io.IOException;
import java.io.FileWriter;

public class ShopWri {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Write your shopping  note.............");
        String note;
        try(FileWriter myFileWriter = new FileWriter("shopinngList.txt", true)){
        for(int i = 1; i <= 3; i++){
            note = input.nextLine();
           
           
            myFileWriter.write(note + "\n");
             
        }

        }catch(IOException e){
            e.printStackTrace();
        }
    }
    
}
