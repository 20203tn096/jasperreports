package mx.cds.utez.jasperapplication.model;

public class Person {
    private int id;

    private String name;

    private String lastName;

    private String surName;

    private String fecha;

    private String sexo;

    public Person() {
    }

    public Person(int id, String name, String lastName, String surName, String fecha, String sexo) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.surName = surName;
        this.fecha = fecha;
        this.sexo = sexo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}
