import java.io.*;
import java.util.*;

public class test {
    public static void main(String[] args) throws FileNotFoundException {
      try{
        FileReader fr =new FileReader("file.txt");
      }
      catch(FileNotFoundException e){
          System.out.println("We");
      }
    }
}
