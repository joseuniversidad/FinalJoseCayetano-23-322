public class Parametros {
    String text1;
    String text2;
    String text3;

    public Parametros(String text1, String text2, String text3) {
        this.text1 = text1;
        this.text2 = text2;
        this.text3 = text3;
    }


    public void concatenacion() {
        String resultado = text1 + text2 + text3;
        System.out.println(resultado);

    }
}
