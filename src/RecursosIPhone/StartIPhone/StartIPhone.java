package RecursosIPhone.StartIPhone;

import RecursosIPhone.AparelhoTelefonico.AparelhoTelefonico;
import RecursosIPhone.NavegadorInternet.NavegadorInternet;
import RecursosIPhone.ReprodutorMusical.ReprodutorMusical;

public class StartIPhone implements AparelhoTelefonico, ReprodutorMusical, NavegadorInternet {
    @Override
    public void atender() {
        System.out.println("Atendendo telefone!");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz!");
    }

    @Override
    public void ligar() {
        System.out.println("Efetuando uma ligação!");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo uma página!");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando uma aba!");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando uma Página!");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando uma música!");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada!");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando uma música!");
    }
}
