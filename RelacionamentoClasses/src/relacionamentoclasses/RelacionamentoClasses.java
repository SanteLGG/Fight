/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package relacionamentoclasses;

/**
 *
 * @author luisg
 */
public class RelacionamentoClasses {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Lutador l[];
        l = new Lutador[6];
        l[0] = new Lutador ("lutador1", "França", 31, 1.75f, 68.9f, 11, 2 ,1);
        
        l[1] = new Lutador ("Lutador2", "Brasil", 29, 1.68f, 57.8f, 14, 2 ,3);
        
        l[2] = new Lutador ("lutador3", "Estados Unidos", 35, 1.65f, 80.9f, 13, 0 ,2);
        
        l[3] = new Lutador ("lutador4", "Austrália", 28, 1.93f, 81.6f, 13, 0, 2);
        
        l[4] = new Lutador ("lutador5", "Brasil", 37, 1.70f, 119.3f, 5, 4, 3);
        
        l[5] = new Lutador ("Lutador6", "Estados Unidos", 30, 1.81f, 105.7f, 12, 2, 4);
        
        Luta UEC01 = new Luta();
        UEC01.marcarLuta(l[1], l[0]);
        UEC01.lutar();
        l[1].status();
        l[0].status();
    }
    
}
