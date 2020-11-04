package academy.belhard;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Plate p1 = new Plate(5, 2, "asd");
        Plate p2 = new Plate(5, 2, "asd");
        Plate p3 = new Plate(5, 3, "asd");
        Plate p4 = new Plate(11, 4, "big");

        Set<Plate> plates = new HashSet<>();
        plates.add(p1);
        plates.add(p2);
        plates.add(p3);
        plates.add(p4);

        System.out.println("Количество элементов = " + plates.size());
        for (Plate plate : plates) {
            System.out.println(plate);
        }
    }
}
