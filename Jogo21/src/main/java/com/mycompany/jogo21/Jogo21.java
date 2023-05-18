/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.jogo21;
import com.mycompany.jogo21.base.*;
import java.util.Scanner;



public class Jogo21 {
    
   

    public static void main(String[] args) {
        
        System.out.println("Bem vindo ao jogo de 21!");
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o nome do jogador: ");
        String nome = scan.nextLine();
       
        System.out.println("Inicando...");
        Player jogador = new Player(nome);
        Dealer dealer = new Dealer();
        
        //Gera e embaralha o baralho
        BaralhoMetodos baralho = new BaralhoMetodos();
        baralho.gerarBaralho();
        baralho.embaralhar();
        
        //Distribuição de cartas iniciais
        
        //Distribui as cartas do jogador
        jogador.comprarCartas(baralho.darCartas());
        jogador.exibirMao();
        System.out.println("Você somou: " + jogador.somarValores());
        
        
        //Distribui as cartas do dealer
        dealer.comprarCartas(baralho.darCartas());
        
        
        //Opções do jogador após receber as cartas
        int opcao;
        System.out.println("Escolha o que deseja fazer: ");
        System.out.println("1 - Comprar mais uma carta");
        System.out.println("2 - Não fazer nada");
        opcao = scan.nextInt();
        
        while (true) {            
            if(opcao == 1){
                System.out.println("Você comprou a carta: " + baralho.cartas.get(0));
                jogador.comprarCarta(baralho.darCarta());
                jogador.exibirMao();
                System.out.println("Você somou: " + jogador.somarValores());
                break;
            }else if (opcao == 2){
                System.out.println("Foi escolhido não fazer nada");
                break;
            }else{
                System.out.println("Opção inválida, tente novamente");
            }
        }
        
        //Exibe as cartas e a soma do dealer
        dealer.exibirMao();
        System.out.println("O dealer somou: " + dealer.somarValores());
        
        //Resultados
        int valorJogador = jogador.somarValores();
        int valorDealer = dealer.somarValores();
        
        //Blackjack
        if(valorJogador == 21){
            System.out.println("Você fez um Blackjack!");
        }
        if(valorDealer == 21){
            System.out.println("O dealer fez um Blackjack!");
        }
        
        //Derrotas
        if(valorJogador > 21){
            System.out.println("Sua soma ultrapassou vinte um. Rodada perdida!");
        }
        if(valorDealer > 21){
            System.out.println("A soma da casa ultrapassou vinte um. Derrota da casa!");
        }
        
        //Vitórias e empate
        if(valorJogador > valorDealer && valorJogador < 21){
            System.out.println("Você venceu a rodada!");
        }else if(valorDealer > valorJogador && valorDealer < 21){
            System.out.println("Você perdeu a rodada!");
        }else{
            System.out.println("Você e a casa ficaram empatados!");
        }  
    }
}
