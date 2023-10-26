import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.*;

public class ExemplocardLayout extends JFrame {
        public ExemplocardLayout(){
            super("Exemplo Layout");
            //criando um painel
            JPanel painel1 = new JPanel();
            String comboBoxItens[] = {"Card1","Card2"};
            JComboBox cb = new JComboBox<>(comboBoxItens);
            painel1.add(cb);

            //criar os cards
            JPanel card1 = new JPanel();
            card1.add(new JButton("Botão 1"));
            card1.add(new JButton("Botão 2"));
            card1.add(new JButton("Botão 3"));
            JPanel card2 = new JPanel();
            card2.add(new JTextField("TextField", 20));
            //adicionar os cards ao cardlayout
            JPanel cards = new JPanel(new CardLayout());
            cards.add(card1, "Card1");
            cards.add(card2, "Card2");
            this.add(painel1);
            painel1.add(cards);
            //set do frame
            this.setDefaultCloseOperation(2);
            this.setVisible(true);
            cb.addItemListener(e->{
                CardLayout cl = (CardLayout) (cards.getLayout());
                cl.show(cards, (String) e.getItem());
            });

            
        }
        

    
}
