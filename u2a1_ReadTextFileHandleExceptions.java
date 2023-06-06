package u2a1_readtextfilehandleexcep;

import java.util.Scanner;

/**
 *
 * @author douglassfamily
 */
public class U2A1_ReadTextFileHandleExcep {

    public static void main(String[] args) throws Exception {
        
        //pull from courses file
        java.io.File file = new java.io.File("courses.txt");
        
        //import scanner 
        Scanner input = new Scanner(file);
        
        while(input.hasNext()) {
            String code = input.next();
            int creditHours = input.nextInt();
            String title = input.nextLine();
            
            System.out.println("Course Code = " + code + " | " + "Credit Hours = " + creditHours + " | " + "Course title = " + title);
        }
        
        input.close();
    }
    
}
