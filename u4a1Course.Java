package u4a1;

public class Course {
    
    private String code = "";
    private boolean isRegisterdFor = false;
    
    public Course(String code){
        this.code = code;
    }
 
    public void setCode(String code){
        this.code = code;
    }
    
    public String getCode() {
        return this.code;
    }
    
    public void setIsRegisteredFor(boolean trueOrFalse){
        this.isRegisterdFor = trueOrFalse;
    }
    
    public boolean getIsRegisteredFor() {
        return this.isRegisterdFor;
    } 
    
    @Override
    public String toString(){
        return this.getCode();
    }
}
