package it.academy.java.sprint1.tasca4.n1exercisi2;

public class CalculoDni {

    public String calculLletraDni(String dni) {
        String lletraDni = dni.substring(dni.length() - 1);

        return lletraDni;
    }
}
