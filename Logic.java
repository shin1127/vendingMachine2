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

    public boolean canBuy(int currentMoney, int minPrice) {
        if (currentMoney >= minPrice) {
            return true;
        } else {
            return false;
        }
    }

    public int minPrice(ArrayList<Drink> ary) {
        int temp = ary.get(0).getValue();
        for (Drink drink : ary) {
            if (drink.getValue() < temp) {
                temp = drink.getValue();
                // System.out.println(temp);
            }
        }
        return temp;
    }
}
