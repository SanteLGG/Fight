/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package relacionamentoclasses;

import java.util.Random;

/**
 *
 * @author luisg
 */
public class Luta {
    //atributos
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
    
    //metodos
    public void marcarLuta(Lutador l1, Lutador l2){
        if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2) {
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;
        } else {
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }
    
    public void lutar(){
        if (this.aprovada){
            System.out.println("=-=- DESAFIADO -=-=");
            this.desafiado.apresentar();
            System.out.println("=-=- DESAFIANTE -=-=");
            this.desafiante.apresentar();
            
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3); // 0 1 2  
            switch(vencedor){
                case 0: //empate
                    System.out.println("=-=- FIM DE LUTA -=-=");
                    System.out.println("Empate!");
                    System.out.println("=-=-=-=-=-=-=-=-=-=-=");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                
                case 1: // desafiado vence
                    System.out.println("=-=- FIM DE LUTA -=-=");
                    System.out.println("Venceu " + this.desafiado.getNome());
                    System.out.println("=-=-=-=-=-=-=-=-=-=-=");
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                
                case 2: //desafiante vence
                    System.out.println("=-=- FIM DE LUTA -=-=");
                    System.out.println("Venceu " + this.desafiante.getNome());
                     System.out.println("=-=-=-=-=-=-=-=-=-=-=");
                    this.desafiado.perderLuta();
                    this.desafiante.ganharLuta();
                    break;
            }
            
        } else {
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=");
            System.out.println("a luta não pode acontecer!");
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        }
    }

    //metodos especiais

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    

}