public class Child extends Pessoa {

    private Adult responsavel;
    public Child(String nome, int idade, Adult responsavel) {
        super(nome, idade);
        this.responsavel = responsavel;
    }
}