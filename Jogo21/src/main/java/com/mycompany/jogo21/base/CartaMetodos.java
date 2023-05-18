/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jogo21.base;

/**
 *
 * @author aluno
 */
public class CartaMetodos extends Carta{

    public CartaMetodos() {
    }
    
    
    
    public CartaMetodos(String nipe, String valor) {
        this.nipe = nipe;
        this.valor = valor;
    }

    
    
    
    @Override
    public String getNipe() {
        return nipe;
    }

    @Override
    public String getValor() {
        return valor;
    }

    @Override
    public int getPontuacao() {
        return pontuacao;
    }
    
    int valorInteiro;
    public int transformarValores(){
        
        if(this.valor == "K" || this.valor == "Q" || this.valor == "J" ){
            this.valor = "10";
            valorInteiro = Integer.parseInt(this.valor);
        }else if (this.valor == "A"){
            this.valor = "11";
            valorInteiro = Integer.parseInt(this.valor);
        }else{
            valorInteiro = Integer.parseInt(this.valor);
        }
        return valorInteiro;
    }
    
    public int getValorInteiro(){
        return valorInteiro;
    }
    
  
    @Override
    public void exibir() {
        System.out.println(valorInteiro + " de " + nipe);
    }

   
    
    @Override
    public void setPontuacao(int pontuacao) {
        this.pontuacao = valorInteiro + valorInteiro; 
    }


    
}
