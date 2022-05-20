package it.academy.java.sprint1.tasca4.n1exercisi1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Exercisi1 {

    public static void main(String[] args) {
        System.out.println("Tasca 04. Testing (Spring1), Nivell 1, Exercisi 1");
        generateMonths();
    }

    public static List<String> generateMonths(){
        List<String> months = new ArrayList <>();
        months.add("Gener");
        months.add("Febrer");
        months.add("Març");
        months.add("Abril");
        months.add("Maig");
        months.add("June");
        months.add("Juliol");
        months.add("Agost");
        months.add("Setembre");
        months.add("October");
        months.add("Novembre");
        months.add("Desembre");

        System.out.println("months -->"+months.toString());

        return months;
    }
}
