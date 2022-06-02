package mx.cds.utez.jasperapplication;

import mx.cds.utez.jasperapplication.model.Person;

import java.util.ArrayList;
import java.util.List;

public class Prueba {

    public static List<Person> getPersons (){
        List<Person> personas = new ArrayList<>();
        Person p1 = new Person(new Long(1), "Patrick", "Lightbuddie");
        Person p2 = new Person(new Long(2), "Jason", "Carrora");
        Person p3 = new Person(new Long(3), "Alexandru", "Papesco");
        Person p4 = new Person(new Long(4), "Jay", "Boss");
        personas.add(p1);
        personas.add(p2);
        personas.add(p3);
        personas.add(p4);

        return personas;
    }
}
