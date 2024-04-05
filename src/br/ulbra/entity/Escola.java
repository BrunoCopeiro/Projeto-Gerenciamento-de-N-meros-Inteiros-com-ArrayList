 
package br.ulbra.entity;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.util.Collections;


public class Escola {
    public ArrayList Lista;
    
      public Escola() {
        Lista = new ArrayList();
    }
      // Adicionar
      
        public void adicionar(String item) {
        Lista.add(item);
        JOptionPane.showMessageDialog(null, "Numero salvo!");
    }

      // Listar 
      
       public String listar() {
        String res = "";
        if (!Lista.isEmpty()) {
            for (int i = 0; i < Lista.size(); i++) {
                res += (i + 1) + " - " + Lista.get(i) + " \n ";
            }
        } else {
            res = " Lista Vazia! ";
        }
        return res;
    }

      // Remover
      
       public void excluir(int indice) {
        if (!Lista.isEmpty()) {
            if (indice > 0 && indice <= Lista.size()) {
                Lista.remove(indice - 1);
            
            JOptionPane.showMessageDialog(null, " Excluido ");

        } else {
             JOptionPane.showMessageDialog(null, " Código não existe!");
         }
       }  else {
         JOptionPane.showMessageDialog(null, " Impossivel excluir, a lista está vazia!");

    }
       }
       // Adicionar um número existente com base em seu índice na lista.
       
        public void adicionarNumero(String item) {
        Lista.add(item);
        JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
    } 
      
          public void alterar ( int indice, String novoItem){
            if (!Lista.isEmpty()) {
            if (indice > 0 && indice <= Lista.size()) {
                Lista.set(indice - 1, novoItem);
                  JOptionPane.showMessageDialog(null, " Alterado ");

        } else {
            JOptionPane.showMessageDialog(null, " Código não existe!");
        }
    }  else {
          JOptionPane.showMessageDialog(null, " Impossivel excluir, a lista está vazia!");
        }
    }
          // Ordenar a lista
          
        public void ordenarLista(boolean crescente) {
        if (crescente) {
            Collections.sort(Lista);
        } else {
            Collections.sort(Lista, Collections.reverseOrder());
        }
    }   
     // Exibir a média dos números presentes na lista.
    public double media() {
        if (!Lista.isEmpty()) {
            double soma = 0;
            for (Object item : Lista) {
                soma += Double.parseDouble(item.toString());
            }
            return soma / Lista.size();
        } else {
            JOptionPane.showMessageDialog(null, "  Lista está vazia, xiru!");
            return 0;
        }
    }

    //Mostrar o maior e o menor número na lista.
    public String maiorEMenor() {
        if (!Lista.isEmpty()) {
            Object maior = Collections.max(Lista);
            Object menor = Collections.min(Lista);
            return "Maior número: " + maior.toString() + "\nMenor número: " + menor.toString();
        } else {
            return " Lista está vazia, xiru!";
        }

    }
}
    