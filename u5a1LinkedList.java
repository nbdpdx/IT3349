package u5a1.linkedlist;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author douglassfamily
 */
public class U5A1LinkedList {

    public static void main(String[] args) {

        // Create Scanner
        Scanner scanner = new Scanner(System.in); 
        
        // Create LinkedList
        List courses = new LinkedList(); 
        // Create Strings to store each line and each set of code
        String lines;
        String[] sets; 
        
        // Print out prompt for user
        System.out.println("\nEnter 3 collections of course codes, one collection per line:"); 
            
            for(int i = 0; i < 3; i++) {
                // Define lines and sets entered by user
                lines = scanner.nextLine(); 
                sets = lines.split(" ");
                // Create LinkedList input
                courses.addAll(Arrays.asList(sets));
                // Sort LinkedList 
                Collections.sort(courses);
                // Print out number of Courses
                System.out.print("\nSize: " + courses.size() + '\n' + "Sorted: ");
            
            //print sorted items
            for(int j = 0; j < courses.size(); j++) {
                System.out.print(courses.get(j) + " "); 
            }
                System.out.println('\n');
                // Clear for next set of courses w/o this it just adds up all courses input
                courses.clear();
        } 
    }
}
