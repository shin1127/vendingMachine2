import java.util.Scanner;
import java.util.ArrayList;

public class Logic {
    public int inputMoney() {
        Scanner sc = new Scanner(System.in);
        System.out.print("input money > ");
        int input = sc.nextInt();
        // sc.close();
        return input;
    }

    public void showObj(ArrayList<Drink> ary) {
        for (Drink drink : ary) {
            System.out.print(drink.getId() + " ");
            System.out.print(drink.getName() + " ");
            System.out.println(drink.getValue());
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

    // process about buying
    public int buyCommodity(int currentMoney, ArrayList<Drink> ary) {

        Scanner sc1 = new Scanner(System.in);
        System.out.print("select number > ");
        int id = sc1.nextInt();
        // int id = 1;
        currentMoney = currentMoney - ary.get(id).getValue();
        System.out.println("you bought a " + ary.get(id).getName() + ".");
        return currentMoney;
    }

    public void showCurrentMoney(int currentMoney) {
        System.out.println("current money is " + currentMoney);
    }

    public boolean decideContinue() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you continue buying? Y or N");
        String yn = sc.nextLine();
        if (yn == "Y" || yn == "y") {
            return true;
        } else if (yn == "N" || yn == "n") {
            return false;
        } else {
            return false;
        }
    }
}
