package View;

import java.awt.BorderLayout;
import java.awt.LayoutManager;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class VisualCarros extends JPanel {
    //atributos (componentes)
    private JTextField inputMarca;
    private JTextField inputModelo;
    private JTextField inputAno;
    private JTextField inputPreco;
    private JTextField inputCor;
    private JTextField inputPlaca;

    private DefaultTableModel tableModel;
    private JTable table;
    
     private List<VisualCarros> visualCarros = new ArrayList<>();
    private int linhaSelecionada = -1;
    private JButton cadastrarButton,cancelarButton, consultarButton, editarButton, apagarButton, salvarButton;
    
    
    
    //construtor GUI-JPanel (ctor)

    public VisualCarros() {
        super();

    

        // construir minha tabela
        tableModel = new DefaultTableModel();
        tableModel.addColumn("Marca");
        tableModel.addColumn("Modelo");
         tableModel.addColumn("Ano");
        tableModel.addColumn("Preço");
         tableModel.addColumn("Cor");
        tableModel.addColumn("Placa");
        table = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(table);

        // criar os componentes
       inputMarca = new JTextField(10);
        inputModelo = new JTextField(10);
        inputAno = new JTextField(8);
       inputPreco = new JTextField(10);
        inputCor = new JTextField(10);
        inputPlaca = new JTextField(10);
        cadastrarButton = new JButton("Cadastrar");
        cancelarButton = new JButton("Cancelar");
         consultarButton = new JButton("Consultar");
         editarButton = new JButton("Editar");
        apagarButton = new JButton("Apagar");
        salvarButton = new JButton("Salvar");

        // add os componentes
        JPanel inputPanel = new JPanel();
        inputPanel.add(new JLabel("Marca:"));
        inputPanel.add(inputMarca);
        inputPanel.add(new JLabel("Modelo:"));
        inputPanel.add(inputModelo);
        inputPanel.add(new JLabel("Ano:"));
        inputPanel.add(inputAno);
        inputPanel.add(new JLabel("Preço:"));
        inputPanel.add(inputPreco);
        inputPanel.add(new JLabel("Cor:"));
        inputPanel.add(inputCor);
        inputPanel.add(new JLabel("Placa:"));
        inputPanel.add(inputPlaca);
        inputPanel.add(cadastrarButton);
        inputPanel.add(cancelarButton);
        inputPanel.add(consultarButton);
        inputPanel.add(editarButton);
        inputPanel.add(apagarButton);
        inputPanel.add(salvarButton);

         // set do Layout
         setLayout(new BorderLayout());
         add(inputPanel, BorderLayout.NORTH);
         add(scrollPane, BorderLayout.CENTER);

         
        
        //entrada de dados
        //botoes de eventos
        //tabela de carros
    }

    public void run() {
      
        setVisible(true);
    }
}
