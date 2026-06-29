import java.io.File;

public class GetInformation {
    public static void main(String[] args){

        File myFile = new File("shopinngList.txt");
        if(myFile.exists()){
            System.out.println("The file name is: " + myFile.getName());
            System.out.println("The file writable: " + myFile.canWrite());
            System.out.println("The file is Redeble: " + myFile.canRead());
            System.out.println("The file size is: " + myFile.length() + "-Bite.");
             System.out.println("The file path is: " + myFile.getAbsolutePath());
        }else{
            System.out.println("The file is not exist.");
        }
    }
    
}
