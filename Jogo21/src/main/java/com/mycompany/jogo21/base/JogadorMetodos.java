/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jogo21.base;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author aluno
 */
public class JogadorMetodos extends Jogador {
    
  

    public ArrayList<Carta> getMaoJogador() {
        return maoJogador;
    }

    public int getNumCartas() {
        return numCartas;
    }

    
   
    /**
     * Adiciona uma carta do baralho para a mão do jogador
     * @param carta 
     */
    @Override
    public void comprarCarta(Carta carta) {
        maoJogador.add(carta);
    }
    
    
    /**
     * Adiciona uma lista de cartas para a mão
     * @param cartas 
     */
    @Override
    public void comprarCartas(ArrayList<Carta> cartas) {
        maoJogador.addAll(cartas);  
    }
    
    /**
     * Exibe a mao do jogador
     */
    @Override
    public void exibirMao() {
        Collections.sort(maoJogador);
        System.out.println(maoJogador);
    }
    
    
    /**
     * Soma o valor das cartas na mão do jogador 
     * @return 
     */
    @Override
    public int somarValores() {
        for(Carta carta : maoJogador){
            return carta.getPontuacao();
        }
    }

   
    
   

 
}
