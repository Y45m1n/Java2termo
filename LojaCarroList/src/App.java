import java.util.*;

import javax.swing.JOptionPane;

public class App {

    public static void main(String[] args) throws Exception {
         List <Carros> listaCarros = new ArrayList<>();
         ArrayList<String> listar = new ArrayList<>();


  boolean aberta = true;
        //cadastrar
        //consultar
        //listar
        //apagar

        JOptionPane.showMessageDialog(null,"Bem vindos à garagem de carros");
        
        while (aberta) {
            int acao = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma ação:"
                            + "\n 1-Cadastrar Carro;"
                            + "\n 2-Listar Carros;"
                             + "\n 3-Consultar Carro;"
                              + "\n 4-Apagar Carro;"
                               + "\n 5-Sair;"));
                              
                              
                              
      if (acao == 1) {    
     Carros c = new Carros();
     c.setAno(JOptionPane.showInputDialog("Informe o Ano do carro: "));
     c.setCor(JOptionPane.showInputDialog("Informe a cor do carro: "));
     c.setMarca(JOptionPane.showInputDialog("Informe a marca do carro: "));
     c.setModelo(JOptionPane.showInputDialog("Informe o modelo do carro: "));
     listaCarros.add(c);
    }else if (acao == 2){
    for (Carros carros : listaCarros) {
        listar.add(listaCarros.indexOf(carros)+ carros.getMarca()+","+carros.getModelo()+ "\n");
    }
    JOptionPane.showMessageDialog(null, listar);
    listar.clear();
    } else if(acao == 3){ 
        int indexCarros = Integer.parseInt(JOptionPane.showInputDialog("Informe o Índice do Carro que Deseja Consultar"));
    JOptionPane.showMessageDialog(null, listaCarros.get(indexCarros).getAno()+"\n"
                                                        +listaCarros.get(indexCarros).getMarca()+"\n"
                                                        +listaCarros.get(indexCarros).getModelo()+"\n"
                                                        +listaCarros.get(indexCarros).getCor()+"\n");
}
else if(acao == 4){
    int indexCarros = Integer.parseInt(JOptionPane.showInputDialog("Informe o Índice do Carro que Deseja Apagar"));
    listaCarros.remove(indexCarros);
}else if(acao==5){
    aberta=false;

}
}
    }
}