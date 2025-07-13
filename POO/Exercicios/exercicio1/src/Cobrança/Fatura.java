package Cobrança;

public class Fatura {
    private String numero;
    private String descricao;
    private int quant_comprada_do_item;
    private double preco_item;

    public Fatura() {
    }

    public Fatura(String numero, String descricao, int quant_comprada_do_item, double preco_item) {
        this.numero = numero;
        this.descricao = descricao;
        this.quant_comprada_do_item = quant_comprada_do_item;
        this.preco_item = preco_item;
    }


//  setters
    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setQuant_comprada_do_item(int quant_comprada_do_item) {
        this.quant_comprada_do_item = quant_comprada_do_item;
    }

    public void setPreco_item(double preco_item) {
        this.preco_item = preco_item;
        if(this.preco_item < 0){
            this.preco_item = 0.0;
        }
    }


//    getters
    public String getNumero() {
        return numero;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getQuant_comprada_do_item() {
        return quant_comprada_do_item;
    }

    public double getPreco_item() {
        return preco_item;
    }

//  métodos

   double getTotalFatura(){
       double valorFatura = getPreco_item() * getQuant_comprada_do_item();
       System.out.println("verificando fatura");
        if (valorFatura > 0){
            System.out.println("verificando fatura");
            return valorFatura;
        }
        else {
            System.out.println("comando inválido! \nalgo não deu certo. Certifique-se de inserir um valor válido.");
            return 0;
        }
   }



}
