package Model;

public class Carros {
    //Atributos 
    private String marca;
    private String modelo;
    private int ano;
    private String cor;
    private String placa;
    private int preco;

    //métodos
    
    public Carros(String marca, String modelo, int ano, String cor, String placa, int preco) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.placa = placa;
        this.preco = preco;
    }

    public Carros(String string, String string2, String string3, String string4, String string5) {
    }

    public Carros(String string, String string2, String string3, String string4, String string5, String string6) {
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    

    
}
