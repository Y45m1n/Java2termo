package RevisaoFPOO;

import javax.swing.JOptionPane;

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
              //  Animais animais[] = new Animais[10];

                boolean aberta = true;
                int cachorro = 0; // contador= contCachorro
                int cobra = 0;
                int peixe = 0;
                int contAgenda = 0;
              //  int contAnimais = 0;

                JOptionPane.showMessageDialog(null, "Seja Bem-Vindo ao Consultória \n da Dr. Yasmin :) ");


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

                                        Cachorro[cachorro] = new Cachorro(); // cachorro(da posição cont cachorros)
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
                                String nomeAgenda = JOptionPane.showInputDialog("Informe o Nome do proprietário");
                                boolean nomeOk =true;
                                //comparar nos vetores(gatos/cachorros/outrosanimais)
                                for (int i = 0; i < cachorro; i++) {
                                     if(nomeAgenda.equals(Cachorro[i].getNome())){
                                          JOptionPane.showMessageDialog(null, "Cliente Encontrado");
                                        nomeOk = true;
                                        break;
                                     }
                                }
                                  for (int i = 0; i < peixe; i++) {
                                     if(nomeAgenda.equals(Peixe[i].getNome())){
                                          JOptionPane.showMessageDialog(null, "Cliente Encontrado");
                                        nomeOk = true;
                                        break;
                                     }
                                }
                                  for (int i = 0; i < cobra; i++) {
                                     if(nomeAgenda.equals(Cobra[i].getNome())){
                                          JOptionPane.showMessageDialog(null, "Cliente Encontrado");
                                        nomeOk = true;
                                        break;
                                     }
                                }

                                if (nomeOk) {
                                      
                                        boolean registrarAgendamento = true;
                                        while (registrarAgendamento) {
                                            
                                             String dataAgenda = JOptionPane
                                                       .showInputDialog("Informe a Data do Agendamento\n [dd/mm/yyyy]");
                                             String horaAgenda = JOptionPane
                                                       .showInputDialog("Informe a Hora do Agendamento\n [hh:mm]");
                                             if (contAgenda != 0) {
                                                  for (int i = 0; i < contAgenda; i++) {
                                                       if (Agenda[i].getAgendamento().equals(dataAgenda +  horaAgenda)) {
                                                            // já existe um horário agendado
                                                            JOptionPane.showMessageDialog(null, "Horario já agendado");
                                                            break;
                                                       } else {
                                                            // 3º realizar agendamento
                                                            Agenda[contAgenda] = new AgendaConsulta(horaAgenda, dataAgenda);
                                                              JOptionPane.showMessageDialog(null, "Você fez um agendamento para "+Agenda[i].getAgendamento());
                                                             
                                                            contAgenda++;

                                                            registrarAgendamento = false;
                                                            
                                                       }
                                                  }
               
                                             } else {
                                                  // 3º realizar agendamento
                                                  Agenda[contAgenda] = new AgendaConsulta(horaAgenda, dataAgenda);
                                                  contAgenda++;
                                                  registrarAgendamento = false;
                                             }
                                        }
                                   }
                              }
                         }

        
                         

                        }
                }
        


