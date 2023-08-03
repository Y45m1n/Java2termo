package Exception;

import javax.swing.JOptionPane;

public class ExemploTryCatch {
    private static final int n1 = 0;
    private static final int n2 = 0;

    public static void main(String[] args) {

        // SOMA

        // tratando as exceptions juntas
        // boolean calcularSoma = true;
        // while (calcularSoma) {
        // JOptionPane.showMessageDialog(null,"SOMA");
        // try {
        // int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número
        // inteiro "));
        // int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um outro número
        // inteiro"));

        // JOptionPane.showMessageDialog(null, "O Resultado é " + (n1 + n2));
        // calcularSoma = false;

        // } catch (Exception e) {
        // JOptionPane.showMessageDialog(null, "ERRO -- Valor digitado NÃo é Inteiro");
        // }
        // }

        // tratando as exceptions para cada ação
        boolean calcularSoma1 = true;

        while (calcularSoma1) {
            JOptionPane.showMessageDialog(null, "SOMA");
            try {
                int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro "));
                try {
                    int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um outro número inteiro "));
                    JOptionPane.showMessageDialog(null, "O Resultado é " + (n1 + n2));
                    calcularSoma1 = false;
                } catch (Exception erro) {
                    JOptionPane.showMessageDialog(null, "ERRO -- Valor digitado NÃo é Inteiro");
                }

            } catch (Exception erro) {
                JOptionPane.showMessageDialog(null, "ERRO -- Valor digitado NÃo é Inteiro");
            }

        }

        // SUBTRAÇÃo

        boolean calcularSub = true;

        while (calcularSub) {
            JOptionPane.showMessageDialog(null, "Subtração");
            try {
                int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro "));
                try {
                    int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um outro número inteiro "));
                    JOptionPane.showMessageDialog(null, "O Resultado é " + (n1 - n2));
                    calcularSub = false;
                } catch (Exception erro) {
                    JOptionPane.showMessageDialog(null, "ERRO -- Valor digitado NÃO é Inteiro");
                }

            } catch (Exception erro) {
                JOptionPane.showMessageDialog(null, "ERRO -- Valor digitado NÃO é Inteiro");
            }

        }

        // MULTIPLICAÇÃO

        boolean calcularMult = true;
        while (calcularMult) {
            JOptionPane.showMessageDialog(null, "MULTIPLICAÇÃO");
            try {
                int n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número inteiro"));
                try {
                    int n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um outro número"));
                    JOptionPane.showMessageDialog(null, "O Resultado é " + (n1 * n2));
                    calcularMult = false;
                } catch (Exception erro1) {
                    JOptionPane.showMessageDialog(null, "ERRO -- Valor digitado NÃO é Inteiro");
                }
            } catch (Exception erro1) {
                JOptionPane.showMessageDialog(null, "ERRO -- O número não é inteiro");

            }
        }

        // DIVISÃo

        boolean calcularDiv = true;
        while (calcularDiv) {
            JOptionPane.showMessageDialog(null, "DIVISÃO");
            try {
                int n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número inteiro"));
                int n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um outro número"));
                JOptionPane.showMessageDialog(null, "O Resultado é " + (n1 / n2));
                calcularDiv = false;

            } catch (Exception erro2) {
                if (n1 == 0) {
                    JOptionPane.showMessageDialog(null, "ERRO -- Não se faz divisão por 0 ");
                    calcularDiv = false;
                }
            }
        }

        // outra forma de fazer 

        boolean calcular = true;
        int n1 = 0, n2 = 0;
        while (calcular) {
            try {
                // recebendo os dados
                boolean n1ok = true;
                while (n1ok) {
                    try {
                        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um Número inteiro"));
                        n1ok = false;
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Erro - valor digitado NÃO é inteiro");
                    }
                }
                boolean n2ok = true;
                while (n2ok) {
                    try {
                        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro Número inteiro"));
                        n2ok = false;
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Erro - valor digitado NÃO é inteiro");
                    }
                }
                // mostrando o resultado
                // escolher o tipo de conta
                String operacao[] = { "Adição", "Subtração", "Multiplicação", "Divisão", "Sair" };
                int acao = JOptionPane.showOptionDialog(null, "Escolha a Operação", "Calculadora",
                        JOptionPane.DEFAULT_OPTION, JOptionPane.CANCEL_OPTION, null, operacao, operacao[0]);
                if (acao == 0) {
                    JOptionPane.showMessageDialog(null, "O Resultado é "
                            + (n1 + n2));
                } else if (acao == 1) {
                    JOptionPane.showMessageDialog(null, "O Resultado é "
                            + (n1 - n2));
                } else if (acao == 2) {
                    JOptionPane.showMessageDialog(null, "O Resultado é "
                            + (n1 * n2));
                } else if (acao == 3) {
                    JOptionPane.showMessageDialog(null, "O Resultado é "
                            + (n1 / n2));
                } else {
                    calcular = false;
                }
            } catch (NumberFormatException erro1) {
                JOptionPane.showMessageDialog(null, "Erro - valor digitadno não é inteiro");
            } catch (ArithmeticException erro2) {
                JOptionPane.showMessageDialog(null, "Erro - não dividirás por Zero");
            } catch (Exception erro3) {
                JOptionPane.showMessageDialog(null, "Erro - ");
            }
        }
    }




}

