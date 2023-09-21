package d18_09_2023;

import java.util.ArrayList;

public class ValidationResult {
    private boolean hasErrors;
    private ArrayList<String> errors;

    public ValidationResult() {
    }
    public boolean isHasErrors() {
        return hasErrors;
    }
    public ArrayList<String> getErrors() {
        return errors;
    }
    public void addError(String error){
        this.hasErrors= true;
        errors.add(error);
    }
    public void stampaj(){
            for(int i=0; i< errors.size(); i++){
                if (hasErrors){
                    System.out.println(errors.get(i));
                }else {
                    System.out.println("No validation errors.");
            }
        }

    }
}
