import java.util.Scanner;
import java.util.ArrayList;

public class Logic {
    public int inputMoney() {
        Scanner sc = new Scanner(System.in);
        System.out.print("input money > ");
        int input = sc.nextInt();
        sc.close();
        return input;
    }

    public void showObj(ArrayList<Drink> ary) {
        for (Drink drink : ary) {
            System.out.println(drink.getName());
        }
    }
}
