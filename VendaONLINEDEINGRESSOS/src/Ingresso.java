import java.util.ArrayList;

public class Ingresso extends VendaSite {

    private String Evento,tipoIngresso;
    private double valor;
    private int qrdeMax;

    public Ingresso(String evento) {
        super();
        Evento = evento;
        this.tipoIngresso = tipoIngresso;
        this.valor = valor;
        this.qrdeMax = qrdeMax;
    }

    public Ingresso(ArrayList<String> ingresso, int qtdeMax) {
        super();
    }

    public String getEvento() {
        return Evento;
    }

    public void setEvento(String evento) {
        Evento = evento;
    }

    public String getTipoIngresso() {
        return tipoIngresso;
    }

    public void setTipoIngresso(String tipoIngresso) {
        this.tipoIngresso = tipoIngresso;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getQrdeMax() {
        return qrdeMax;
    }

    public void setQrdeMax(int qrdeMax) {
        this.qrdeMax = qrdeMax;
    }
}
