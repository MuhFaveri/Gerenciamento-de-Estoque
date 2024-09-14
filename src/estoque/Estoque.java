/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estoque;

import java.util.ArrayList;


public class Estoque {
   
    private ArrayList<Produto> produtos = new ArrayList<>();

    
    public void adicionarProduto(Produto p) {
        produtos.add(p);              
        insertionSortPorNome();       
    }
    
    private void insertionSortPorNome() {
        
        for (int i = 1; i < produtos.size(); i++) {
            Produto key = produtos.get(i);       
            int j = i - 1;

            
            while (j >= 0 && produtos.get(j).getNome().compareTo(key.getNome()) > 0) {
                produtos.set(j + 1, produtos.get(j)); 
                j = j - 1;
            }
            
            produtos.set(j + 1, key);
        }
    }
    
    public void listarProdutosPorNome() {
        for (Produto p : produtos) {
            System.out.println(p.getNome() + " - R$" + p.getPreco());  
        }
    }
    
    public void listarProdutosPorPreco() {
        selectionSortPorPreco();   
        for (Produto p : produtos) {
            System.out.println(p.getNome() + " - R$" + p.getPreco());  
        }
    }

    private void selectionSortPorPreco() {
        int n = produtos.size();  

        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;  

            
            for (int j = i + 1; j < n; j++) {
                if (produtos.get(j).getPreco() < produtos.get(minIdx).getPreco()) {
                    minIdx = j;  
                }
            }

            Produto temp = produtos.get(minIdx);
            produtos.set(minIdx, produtos.get(i));
            produtos.set(i, temp);
        }
    }
}
