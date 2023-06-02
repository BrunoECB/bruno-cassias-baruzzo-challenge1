import java.util.ArrayList;
import java.util.List;

public class Person {

    String name;
    Person spouse;
    List<Person> children;

    public Person (String name){
        this.name = name;
        this.children = new ArrayList<>();
    }

    public Person (String name, Person spouse) {
        this(name);
        this.spouse = spouse;
        spouse.spouse = this;
    }

    public void addChild (Person child) {
        children.add(child);
    }

    public void spouse (Person person) {
        this.spouse = person;
        person.spouse = this;
    }
    public void PrintTree() {
        if(this.spouse != null) {
            System.out.println(this.name + " -- Married to: " + this.spouse.name + " -- Children: ");
        }
        if(this.children != null) {
            for (Person child : children) {
                if(this.spouse != null) {
                    child.PrintTree();
                } else {
                    System.out.println(this.name + " -- Single");
                }
            }
        }
        }
    }
