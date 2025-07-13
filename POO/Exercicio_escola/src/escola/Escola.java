package escola;

public class Escola {
    public static void main(String [] args) throws Exception{
        Aluno lucas = new Aluno(); //instanciamento com construtor vazio
//      Aluno lucas = new Aluno("felipe", 15); //instanciamento com atribuição de valores direto no construtor
        lucas.setName("Lucas");
        lucas.setYearsOld(23);

        System.out.println("O Aluno " + lucas.getName() + " tem " + lucas.getYearsOld() + " anos.");
    }
}
