package d18_09_2023;

public class PasswordValidator extends Validator {
    private String password;

    public PasswordValidator(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public void validate(ValidationResult validationResult) {
        if (!this.password.contains("#") && !this.password.contains("@")
                && !this.password.contains("/") && !this.password.contains("*")) {
            validationResult.addError("Password mora sadrzati barem jedan od specijalnih karaktera");
        }
        if (this.password.length() < 8) {
            validationResult.addError("Password mora imati minimum 8 karaktera");
        }
        boolean velikoSlovo = false;
        int i = 0;
        while (!velikoSlovo && i < this.password.length()) {
            char trenutniKarakter = password.charAt(i);
            if (trenutniKarakter >= 'A' && trenutniKarakter <= 'Z') {
                velikoSlovo = true;
            }
            i++;
        }
        boolean maloSlovo = false;
        int m = 0;
        while (!maloSlovo && m<this.password.length()){
            char trenutniKarakter = password.charAt(m);
            if (trenutniKarakter >= 'a' && trenutniKarakter <= 'z') {
                maloSlovo = true;
        }
            m++;
    }
}}
