package RevisaoFPOO;

import javax.swing.JOptionPane;

import RevisaoFPOO.Cadastro.Animais;
import RevisaoFPOO.Cadastro.Cachorro;
import RevisaoFPOO.Cadastro.Cobra;
import RevisaoFPOO.Cadastro.Peixe;
import RevisaoFPOO.Horario.AgendaConsulta;

public class App {
        public static void main(String[] args) {
                // Animais obj1 = new Animais("medio", 1, "yasmin", "zara", "cachorro");

                Cachorro Cachorro[] = new Cachorro[10];
                Cobra Cobra[] = new Cobra[10];
                Peixe Peixe[] = new Peixe[10];
                AgendaConsulta Agenda[] = new AgendaConsulta[10];
                Animais animais[] = new Animais[10];

                boolean aberta = true;
                int cachorro = 0; // contador= contCachorro
                int cobra = 0;
                int peixe = 0;
                int contAgenda = 0;
                int contAnimais = 0;

                while (aberta) {
                        int acao = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma ação:"
                                        + "\n 1-Cadastrar Animal;"
                                        + "\n 2-Agendar Horário;"
                                        + "\n 3-Consultar Horário;"));

                        if (acao == 1) {
                                int acaoCadastro = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma ação:"
                                                + "\n 1-Cadastrar Cachorro;"
                                                + "\n 2-Cadastrar Cobra;"
                                                + "\n 3-Cadastrar Peixe;"));

                                if (acaoCadastro == 1) {

                                        Cachorro[cachorro] = new Cachorro();
                                        Cachorro[cachorro].setNome(
                                                        JOptionPane.showInputDialog("Digite o Nome do animal"));
                                        Cachorro[cachorro].setPorte(
                                                        JOptionPane.showInputDialog("Informe o Porte do animal"));
                                        Cachorro[cachorro]
                                                        .setProprietario(JOptionPane.showInputDialog(
                                                                        "Informe o nome do proprietario do animal"));
                                        Cachorro[cachorro].setRaca(
                                                        JOptionPane.showInputDialog("Informe a raça do cachorro"));
                                        Cachorro[cachorro].setCor(
                                                        JOptionPane.showInputDialog("Informe a cor do cachorro"));

                                        JOptionPane.showMessageDialog(null,
                                                        "O Cãozinho " + Cachorro[cachorro].getNome() + " \n de porte "
                                                                        + Cachorro[cachorro].getPorte() + " \n da raça "
                                                                        + Cachorro[cachorro].getRaca()
                                                                        + " \n da (o) propriet\u00E1ria (o) "
                                                                        + Cachorro[cachorro].getProprietario()
                                                                        + " \n foi cadastrado");

                                        cachorro++;
                                } else if (acaoCadastro == 2) {
                                        Cobra[cobra] = new Cobra();
                                        Cobra[cobra].setNome(JOptionPane.showInputDialog("Digite o Nome do animal"));
                                        Cobra[cobra].setPorte(JOptionPane.showInputDialog("Informe o Porte do animal"));
                                        Cobra[cobra]
                                                        .setProprietario(JOptionPane.showInputDialog(
                                                                        "Informe o nome do proprietario do animal"));
                                        Cobra[cobra].setEspecie(
                                                        JOptionPane.showInputDialog("Informe a especie da cobra"));
                                        Cobra[cobra].setVenenoso(
                                                        JOptionPane.showInputDialog("Informe se o animal é venenoso"));

                                        JOptionPane.showMessageDialog(null,
                                                        "A cobrinha " + Cobra[cobra].getNome() + " \n de porte "
                                                                        + Cobra[cobra].getPorte()
                                                                        + " \n da espécie " + Cobra[cobra].getEspecie()
                                                                        + " \n "
                                                                        + Cobra[cobra].getVenenoso()
                                                                        + " \n da (o) propriet\u00E1ria (o) "
                                                                        + Cobra[cobra].getProprietario()
                                                                        + " \n foi cadastrado");

                                        cobra++;

                                } else if (acaoCadastro == 3) {
                                        Peixe[peixe] = new Peixe();
                                        Peixe[peixe].setNome(JOptionPane.showInputDialog("Digite o Nome do animal"));
                                        Peixe[peixe].setPorte(JOptionPane.showInputDialog("Informe o Porte do animal"));
                                        Peixe[peixe]
                                                        .setProprietario(JOptionPane.showInputDialog(
                                                                        "Informe o nome do proprietario do animal"));
                                        Peixe[peixe].setEspeciePeixe(
                                                        JOptionPane.showInputDialog("Informe a especie do peixe"));
                                        Peixe[peixe].setAgua(JOptionPane.showInputDialog(
                                                        "Informe se o peixe é de agua doce ou salgada"));

                                        JOptionPane.showMessageDialog(null,
                                                        "O peixinho " + Peixe[peixe].getNome() + " \n de porte "
                                                                        + Peixe[peixe].getPorte()
                                                                        + " \n da espécie "
                                                                        + Peixe[peixe].getEspeciePeixe()
                                                                        + " \n de Àgua "
                                                                        + Peixe[peixe].getAgua()
                                                                        + " \n da (o) proprietária (o) "
                                                                        + Peixe[peixe].getProprietario()
                                                                        + " \n foi cadastrado");
                                        peixe++;
                                }

                        } else if (acao == 2) {
                        Agenda[contAgenda] = new AgendaConsulta();
                        Agenda[contAgenda].setNomeAgendar(JOptionPane.showInputDialog("Digite o Nome da (O) proprietária (O)"));
                        if(Agenda[contAgenda].getNomeAgendar() == animais[contAnimais].getProprietario()){
                                JOptionPane.showInputDialog("Cliente encontrado, faça o agendamento da sua consulta");
                

                       


                         }
                         

                        }
                }
        }
}

