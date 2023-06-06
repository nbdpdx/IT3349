package u1a1;

public class U1A1_InheritOverridetoString {
    
    public static void main(String[] args) {
       
        //call out course from seperate class and feed into constructor
        Course c1 = new Course("TBD", 3, "TBD", "'Course'");
        Course c2 = new Course("IT2230",  3, "Introduction to Database Systems", "'FlexPathCourse'");
        Course c3 = new Course("ITFP4789", 3, "Mobile Cloud Computing Application Development", "'GuidedPathCourse'");
        
        //print out display from toString method
        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println(c3.toString());
    }
}
