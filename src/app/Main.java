package app;


import model.Cachorro;
import model.Gato;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Gato gato = new Gato("pituxo");
        Cachorro cachorro = new Cachorro("pituco");
        Scanner sc = new Scanner(System.in);
        boolean breaker = true;
        while(breaker) {
            System.out.println("=============== Bem vindo ao sistema! ================");
            System.out.println("Você quer ouvir o barulho do gato ou do cachorro? \n 1 - para gato \n 2 - para cachorro");
            int opcao = sc.nextInt();
            if (opcao == 1) {
                System.out.println(gato.comer());
            } else if (opcao == 2) {
                System.out.println(cachorro.comer());
            } else {
                System.out.println("Opção inválida. Sistema finalizado.");
            }
            System.out.println("Você deseja continuar? \n 1 - para sim \n 2 - para nao");
            int fim = sc.nextInt();
            if (fim == 2) {
                breaker = false;
                System.out.println("Sistema finalizado.");
            }
        }



        }
    }
