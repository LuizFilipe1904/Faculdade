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
public class BaralhoMetodos extends Baralho{

   
    /**
     * Gerar lista de cartas
     */
    @Override
    public void gerarBaralho() {
        for (int i = 0; i < this.nipes.length; i++){
            for (int j = 0; j < this.valores.length; j++){
                Carta c = new CartaMetodos(this.nipes[i], this.valores[j]);
                this.cartas.add(c);
            }
        }
    }
    
   
    ArrayList<Carta> mao = new ArrayList<>();
    
    /**
     * Embaralha as cartas
     */
    @Override
    public void embaralhar() {
        Collections.shuffle(cartas);
        
    }
    
    /**
     * Da uma carta ao jogador
     * @return Carta
     */
    @Override
    public Carta darCarta() {
       mao.add(cartas.get(0));
       Carta novaCarta = cartas.remove(0);
       return novaCarta;
       
    }
    
    /**
     * Distribui as duas primeiras cartas para o jogador
     * @return Carta
     */
    @Override
    public ArrayList<Carta> darCartas() {
        
        for (int i = 0; i == 2; i++){
            mao.add(cartas.get(0));
            cartas.remove(0);
        }
        System.out.println("Sua mão: " + mao);
        return mao;
        
    }
    
    /**
     * Imprime o baralho
     */
    @Override
    protected void exibirBaralho() {
        System.out.println(cartas);
    }
    
    /**
     * Caso o baralho esteja vazio, cria outro
     */
    @Override
    protected void verificarEPreencherBaralho() {
        if(cartas.isEmpty()){
            System.out.println("Baralho vazio, gerando um novo...");
            gerarBaralho();
        }
    }

  
}

    
    

