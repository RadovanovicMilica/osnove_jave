package d18_09_2023;

public class EmailValidator extends Validator{
    private String email;

    public EmailValidator(String email) {
        this.email = email;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    @Override
    public void validate(ValidationResult validationResult) {
       String rezultat= "Email is invalid";
        if (!this.email.contains("@") && (!this.email.contains(".com") || !this.email.contains(".net"))) {
            validationResult.addError(rezultat);
        }
    }
}
