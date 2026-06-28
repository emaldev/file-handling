import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class FileNote {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter File name ....: ");
        String fileName = input.nextLine();
        try{
            File myfileObj = new File(fileName);
            if(myfileObj.createNewFile()){
                System.out.println("The is my file " + myfileObj.getName());
            }else{
                System.out.println("the file is note creat....");
            }
        }catch(IOException e){
            System.out.println("This file is not created ");
            
        }
    }
    
}
