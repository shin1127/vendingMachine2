import java.util.ArrayList;
// import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("hello world!");
        // Drink coke = new Drink();

        Logic logic = new Logic();
        ArrayList<Drink> drinkList = new ArrayList<>();

        Drink coke = new Drink("coke", 120, 500, "PET", false);
        Drink coffee = new Drink("coffee", 120, 250, "CAN", false);
        Drink water = new Drink("water", 100, 500, "PET", false);
        Drink beer = new Drink("beer", 200, 350, "CAN", true);
        drinkList.add(coke);
        drinkList.add(coffee);
        drinkList.add(water);

        logic.showObj(drinkList);

        logic.inputMoney();

    }
}
