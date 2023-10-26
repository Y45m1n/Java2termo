package Exception;

import javax.swing.JOptionPane;

/**
 * ExemploThrow
 */
public class ExemploThrow {

    public static void main(String[] args) {
        //
        try {
            JOptionPane.showMessageDialog(null, "Welcome to SENAI");
            String login = JOptionPane.showInputDialog("Informe seu Login");
            String dataNascimento = JOptionPane.showInputDialog("Informe sua Data de Nascimento [dd/mm/aa]");
            String senha = JOptionPane.showInputDialog("Informe sua Senha de 6 Digitos");
            dataNascimento.replace("/", ""); //replace tira oq ta entre ""
            if (senha.length() < 8) {
                throw new Exception("Senha < 8 Caracteres");
            }
            if(senha.equals(login)){
                throw new Exception("Senha = Login");
            }
            if(senha.contains(dataNascimento)){
                throw new Exception("Senha = Data de Nascimento");
                }
            if(!senha.matches(".*[a-z]+.*")){
                throw new Exception("Senha Fraca!!!Usar letras lower");
            }
            if(!senha.matches(".*[A-Z]+.*")){
                throw new Exception("Senha Fraca!!!Usar letras Upper");
            }        
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e.getMessage(), "senha", 0);
        }
    }
}