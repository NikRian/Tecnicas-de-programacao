package item5;

public class contact {

    private int code;
    private String name, email, adress, phoneNumber, obs;

    public contact (int code) {
        verifyCode(code);
    }

    public contact (int code, String name) {

        verifyCode(code);

        this.name = name;
    }

    public contact (int code, String name, String email) {

        verifyCode(code);
  
        this.name = name;
        this.email = email;
    }

    public contact (String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /*private boolean verifyCode(int code) {
        return code >= 1000 && code <= 9999;
    }*/

    private void verifyCode(int code) {

        if(code >= 1000 && code <= 9999) {

            this.code = code;

        } else {

            System.out.println("Código do inválido");
            return;
        }
    }

    public String getEmail() {
        return email;
    }

    public void printInfo() {
            System.out.println("\nCódigo: "+code+"\nNome: "+name+"\nEmail: "+email+"\nNúmero: "+phoneNumber+"\nEndereço: "+adress);
    }
}