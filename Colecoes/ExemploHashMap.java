package Colecoes;

import java.util.HashMap;

import javax.swing.JOptionPane;

public class ExemploHashMap {
    
    HashMap<String,String> capitalEstado = new HashMap<>();

    public void teste(){
    
        //incluido elementos na lista (Chave/Valor)
        capitalEstado.put("SP", "São Paulo");
        capitalEstado.put("RJ", "Rio de Janeiro");
        capitalEstado.put("MG","Belo Horizonte");
        capitalEstado.put("ES","Vitória");

        //buscando um valor pela chave
        System.out.println(capitalEstado.get("ES"));

        for (String i : capitalEstado.keySet()) {
            System.out.println(i + ": " + capitalEstado.get(i));
        }


    }

    







}
