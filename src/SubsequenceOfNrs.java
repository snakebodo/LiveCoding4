import java.util.ArrayList;

public class SubsequenceOfNrs {
    public static void main(String[] args) {

        ArrayList<Integer> nrs = new ArrayList<>();
       // Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {

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


           // nrs.add(scanner.nextInt());
        }
        boolean suntemInCrestere = false;
        int pozitiaDeInceput = 0;
        int max = 0;
        for (int i = 0; i < nrs.size()-1; i++) {
            if (nrs.get(i) < nrs.get(i + 1)) {
                if (!suntemInCrestere) {
                    pozitiaDeInceput = i;
                }
                suntemInCrestere = true;
            } else {
                suntemInCrestere = false;
                int lungimeaSirului = i - pozitiaDeInceput +1;
                if (max < lungimeaSirului) {
                    max = lungimeaSirului;
                }
            }
        }
        System.out.println(max);
    }
}
