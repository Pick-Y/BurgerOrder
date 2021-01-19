import java.util.Scanner;

public class HealthyBurger extends Burger {

private int healthItem;

    private int price;
    private String meat;

    public HealthyBurger() {
    }

    public HealthyBurger(String breadType, String meat, int price) {
        super(breadType, meat, price);
    this.healthItem = 0;
    this.price = price;
    this.meat = meat;
    }

    @Override
    public String getMeat() {
        return meat;
    }

    @Override
    public String getBreadType() {
        return "Rye roll";
    }

    @Override
    public int getItems() {
        return this.healthItem;
    }

    public int getHealthItem() {
        return healthItem;
    }

    @Override
    public void AddIngredient() {
        System.out.println("overridden called");
        System.out.println("1 - lettuce");
        System.out.println("2 - tomato");
        System.out.println("3 - cheese");
        System.out.println("4 - sauce");
        System.out.println("5 - feta");
        System.out.println("6 - rucola");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();



        switch (choice){
            case 1:
                System.out.println("Lettuce");

                healthItem ++;
                System.out.println(healthItem);
                break;
            case 2:
                System.out.println("Tomato");

                healthItem ++;
                System.out.println(healthItem);
                break;
            case 3:
                System.out.println("Cheese");

                healthItem ++;
                System.out.println(healthItem);
                break;
            case 4:
                System.out.println("Sauce");

                healthItem ++;
                System.out.println(healthItem);
                break;
            case 5:
                System.out.println("Feta");

                healthItem ++;
                System.out.println(healthItem);
                break;
            case 6:
                System.out.println("Rucola");
                healthItem ++;
                System.out.println(healthItem);
                break;
        }
    }

    @Override
    public void Total() {
        System.out.println("Your bill is: " + (healthItem * 2 + this.price ));
    }
}
