public class NumeroPrimo {
    private int numer;

    public NumeroPrimo(int numer) {
        this.numer = numer;
    }

    public void verficacion (){
        if (numer % 2 == 1) {
            System.out.println("El numero es Primo");
        } else{
            System.out.println("El Numero es Par");
        }
    }
}
