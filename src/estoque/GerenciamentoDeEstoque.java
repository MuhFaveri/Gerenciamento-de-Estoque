/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estoque;


public class GerenciamentoDeEstoque {

    
    public static void main(String[] args) {
       
        Estoque estoque = new Estoque();
        BinarySearchTree bst = new BinarySearchTree();
        
        
        Produto produto1 = new Produto("Manto do Flamengo", 350.00, 10, 101);
        Produto produto2 = new Produto("Bone MuchoLoko", 50.00, 25, 102 );
        Produto produto3 = new Produto("Tenis do Skate", 100.00, 30, 103);
        
        estoque.adicionarProduto(produto1);
        estoque.adicionarProduto(produto2);
        estoque.adicionarProduto(produto3);
        
        bst.inserir(produto1);
        bst.inserir(produto2);
        bst.inserir(produto3);
        
        System.out.println("\nProdutos ordenados por nome:");
        estoque.listarProdutosPorNome();
        
        System.out.println("\nProdutos ordenados por preco:");
        estoque.listarProdutosPorPreco();
        
        System.out.println("\nBuscando produto por ID:");
        Produto busca = bst.buscar(101);
        if(busca != null){
            System.out.println("Produto encontrado: " + busca.getNome() + " - R$" + busca.getPreco());
        } else {
            System.out.println("Produto não encontado.");
        }
        
    }
    
}

