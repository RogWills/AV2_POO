import java.util.ArrayList;

public class Evento {

    private String titulo,data,hora,local;
    private ArrayList<Ingresso> ingressos;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public Evento(String titulo, String data, String hora, String local) {
        this.titulo = titulo;
        this.data = data;
        this.hora = hora;
        this.local = local;
    }

    public Evento(String titulo) {
        this.titulo = titulo;
        this.data = data;
        this.hora = hora;
        this.local = local;

    }

    public void setIngressos(ArrayList<Ingresso> ingressos) {
        this.ingressos = ingressos;
    }

    public ArrayList<Ingresso> getIngressos() {
        return ingressos;
    }
}

