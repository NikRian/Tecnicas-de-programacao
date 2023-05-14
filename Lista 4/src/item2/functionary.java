package item2;

public class functionary {

    private String firstName, secondName;
    private double mensalSalary;

    public functionary(String firstName, String secondName, double mensalSalary) {
        this.firstName = firstName;

        this.secondName = secondName;

        if(mensalSalary > 0) {
            
            this.mensalSalary = mensalSalary;
        } else {
            this.mensalSalary = 0;
        }
    }

    public double getAnualSalary() {
        
        double anualSalary = mensalSalary * 12;
        
        return anualSalary;
    }

    public double getBonusSalary() {
        
        double bonusSalary = getAnualSalary(), bonus = bonusSalary * 1/10;

        bonusSalary += bonus;

        return bonusSalary;
    }

    public void printInfo() {

        System.out.println("\nNome: "+firstName+" "+ secondName+"\nSalário mensal: R$ "+mensalSalary+"\nSalário anual sem bonificação: R$ "+getAnualSalary() + "\nSalário anual com bonificação: R$ "+ getBonusSalary());
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setMensalSalary(double mensalSalary) {
        this.mensalSalary = mensalSalary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public double getMensalSalary() {
        return mensalSalary;
    }
}

