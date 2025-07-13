import interfaces.aparelhoTelefonico;
import interfaces.navegador;
import interfaces.reprodutorMusical;

public class iPhone implements aparelhoTelefonico, reprodutorMusical, navegador {
    String user;

    public iPhone(String user) {
        this.user = user;
    }

    public void home(){
        System.out.println("Bem vindo " + this.user + "!");
    }

    @Override
    public void tocar(){
        System.out.println("tocando...");
    }

    @Override
    public void pausar() {
        System.out.println("musica pausada");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("escolha sua musica: ");
    }

    @Override
    public void ligar() {

    }

    @Override
    public void atender() {

    }

    @Override
    public void iniciarCorreioVoz() {

    }

    @Override
    public void exibirPagina() {

    }

    @Override
    public void adicionarNovaAba() {

    }

    @Override
    public void atualizarPagina() {

    }
}

