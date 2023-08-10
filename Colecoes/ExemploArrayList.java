package Colecoes;
import java.util.*;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JOptionPane;

public class ExemploArrayList {
    //criando arraylist
    ArrayList <String> carros = new ArrayList<>();
    public void teste(){
        //adicionando elementos com add 
        carros.add("Fusca");
         carros.add("Brasília");
          carros.add("Chevette");
           carros.add("Monza");
            carros.add("ká");
            //imprimindo lista completa
            System.out.println(carros);
            //ordenando a lista em ordem alfabetica (.sort(Collections))
            Collections.sort(carros);
            System.out.println(carros);
            //ordenando ao contrario
            Collections.reverse(carros);
            System.out.println(carros);
            //percorrer a lista
            for (int i = 0; i < carros.size(); i++) { //não usa mais lenght pq ele percorre o vetor, para arraylist é o size
                System.out.println(carros.get(i));
            }
            //percorrendo a lista com for-each
            for (String i : carros) {
                System.out.println(i);
            }
            //limpando  a lista
            carros.clear();
            System.out.println(carros);
    }
    public void exercicio1(){
    //criar um arraylist de n° inteiros
    //escrever 5 números aleatorios- ordenar e imprimir
     ArrayList <Integer> numeros = new ArrayList<>();
     numeros.add(Integer.parseInt(JOptionPane.showInputDialog("Digite um nº")));
     numeros.add(Integer.parseInt(JOptionPane.showInputDialog("Digite um nº")));
     numeros.add(Integer.parseInt(JOptionPane.showInputDialog("Digite um nº")));
     numeros.add(Integer.parseInt(JOptionPane.showInputDialog("Digite um nº")));
     numeros.add(Integer.parseInt(JOptionPane.showInputDialog("Digite um nº")));
     System.out.println(numeros);
     Collections.sort(numeros);
     System.out.println(numeros);

     //forma mais facil
     for (int i = 0; i < 5; i++) {
        numeros.add(Integer.parseInt(JOptionPane.showInputDialog("Digite um Nº")));
     }
     System.out.println(numeros);
     Collections.sort(numeros);
     System.out.println(numeros);




    }
}
