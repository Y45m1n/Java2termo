import javax.swing.*;
import java.awt.*;

public class ExemploFlowLayout {
        public ExemploFlowLayout() {
            super();
            JFrame janela = new JFrame("Janela Principal");
            //mudar o layout padrao (grid) -> Flow Layout
            FlowLayout flow = new FlowLayout();
            janela.setLayout(flow); //mudei o layout
            //adicionar componentes no layout
            janela.add(new JLabel("Informe o valor: "));
            JTextField input1 = new JTextField(25);
            janela.add(input1);
            JButton botao1 = new JButton("enviar");
            janela.add(botao1);
            //set frame
            janela.pack();
            janela.setDefaultCloseOperation(2);
            janela.setVisible(true);
        }
    
}
