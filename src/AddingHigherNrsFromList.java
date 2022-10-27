import java.util.ArrayList;

public class AddingHigherNrsFromList {
    public static void main(String[] args) {

        ArrayList<Integer> nrs = new ArrayList<>();
        nrs.add(2);
        nrs.add(10);
        nrs.add(8);
        nrs.add(1);

        //trebuie sa adunam numerele din lista
        //insa trebuie sa adunam numai nr care sunt mai mari decat toate nr din dreapta
        //2 nu este eligibil
        //9 , 10 sunt elgibile
        int suma = 0;

        //varianta1
        for (int i = 0; i < nrs.size() - 1; i++) {
            boolean toBeAdded = true;
            for (int k = i; k <= nrs.size(); k++) {
                if (nrs.get(i) < nrs.get(k)) {
                    toBeAdded = false;
                }
            }
            if (toBeAdded) {
                suma = suma + nrs.get(i);
            }
        }
                System.out.println(suma);
            }
        }