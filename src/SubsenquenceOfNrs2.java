import java.util.ArrayList;

public class SubsenquenceOfNrs2 {
    public static void main(String[] args) {

        ArrayList<Integer> nrs = new ArrayList<>();
        // Scanner scanner = new Scanner(System.in);
        //       for (int i = 0; i < 10; i++) {

        nrs.add(1);
        nrs.add(2);
        nrs.add(3);
        nrs.add(4);
        nrs.add(2);
        nrs.add(9);
        nrs.add(4);
        nrs.add(6);
        nrs.add(3);
        nrs.add(1);

        int counter = 0;
        ArrayList<Integer> lungimiDeSiruriCrescatoare = new ArrayList<>();
        for (int i = 0; i < nrs.size() - 1; i++) {
            if (nrs.get(i) < nrs.get(i + 1)) {
                counter++;
            } else {
                if (counter != 0) {
                    lungimiDeSiruriCrescatoare.add(counter);
                }
                counter = 0;
            }
        }
        System.out.println(lungimiDeSiruriCrescatoare);
    }
}