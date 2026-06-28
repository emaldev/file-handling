import java.io.IOException;
import java.io.File;
import java.util.Scanner;

public class ShopingList {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the file Name: ");
        String fileName = input.nextLine();

        try{
         File myFile = new File(fileName);
            if(myFile.createNewFile()){
                System.out.println("Create file");
            }else{
                System.out.println("File is not creat...");
            }

        }catch(IOException e){
            System.out.println("File is not found ...");
            e.printStackTrace();
        }

    }
    
}

