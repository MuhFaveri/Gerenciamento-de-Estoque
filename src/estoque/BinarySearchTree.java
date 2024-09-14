/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estoque;


public class BinarySearchTree {
    private class Node{
        Produto produto;
        Node left, right;
        
        public Node(Produto produto){
            this.produto = produto;
            left = right = null;
        }
    }
    
    private Node root;
    
    public void inserir(Produto produto){
        root = inserirRecursivo(root, produto);
    }
    
    private Node inserirRecursivo(Node root, Produto produto){
        if(root == null){
            root = new Node(produto);
            return root;
        }
        
        if(produto.getId() < root.produto.getId()){
            root.left = inserirRecursivo(root.left, produto);
        }
        else if(produto.getId() > root.produto.getId()){
            root.right = inserirRecursivo(root.right, produto);
        }
        
        return root;
    }
    
    public Produto buscar(int id){
        return buscarRecursivo(root, id);
    }
    
    private Produto buscarRecursivo(Node root, int id){
        if(root == null || root.produto.getId() == id){
            return root != null ? root.produto : null;
        }
        
        if (id < root.produto.getId()) {
            return buscarRecursivo(root.left, id);
        }
        
        else {
            return buscarRecursivo(root.right, id);
        }
    }
}
