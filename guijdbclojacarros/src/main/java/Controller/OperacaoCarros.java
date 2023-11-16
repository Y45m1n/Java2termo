package Controller;

import java.util.List;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Model.Carros;

public class OperacaoCarros {
    // atributos
    private List<Carros> carros;
    private DefaultTableModel tableModel;
    private JTable table;

    // construtor
    public OperacaoCarros(List<Carros> carros, DefaultTableModel tableModel, JTable table) {
        this.carros = carros;
        this.tableModel = tableModel;
        this.table = table;
    }

    // métodos
    // Método para atualizar a tabela de exibição com dados do banco de dados
    private void atualizarTabela() {
        tableModel.setRowCount(0); // Limpa todas as linhas existentes na tabela
        carros = new CarrosDAO().listarTodos();
        // Obtém os carros atualizados do banco de dados
        for (Carros carro : carros) {
            // Adiciona os dados de cada carro como uma nova linha na tabela Swing
            tableModel.addRow(new Object[] { carro.getMarca(), carro.getModelo(),
                    carro.getAno(), carro.getPlaca(), carro.getPreco() });
        }
    }
    //método Cadastrar
    public void cadastrar(String marca, String modelo, String ano, String preco, String cor, String placa){
        new CarrosDAO().cadastrar(marca, modelo, ano, preco, cor, placa);
        atualizarTabela();
    }
    //método Apagar
    public void apagar(String placa){
        new CarrosDAO().apagar(placa);
        atualizarTabela();
    }
    //métodos Atualizar pela Placa
    public void atualizar(String marca, String modelo, String ano, String preco, String cor, String placa){
        new CarrosDAO().atualizar(marca, modelo, ano, preco, cor, placa);
        atualizarTabela();
    }
}