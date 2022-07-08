package br.com.joao.search;

import java.util.Random;
public class Main {
    // Binary Search
    public static void main(String[] args) {

        // Parametros
        int tentativas = 10;
        int qtdTentativas = 0;
        int min = 1;
        int max = 200;

        // Gera numero aleatorio
        Random gerador = new Random();
        int num = gerador.nextInt(min, max);
        System.out.println("Número Sorteado: " + num);

        // Tentativas acertar o numero
        while(tentativas > 0){
            qtdTentativas += 1;
            int aleatorio = gerador.nextInt(min, max);
            System.out.println("Número: " + aleatorio);

            if(aleatorio == num){
                System.out.println("Acertou o número sorteado: " + aleatorio);
                System.out.println("Tentativas: " + qtdTentativas);
                break;
            }else{
                if(aleatorio > num){
                    max = aleatorio;
                }else{
                    min = aleatorio;
                }
                tentativas -= 1;
            }
        }
    }
}
