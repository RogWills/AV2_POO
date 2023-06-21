import java.util.ArrayList;

public class VendaSite {
    private ArrayList<Ingresso> ingressos;
    private int QtdeMax;

    public ArrayList<Ingresso> getIngressos() {
        return ingressos;
    }

    public void setIngressos(ArrayList<Ingresso> ingressos) {
        this.ingressos = ingressos;
    }

    public VendaSite() {
        this.ingressos = ingressos;
        int qtdeMax;
    }

    public VendaSite(int QtdeMax) {
        this.ingressos = new ArrayList<>();
        this.QtdeMax = QtdeMax;
    }

    public void insereVenda(Ingresso ingresso) {
        ingressos.add(ingresso);
    }

    public int getQtdeMax() {
        return QtdeMax;
    }

    public void setQtdeMax(int QtdeMax) {
        this.QtdeMax = QtdeMax(10);
    }

    private int QtdeMax(int i) {
        return 0;
    }

    public boolean validaQtdeIngresso() {
        return ingressos.size() < QtdeMax;
    }

    public void vendaSite(Ingresso ingresso) {
    }

    public boolean validaQtdeIngresso(int i) {
        return false;
    }
}