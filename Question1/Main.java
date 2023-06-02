public class Main {

    public static void main(String[] args) {
        Person lily = new Person("Lily");
        lily.spouse(new Person("Wilhelm"));
        // Patriarch and Matriarch
        Person opa = new Person("Opa");
        lily.addChild(opa);
        opa.spouse(new Person("Oma"));
        //  Children of Oma and Opa
        Person reinhold = new Person("Reinhold");
        Person wilma = new Person("Wilma");
        Person sigrid = new Person("Sigrid");
        opa.addChild(reinhold);
        opa.addChild(wilma);
        opa.addChild(sigrid);
        // Children and spouse of Reinhold
        reinhold.spouse(new Person("Sonia"));
        Person christian = new Person("Christian");
        reinhold.addChild(christian);
        Person gabrielle = new Person("Gabrielle");
        reinhold.addChild(gabrielle);
        Person sabine = new Person("Sabine");
        reinhold.addChild(sabine);
        // Children and spouse of Wilma
        wilma.spouse(new Person("Rodolfo"));
        Person ricardo = new Person("Ricardo");
        wilma.addChild(ricardo);
        Person rodrigo = new Person("Rodrigo");
        // Ricardo and spouse
        ricardo.spouse(new Person("Debora"));
        // Children and spouse of Christian
        christian.addChild(new Person("Monica"));
        Person oscar = new Person("Oscar");
        christian.addChild(oscar);
        Person lorena = new Person("Lorena");
        christian.addChild(lorena);
        // Children and spouse of Sigrid
        sigrid.spouse(new Person("Peter"));
        Person martin = new Person("Martin");
        sigrid.addChild(martin);
        Person thomas = new Person("Thomas");
        sigrid.addChild(thomas);
        Person claudia = new Person("Claudia");
        sigrid.addChild(claudia);
        martin.spouse(new Person("Carla"));
        martin.addChild(new Person("Nicolas"));
        lily.PrintTree();

    }

}