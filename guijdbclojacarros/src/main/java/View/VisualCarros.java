package View;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import java.util.ArrayList;
import java.util.List;

import javax.swing.BoxLayout;
import javax.swing.JButton;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import Model.Carros;

public class VisualCarros extends JPanel {
    //atributos (componentes)

    private List<Carros> carros = new ArrayList<Carros>();
    private JTextField inputMarca,inputModelo, inputAno, inputPreco ,inputCor,inputPlaca;
    private JButton cadastrarButton,cancelarButton, consultarButton, editarButton, apagarButton, salvarButton;
    public JTable jTable;
    private DefaultTableModel tableModel;
    private int linhaSelecionada = -1;

// Construtor(GUI-JPanel)
public VisualCarros() {
super();
// entrada de dados
setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
add(new JLabel("Cadastro Carros"));
JPanel inputPanel = new JPanel();
inputPanel.setLayout(new GridLayout(6, 2));
inputPanel.add(new JLabel("Marca"));
inputMarca = new JTextField(20);
inputPanel.add(inputMarca);

inputPanel.add(new JLabel("Modelo"));
inputModelo = new JTextField(20);
inputPanel.add(inputModelo);

inputPanel.add(new JLabel("Ano"));
inputAno = new JTextField(20);
inputPanel.add(inputAno);

inputPanel.add(new JLabel("Preço"));
inputPreco = new JTextField(20);
inputPanel.add(inputPreco);

inputPanel.add(new JLabel("Cor"));
inputCor = new JTextField(20);
inputPanel.add(inputCor);

inputPanel.add(new JLabel("Placa"));
inputPlaca = new JTextField(20);
inputPanel.add(inputPlaca);
add(inputPanel);

JPanel botoes = new JPanel();
botoes.add(cadastrarButton = new JButton("Cadastrar"));
botoes.add(cancelarButton = new JButton("Cancelar"));
botoes.add(consultarButton = new JButton("Consultar"));
botoes.add(editarButton = new JButton("Editar"));
botoes.add(apagarButton = new JButton("Apagar"));
botoes.add(salvarButton = new JButton("Salvar"));
add(botoes);
// tabela de carros
JScrollPane jSPane = new JScrollPane();
add(jSPane);
tableModel = new DefaultTableModel(new Object[][] {},
new String[] { "Marca", "Modelo", "Ano", "Placa", "Valor" });
jTable = new JTable(tableModel);
jSPane.setViewportView(jTable);

    
     
    }

   
}
