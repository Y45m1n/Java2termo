package RevisaoFPOO.Cadastro;

public abstract class Animais {
    //atributos
    String nome;
    String porte; //variavel especial,por isso o s é em maiusculo
   
    String proprietario;
    String especie;
    
    //metodos
    //metodo construtor:  cheio (já atribui os valores)

    //public Animais(String porte, double peso, String proprietario, String nome, String especie) {
      //  this.porte = porte;
      //  this.peso = peso;
      //  this.proprietario = proprietario;
      //  this.nome = nome;
      //  this.especie = especie;
   // }
     //construtor vazio (por padrao, se nao atribuir valores),

     public Animais() {

     }
     //gets and sets

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }



    public String getProprietario() {
        return proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }
     //metodos proprios
     

}
