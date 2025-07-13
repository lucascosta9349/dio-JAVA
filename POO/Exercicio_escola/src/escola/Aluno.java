package escola;

public class Aluno {
    private String name;
    private int yearsOld;

    public Aluno() {
    }

    public Aluno(String name, int yearsOld) {
        this.name = name;
        this.yearsOld = yearsOld;
    }

    //    Setters
    public void setName(String newName) {
        this.name = newName;
    }

    public void setYearsOld(int newYearsOld) {
        this.yearsOld = newYearsOld;
    }

//    Getters
    public int getYearsOld() {
        return yearsOld;
    }

    public String getName() {
        return name;
    }
}
