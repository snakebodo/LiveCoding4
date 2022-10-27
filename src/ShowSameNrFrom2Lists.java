import java.util.ArrayList;

public class ShowSameNrFrom2Lists {
    public static void main(String[] args) {

        ArrayList<Integer> nrs1 = new ArrayList<>();
        nrs1.add(20);
        nrs1.add(10);
        nrs1.add(9);
        nrs1.add(1);

        ArrayList<Integer> nrs2 = new ArrayList<>();
        nrs2.add(9);
        nrs2.add(20);
        nrs2.add(4);
        nrs2.add(6);

        nrs1.removeAll(nrs2);
        System.out.println(nrs1);
    }
}
