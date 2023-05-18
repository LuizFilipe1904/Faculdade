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
public class Dealer extends JogadorMetodos {

    

    @Override
    public void comprarCarta(Carta carta) {
        maoJogador.add(carta);
    }

    @Override
    public void comprarCartas(ArrayList<Carta> cartas) {
        maoJogador.addAll(cartas);
    }

    @Override
    public void exibirMao() {
        Collections.sort(maoJogador);
        System.out.println(maoJogador);    }
    
}
