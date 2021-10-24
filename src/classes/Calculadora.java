package classes;

import javax.swing.JOptionPane;

public class Calculadora {

    //ATRIBUTOS
    private double memo;

    //GETS e SETS
    public double getMemo() {
        return memo;
    }

    public void setMemo(double memo) {
        this.memo = memo;
    }

    //CONSTRUTOR
    public Calculadora() {

    }

    //MÉTODOS - OPERAÇÕES BÁSICAS
    public double somar(double n1, double n2) {

        return n1 + n2;
    }

    public double subtrair(double n1, double n2) {

        return n1 - n2;
    }

    public double multiplicar(double n1, double n2) {

        return n1 * n2;
    }

    public double dividir(double n1, double n2) {
        double total = 0;

        if (n2 == 0) {
            JOptionPane.showMessageDialog(null, "Operação Inválida !!");
            total = 0;
        } else {
            total = n1 / n2;
        }

        return total;
    }

    //MÉTODOS - FÓRMULAS MATEMÁTICA
    public double raizQuadrada(double n1) {

        return Math.sqrt(n1);
    }

    public double potencia(double n1, double n2) {

        return Math.pow(n1, n2);
    }

    public double elevadoQuadrado(double n1) {

        return Math.pow(n1, 2);
    }
    
    public double elevadoCubo(double n1) {

        return Math.pow(n1, 3);
    }
    
    public double elevadoDecima(double n1) {

        return Math.pow(n1, 10);
    }

    public double porcentagem(double n1, double n2, String sinal2) {
       
        double total = 0;
        
        if("+".equals(sinal2)){
            total = n1 + n2;
        }else if ("-".equals(sinal2)){
            total = n1 - n2;
        }else if ("*".equals(sinal2)){
            total = n1 * n2;
        }else if ("/".equals(sinal2)){
            total = n1 / n2;
        }
        
        return total;
    }
    
     public double e(double n1, double n2, String sinal2) {
       
        double total = 0;
        
        if("+".equals(sinal2)){
            total = n1 + n2;
        }else if ("-".equals(sinal2)){
            total = n1 - n2;
        }else if ("*".equals(sinal2)){
            total = n1 * n2;
        }else if ("/".equals(sinal2)){
            total = n1 / n2;
        }
        
        return total;
    }
     
    public double exp(double n1){
        
        return Math.exp(n1);
    }
    
    public double log(double n1){
        
        return Math.log(n1);
    }

    public double fatorial(double n1) {

        int fatorial = 1;
        double cont = n1;

        while (cont >= 1) {

            fatorial *= cont;
            cont--;
        }

        return fatorial;
    }

    public double resto(double n1) {
        double resto = n1 % 2;

        return resto;
    }

    public double pi(double n1, double n2, String sinal2) {

        double total = 0;

        if ("+".equals(sinal2)) {
            total = n1 + n2;
            
        }else if ("-".equals(sinal2)) {
            total = n1 - n2;
            
        }else if ("*".equals(sinal2)) {
            total = n1 * n2;
            
        }else if ("/".equals(sinal2)) {
            total = n1 / n2;
            
        }
        
        return total;
    }

    //MÉTODOS - MEMÓRIA
    public void memoMais(double total) {

        memo += total;

    }

    public void memoMenos(double total) {

        memo -= total;
    }

    public double mostrarMemo() {

        return memo;
    }

    public double limparMemo() {

        return memo = 0;
    }

}
