package RevisaoFPOO.Horario;

import RevisaoFPOO.Cadastro.Animais;

public class AgendaConsulta extends Animais{
    //data
    //horario

    String data;
    String horario;
    String veterinario;
    String nomeAgendar;



    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }
    public String getHorario() {
        return horario;
    }
    public void setHorario(String horario) {
        this.horario = horario;
    }
    public String getVeterinario() {
        return veterinario;
    }
    public void setVeterinario(String veterinario) {
        this.veterinario = veterinario;
    }
    public String getNomeAgendar() {
        return nomeAgendar;
    }
    
    

    
}
