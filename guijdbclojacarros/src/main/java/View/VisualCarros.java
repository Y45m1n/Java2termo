package View;

import java.util.List;

import javax.swing.AbstractButton;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import Controller.CarrosDAO;
import Controller.OperacaoCarros;

import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;

import Model.Carros;

public class VisualCarros extends JPanel {
    // atributos (componentes)

    private List<Carros> carros;
    private JTextField inputMarca, inputModelo, inputAno, inputPreco, inputCor, inputPlaca;
    private JButton cadastrarButton, cancelarButton, consultarButton, editarButton, apagarButton;
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
        add(botoes);

        // tabela de carros
        JScrollPane jSPane = new JScrollPane();
        add(jSPane);
        tableModel = new DefaultTableModel(new Object[][] {},
                new String[] { "Marca", "Modelo", "Ano", "Preço", "Cor", "Placa" });
        jTable = new JTable(tableModel);

        jSPane.setViewportView(jTable);

        // Criar a Tabela se ela não existir
        new CarrosDAO().criaTabela();
        // atualizar a tabela na abertura da janela
        atualizarTabela();

        // tratamento de eventos(construtor)
        jTable.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                linhaSelecionada = jTable.rowAtPoint(evt.getPoint());
                if (linhaSelecionada != -1) {
                    inputMarca.setText((String) jTable.getValueAt(linhaSelecionada, 0));
                    inputModelo.setText((String) jTable.getValueAt(linhaSelecionada, 1));
                    inputAno.setText((String) jTable.getValueAt(linhaSelecionada, 2));
                    inputPreco.setText((String) jTable.getValueAt(linhaSelecionada, 3));
                     inputCor.setText((String) jTable.getValueAt(linhaSelecionada, 4));
                    // Desativa o textfield da placa
                    inputPlaca.setEditable(false);
                    // Desativa o botão
                    cadastrarButton.setEnabled(false);
                    inputPreco.setText((String) jTable.getValueAt(linhaSelecionada, 3));
                   
                } else {
                    // Ativa o textfield da placa
                    inputPlaca.setEditable(true);
                    // Ativa o botão
                    cadastrarButton.setEnabled(true);
                }
            }
        });
        OperacaoCarros operacoes = new OperacaoCarros(carros, tableModel, jTable);
        // Configura a ação do botão "cadastrar" para adicionar um novo registro no banco de dados
        cadastrarButton.addActionListener(e -> {
            // Chama o método "cadastrar" do objeto operacoes com os valores dos campos de entrada
            operacoes.cadastrar(inputMarca.getText(), inputModelo.getText(),
                    inputAno.getText(), inputPreco.getText(), inputCor.getText(), inputPlaca.getText());
            // Limpa os campos de entrada após a operação de cadastro
            inputMarca.setText("");
            inputModelo.setText("");
            inputAno.setText("");
            inputPreco.setText("");
            inputCor.setText("");
            inputPlaca.setText("");

        });
        // Configura a ação do botão "Editar" para adicionar um novo registro no banco de dados
        apagarButton.addActionListener(e -> {
            // Chama o método "cadastrar" do objeto operacoes com os valores dos campos de entrada
            operacoes.apagar(inputPlaca.getText());
            // Limpa os campos de entrada após a operação de cadastro
            inputMarca.setText("");
            inputModelo.setText("");
            inputAno.setText("");
            inputPreco.setText("");
            inputCor.setText("");
            inputPlaca.setText("");

        });
        // Configura a ação do botão "Editar" para adicionar um novo registro no banco de dados
        editarButton.addActionListener(e -> {
            // Chama o método "cadastrar" do objeto operacoes com os valores dos campos de entrada
            operacoes.atualizar(inputMarca.getText(), inputModelo.getText(), inputAno.getText(), inputPreco.getText(), inputCor.getText(), inputPlaca.getText());
            // Limpa os campos de entrada após a operação de cadastro
            inputMarca.setText("");
            inputModelo.setText("");
            inputAno.setText("");
            inputPreco.setText("");
            inputCor.setText("");
            inputPlaca.setText("");

        });
    }


    private void atualizarTabela() {
        try {
            tableModel.setRowCount(0); // Limpa todas as linhas existentes na tabela
            carros = new CarrosDAO().listarTodos();
            // Obtém os carros atualizados do banco de dados
            for (Carros carro : carros) {
                // Adiciona os dados de cada carro como uma nova linha na tabela Swing
                tableModel.addRow(new Object[] { carro.getMarca(), carro.getModelo(),
                        carro.getAno(), carro.getCor(), carro.getPreco(), carro.getPlaca() });
            }
        } catch (Exception e) {
            // Adicione mensagens de log ou imprima o stack trace para identificar problemas
            e.printStackTrace();
        }
    }

}
