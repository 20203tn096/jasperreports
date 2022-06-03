package mx.cds.utez.jasperapplication;

import mx.cds.utez.jasperapplication.model.Person;

import java.util.ArrayList;
import java.util.List;

public class Prueba {

    public static List<Person> getPersons (){
        List<Person> personas = new ArrayList<>();
        Person p1 = new Person(1, "Patrick", "Lightbuddie", "Rodriguez", "10-02-2001", "H");
        Person p2 = new Person(2, "Jason", "Carrora", "Mendoza", "12-01-2002", "H");
        Person p3 = new Person(2, "Alexandra", "Papesco", "Garcia", "22-05-2002", "M");
        Person p4 = new Person(2, "Jay", "Boss", "Mendiola", "25-08-2003", "M");
        personas.add(p1);
        personas.add(p2);
        personas.add(p3);
        personas.add(p4);

        return personas;
    }
}
