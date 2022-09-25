import java.io.*;

public class Q608 {
    public static void main(String[] args) throws FileNotFoundException {
        try{
            FileReader fr = new FileReader("hell.txt");
        }
        catch(FileNotFoundException f){
            System.out.println("File Not Found");
        }
    }
}
