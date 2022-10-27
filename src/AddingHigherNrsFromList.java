import java.util.ArrayList;

public class AddingHigherNrsFromList {
    public static void main(String[] args) {

        ArrayList<Integer> nrs = new ArrayList<>();
        ArrayList<Integer> nrs1 = nrs;
        nrs1.add(2);
        nrs1.add(10);
        nrs1.add(8);
        nrs1.add(1);

        //trebuie sa adunam numerele din lista
        //insa trebuie sa adunam numai nr care sunt mai mari decat toate nr din dreapta
        //2 nu este eligibil
        //9 , 10 sunt elgibile
        int suma = 0;
        for (int i = 0; i < nrs1.size() - 1; i++) {
            if (isEligibleForAdding(i, nrs1.get(i), nrs1)){
                suma = suma + nrs1.get(i);
            }
        }
        System.out.println(suma);
    }

    static boolean isEligibleForAdding(int position, int nr, ArrayList<Integer> numbers) {
        for (int i = position + 1; i < numbers.size(); i++){
            if(numbers.get(i)>nr){
                return false;
            }
        }
        return true;
    }
}