import java.util.concurrent.ThreadLocalRandom;

public class App {
    public static void main(String[] args) throws Exception{
        String [] selecionados = selecaoCandidatos();
        ligarParaCandidato(selecionados);
    }
    

    static void analisarCandidatos (double salarioPrentendido){
        double salarioBase = 2000.0;
        if (salarioBase > salarioPrentendido){
            System.out.println("ligar para o candidato");
        }
        else if (salarioBase == salarioPrentendido){
            System.out.println("ligar para o candidato com contra proposta");
        } 
        else {
            System.out.println("Aguardando o resultado dos demais candidatos");
        }
    }


    static String[] selecaoCandidatos() {
        String[] candidatos = {
            "Alice", "Bob", "Charlie", "David", "Eva",
            "Frank", "Grace", "Hannah", "Isaac", "Jack",
            "Kathy", "Leo", "Mia", "Nina", "Oscar"
        };

        int candidatosSelecionados = 0;
        int candidatosAtual =  0;
        double salarioBase = 2000.0;
        String[] selecionados = new String[5];

        while(candidatosSelecionados < 5){
            String candidato = candidatos[candidatosAtual];
            double salarioPrentendido = valorPretendido();

            System.out.println("O candidato " + candidato + " solicitou este valor de salário " + salarioPrentendido);
            if(salarioBase >= salarioPrentendido){
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga\n");
                selecionados[candidatosSelecionados] = candidato;
                candidatosSelecionados++;
            }else{
                System.out.println("O candidato " + candidato + " não foi selecionado para a vaga\n");
            }

            candidatosAtual++;
        }

        imprimirSelecionados(selecionados);
        return selecionados;
    }


    static void imprimirSelecionados(String[] selecionados){
        System.out.println("Os candidatos selecionados são: ");
        /*
        Outra forma de fazer o for:
        for (String candidato : selecionados){
            System.out.println(candidato);
        }
         */

        for(int i = 0; i < selecionados.length; i++){
            System.out.println(selecionados[i] + "\n");
        }
    }


    static double valorPretendido(){
        double valor = ThreadLocalRandom.current().nextDouble(1800.0, 2200.0);
        valor = Math.round(valor * 100.0) / 100.0;
        return valor;
    }

    static void ligarParaCandidato(String [] selecionados){
        int sorteio;
        int contador = 0;
        for(int i = 0; selecionados.length>0; i++){
            for(int j = 0; j < 3; j++){
                System.out.println("Ligando para o candidato " + selecionados[i]);
                sorteio = numeroAleatorio();
                contador++;
                if(sorteio == 2){
                    System.out.println("Contato com o candidato na " + contador + "º tentativa\n");
                    contador = 0;
                    break; 
                }
                else if (sorteio == 1) {
                    System.out.println("Candidato(a) " + selecionados[i] + " não atendeu\n");
                }else if( contador == 3 || contador > 3){
                    System.out.println("não conseguimos contato com o candiadato " + selecionados[i] + "\n");
                }
            }

        }
    }


    static int numeroAleatorio(){
        int valor= 0;
        for (int i = 0; i < 2; i++){
            valor = ThreadLocalRandom.current().nextInt(1, 3);
        }
        return valor;
    }
}
