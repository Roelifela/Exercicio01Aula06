package br.com.digitalhouse;

public class Exercicio1 {

    public static void main(String[] args) {

        Cliente rodrigo = new Cliente("Rodrigo", "Cordeiro");
        //rodrigo.setNome("Rodrigo");
        //rodrigo.setSobrenome("Cordeiro");
        Cliente eliza = new Cliente("Eliza", "Tajiri");
        //eliza.setNome("Eliza");
        //eliza.setSobrenome("Tajiri");

        Conta contaRodrigo = new Conta("CC-RODRIGO", 100000.00, rodrigo);
        //contaRodrigo.setConta("CC-RODRIGO");
        //contaRodrigo.setSaldo(100000.50);
        //contaRodrigo.setTitular(rodrigo);

        Conta contaEliza = new Conta("CC-ELIZA", 50000.00, eliza);
        //contaEliza.setConta("CC-ELIZA");
        //contaEliza.setSaldo(50000.00);
        //contaEliza.setTitular(eliza);


        contaRodrigo.deposito(100.00);
        contaEliza.saque(90000.00);

    }

}
