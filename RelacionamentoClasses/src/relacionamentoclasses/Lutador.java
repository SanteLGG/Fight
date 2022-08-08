/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package relacionamentoclasses;

/**
 *
 * @author luisg
 */
public class Lutador {
    //atributos
    private String nome, nacionalidade, categoria;
    private float altura, peso;
    private int idade, vitorias, derrotas, empates;

    Lutador() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   
    //metodos
    public void apresentar(){
        System.out.println("=-=-=-=-=-=-=-=-=-=");
        System.out.println("Lutador: " + this.getNome());
        System.out.println("Oridegem: " + this.getNacionalidade());
        System.out.println("idade: " + this.getIdade() + " anos");
        System.out.println("Mede: " + this.getAltura() + "m de Altura");
        System.out.println("Pesa: " + this.getPeso() + " Kg");
        System.out.println("Vitorias: " + this.getVitorias());
        System.out.println("Derrotas: " + this.getDerrotas());
        System.out.println("Empates: " + this.getEmpates());
    }
    public void status(){
        System.out.println("=-=-=-=-=-=-=-=-=-=");
        System.out.println(this.getNome());
        System.out.println("É um peso " + this.getCategoria());
        System.out.println(this.getVitorias() + " vitórias!");
        System.out.println(this.getDerrotas() + " derrotas!");
        System.out.println(this.getEmpates() + " empates!");

    }
    public void ganharLuta(){
        this.setVitorias(this.getVitorias ()+1);
    }
    public void perderLuta(){
        this.setDerrotas(this.getDerrotas ()+1);
    }
    public void empatarLuta(){
        this.setEmpates(this.getEmpates ()+1);
    }
    
    //metodo construtor
    public Lutador(String no, String na, int id, float alt, float pe, int vi, int der, int emp){
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = alt;
        this.setPeso(pe);
        this.vitorias = vi;
        this.derrotas = der;
        this.empates = emp;
    }
    
    //metodos especiais
    public String getNome(){
        return nome;
    }
    public void setNome(String no){
        this.nome = no;
    }
    
    public String getNacionalidade(){
        return nacionalidade;
    }
    public void setNacionalidade(String na){
        this.nacionalidade = na;
    }
    
    public int getIdade(){
        return idade;
    }
    public void setIdade(int id){
        this.idade = id;
    }

    public float getAltura() {
        return altura;
    }
    public void setAltura(float alt) {
        this.altura = alt;
    }
    
    public float getPeso(){
        return peso;
    }
    public void setPeso(float pe){
        this.peso = pe;
        setCategoria();
    }
    
    public String getCategoria(){
        return categoria; 
    }
    private void setCategoria(){
        if (this.peso < 52.2){
            this.categoria = "inválido!";
        } else if (this.peso <= 70.3){
            this.categoria = "leve!";
        } else if (this.peso <= 83.9) {
            this.categoria = "médio!";            
        } else if (this.peso <= 120.2) {
            this.categoria = "pesado!";
        } else {
            this.categoria = "inválido!";
        }
            
    }
    
    public int getVitorias(){
        return vitorias;
    }
    public void setVitorias(int vi){
        this.vitorias = vi;
    }

    public int getDerrotas(){
        return derrotas;
    }
    public void setDerrotas(int der){
        this.derrotas = der;
    }
    
    public int getEmpates(){
        return empates;
    }
    public void setEmpates(int emp){
        this.empates = emp;
    }
    
    
    
    
    
    
    
}
