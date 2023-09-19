package IPhone;

import RecursosIPhone.AparelhoTelefonico.AparelhoTelefonico;
import RecursosIPhone.NavegadorInternet.NavegadorInternet;
import RecursosIPhone.ReprodutorMusical.ReprodutorMusical;
import RecursosIPhone.StartIPhone.StartIPhone;

public class IPhone {
    public static void main(String[] args) {
        StartIPhone iOS1 = new StartIPhone();

        AparelhoTelefonico at = iOS1;
        at.ligar();
        AparelhoTelefonico at2 = iOS1;
        at.atender();
        AparelhoTelefonico at3 = iOS1;
        at.iniciarCorreioVoz();

        System.out.println("");

        NavegadorInternet ni = iOS1;
        ni.adicionarNovaAba();
        NavegadorInternet ni2 = iOS1;
        ni.exibirPagina();
        NavegadorInternet ni3 = iOS1;
        ni.atualizarPagina();

        System.out.println("");

        ReprodutorMusical rm = iOS1;
        rm.selecionarMusica();
        ReprodutorMusical rm2 = iOS1;
        rm.tocar();
        ReprodutorMusical rm3 = iOS1;
        rm.pausar();
    }
}
