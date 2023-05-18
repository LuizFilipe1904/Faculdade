/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jogo21.base;

/**
 *
 * @author LENOVO
 */
public abstract class Carta implements Comparable<Carta>{
    
    protected String nipe;
    protected String valor;
    protected int pontuacao;

    public Carta() {
    }

    public Carta(String nipe, String valor, int pontuacao) {
        this.nipe = nipe;
        this.valor = valor;
        this.pontuacao = pontuacao;
    }
    
    
    

    public abstract String getNipe();    
    public abstract String getValor();
    public abstract int getPontuacao();
    public abstract void setPontuacao(int pontuacao);    
    public abstract void exibir();

    @Override
    public int compareTo(Carta carta) {
        return this.valor.compareTo(carta.valor);
    }
    
    
}
