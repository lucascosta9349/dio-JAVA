import java.util.Scanner;

public class Contador {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int numero1 = scan.nextInt();

        System.out.println("\nDigite o segundo número: ");
        int numero2 = scan.nextInt();

        try{
            contar(numero1, numero2);
        }
        catch (ParametrosInvalidosException e) {
            System.out.println("Erro:" + e.getMessage());
        }
        finally{
            scan.close();
        }
    }
    static void contar(int numero1, int numero2) throws ParametrosInvalidosException{
        if (numero1 > numero2){
            throw new ParametrosInvalidosException();
        }

        int contador = numero2 - numero1;
        for (int i = 1; i <= contador; i++){
            System.out.println("" + i + "\n");
        }
    }
}
