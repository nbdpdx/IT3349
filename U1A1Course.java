package u1a1;

public class Course {
  //new class to store attributes
  String code;
  int creditHours;
  String title;
  String name;
  
  //create constructor
  Course(String code, int creditHours, String title, String name){
      //set attributes to equal one at the top to one in the parameter
      this.code = code; 
      this.creditHours = creditHours;
      this.title = title;
      this.name = name;
}
  //Use toString to feed info into constructor on main 
  public String toString() {
    return "Java class name = " + name + " " + "Course Code = " + code;
  }
}
