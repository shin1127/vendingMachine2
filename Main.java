import java.util.ArrayList;
// import java.util.List;

public class Main {
    public static void main(String[] args) {
        int currentMoney;
        Logic logic = new Logic();

        // メニューリストを準備
        ArrayList<Drink> drinkList = new ArrayList<>();

        Drink coke = new Drink("coke", 120, 0, 500, "PET", false);
        Drink coffee = new Drink("coffee", 120, 1, 250, "CAN", false);
        Drink water = new Drink("water", 100, 2, 500, "PET", false);
        Drink beer = new Drink("beer", 300, 3, 350, "CAN", true);
        drinkList.add(coke);
        drinkList.add(coffee);
        drinkList.add(water);
        drinkList.add(beer);

        // drinkList.add(coke, coffee);

        // logic.showObj(drinkList);

        currentMoney = logic.inputMoney();
        System.out.println("current money is " + currentMoney);

        int minPrice = logic.minPrice(drinkList);
        System.out.println(minPrice);

        if (logic.canBuy(currentMoney, minPrice)) {
            System.out.println("You can buy something.");
        }

        logic.showObj(drinkList);

        currentMoney = logic.buyCommodity(currentMoney, drinkList);

        logic.showCurrentMoney(currentMoney);

        // decideContinue();
    }
}
