package Colecoes;

import java.util.LinkedList;

public class ExemploLinkList {

    LinkedList <String> pessoas = new LinkedList<>();

    public void teste(){
   //adiciona normalmente
   pessoas.add("Pedro");
   pessoas.add("Maria");
   pessoas.add("João"); 
   //adiciona na primeira posição
   pessoas.addFirst("Cecilia");
   //remove o ultimo nome
   pessoas.removeLast();
   //imprime a lista
   System.out.println(pessoas);
    }
}
