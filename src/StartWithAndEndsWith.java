import java.util.Scanner;

public class StartWithAndEndsWith {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        if(text.startsWith("acho")&&text.endsWith("!")){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
