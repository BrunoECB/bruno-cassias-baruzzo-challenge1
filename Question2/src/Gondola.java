public class Gondola {
    private int numero;
    private Child child;
    private Adult adulto;


    public Gondola(int numero, Child child, Adult adulto) {
        this.numero = numero;
        this.child = child;
        this.adulto = adulto;
    }

    public int getNumero() {
        return numero;
    }

    public Child getChild() {
        return child;
    }

    public Adult getAdulto() {
        return adulto;
    }
}


