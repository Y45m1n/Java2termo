package RevisaoFPOO;

import javax.swing.JOptionPane;

import RevisaoFPOO.Cadastro.Animais;
import RevisaoFPOO.Cadastro.Cachorro;
import RevisaoFPOO.Cadastro.Cobra;
import RevisaoFPOO.Cadastro.Peixe;

public class App {
    public static void main(String[] args) {
       //Animais obj1 = new Animais("medio", 1, "yasmin", "zara", "cachorro");

       Cachorro Cachorro[] = new Cachorro[10];
       Cobra Cobra[] = new Cobra[10];
       Peixe Peixe[] = new Peixe[10];

       boolean aberta = true;
       int cachorro = 0;
       int cobra = 0;
       int peixe = 0;

       while (aberta){
        int acao = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma ação:"
                    + "\n 1-Cadastrar Cachorro;"
                    + "\n 2-Cadastrar Cobra;"
                    +  "\n 3-Cadastrar Peixe;"));
            if (acao == 1) { 
              
              Cachorro[cachorro] = new Cachorro();
              Cachorro[cachorro].setNome(JOptionPane.showInputDialog("Digite o Nome do animal"));
              Cachorro[cachorro].setPorte(JOptionPane.showInputDialog("Informe o Porte do animal"));
              Cachorro[cachorro].setProprietario(JOptionPane.showInputDialog("Informe o nome do proprietario do animal"));
              Cachorro[cachorro].setRaca(JOptionPane.showInputDialog("Informe a raça do cachorro"));
              Cachorro[cachorro].setCor(JOptionPane.showInputDialog("Informe a cor do cachorro"));
              //imprimir
               JOptionPane.showMessageDialog(null, "O Cãozinho " +Cachorro[cachorro].getNome()+ " \n do proprietário " +Cachorro[cachorro].getProprietario()+ " \n foi cadastrado");
              
              cachorro++;

       }else if (acao == 2) {
        Cobra[cobra] = new Cobra();
              Cobra[cobra].setNome(JOptionPane.showInputDialog("Digite o Nome do animal"));
              Cobra[cobra].setPorte(JOptionPane.showInputDialog("Informe o Porte do animal"));
              Cobra[cobra].setProprietario(JOptionPane.showInputDialog("Informe o nome do proprietario do animal"));
              Cobra[cobra].setEspecie(JOptionPane.showInputDialog("Informe a especie da cobra"));
              Cobra[cobra].setVenenoso(JOptionPane.showInputDialog("Informe se o animal é venenoso"));
            
              JOptionPane.showMessageDialog(null, "A cobrinha " +Cobra[cobra].getNome()+ " \n do proprietário " +Cobra[cobra].getProprietario()+ " \n foi cadastrado");

              cobra++;
    
    }else if (acao == 3) {
        Peixe[peixe] = new Peixe();
              Peixe[peixe].setNome(JOptionPane.showInputDialog("Digite o Nome do animal"));
              Peixe[peixe].setPorte(JOptionPane.showInputDialog("Informe o Porte do animal"));
              Peixe[peixe].setProprietario(JOptionPane.showInputDialog("Informe o nome do proprietario do animal"));
              Peixe[peixe].setEspeciePeixe(JOptionPane.showInputDialog("Informe a especie do peixe"));
              Peixe[peixe].setAgua(JOptionPane.showInputDialog("Informe se o peixe é de agua doce ou salgada"));
            
              JOptionPane.showMessageDialog(null, "A cobrinha " +Peixe[peixe].getNome()+ " \n do proprietário" +Peixe[peixe].getProprietario()+ " \n foi cadastrado");
              peixe++;
}
}
    }
}
