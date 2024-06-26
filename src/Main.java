//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] var0) {


        NavegadorInternet navegador = new Iphone();
        Telefone telefone = new Iphone();
        ReprodutorMusical reprodutor = new Iphone();


        telefone.ligar();
        navegador.atualizarPagina();
        reprodutor.selecionarMusica();
    }
}