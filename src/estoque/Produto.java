/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estoque;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;
    private int id;
    
    public Produto(String nome, double preco, int quantidade, int id){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        this.id = id;
    }
    
    public String getNome(){return nome;}
    public void setNome(String nome) {this.nome = nome;}
    
    public double getPreco(){return preco;}
    public void setPreco(double preco){this.preco = preco;}
    
    public int getQuantidade(){return quantidade;}
    public void setQuantidade(int Quantidade){this.quantidade = quantidade;}
    
    public int getId() {return id;}
    public void setId(int id) {this.id = id;}
    
    
    public String toString(){
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco + 
                ", quantidade=" + quantidade +
                ", id=" + id +
                '}';
    }
    
}
