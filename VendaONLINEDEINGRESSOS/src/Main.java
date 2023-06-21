import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String promotores;
        String pessoaf;
        int cnpj;
        ArrayList<Evento> eventos = new ArrayList<>();
        ArrayList<Ingresso> ingressos = new ArrayList<>();

        promotores = JOptionPane.showInputDialog("Digite o nome do Promotor: ");
        cnpj = Integer.parseInt(JOptionPane.showInputDialog("Digite o CNPJ: "));
        pessoaf = JOptionPane.showInputDialog("Digite o nome da Pessoa Fisica: ");

        Evento evento1 = new Evento("NewtonShow");
        Evento evento2 = new Evento("NewTonShow2");
        eventos.add(evento1);
        eventos.add(evento2);

        JOptionPane.showMessageDialog(null,"  Existe somente esse evento  "+eventos);

        Ingresso ingresso1 = new Ingresso("VIP");
        Ingresso ingresso2 = new Ingresso("CAMAROTE");
        Ingresso ingresso3 = new Ingresso("PISTA");
        ingressos.add(ingresso1);
        ingressos.add(ingresso2);
        ingressos.add(ingresso3);

        JOptionPane.showMessageDialog(null,"  Selecione seu ingresso  "+ingressos);

        evento1.setIngressos(ingressos);

        VendaSite vendaSite = new VendaSite();

        for (Ingresso ingresso : ingressos) {
            if (vendaSite.validaQtdeIngresso(10)) {
                vendaSite.vendaSite(ingresso);
            } else {
                System.out.println("Qtde de ingressos excedido");
            }
        }
    }
}