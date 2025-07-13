package Cobrança;

public class FaturaTeste {
    public static void main(String[] args){
        Fatura minhafatura = new Fatura();

        minhafatura.setNumero("765942");
        minhafatura.setDescricao("teclado redDragon");
        minhafatura.setQuant_comprada_do_item(2);
        minhafatura.setPreco_item(89.90);

        System.out.println(minhafatura.getTotalFatura());
    }
}