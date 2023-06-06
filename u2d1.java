package u2d1;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class U2D1 {

       public static void main(String[] args) throws IOException {
           // create file
           File file1 = new File("MyText.txt");
           // create file writer class
           FileWriter fw = new FileWriter(file1);
           // create a print writer class
           PrintWriter pw = new PrintWriter(fw);
           // write name to file
           pw.println("Nathaniel");
           // write date to file
           pw.println("April 22, 2021");
           //close
           pw.close();
    }
    
}
