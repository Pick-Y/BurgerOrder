import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Burger myBurger = new Burger();
        HealthyBurger myHealthyBurger = new HealthyBurger();
        Deluxe deluxeBurger = new Deluxe("Black", "Angus", 12);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Select additional ingredient");
        System.out.println("1 - Normal Burger (Meat)");
        System.out.println("2 - Healthy Burger");
        System.out.println("3 - Deluxe Burger");
        int choice = scanner.nextInt();



        switch (choice) {
            case 1:

                myBurger = new Burger("White Bread", "Beef", 8);
                System.out.println("Your burger has the following ingredients:");
                System.out.println(myBurger.getBreadType());
                System.out.println(myBurger.getMeat());
                System.out.println("and costs $ " + myBurger.getPrice());
                String str = "";
                while(myBurger.getItems() < 4 ){
                    Scanner yes = new Scanner(System.in);

                    System.out.println("Do you want to add any other ingredients? y/n:");

                    System.out.print("Enter a string: ");

                    if(yes.hasNextLine()){

                        str = yes.nextLine();

                    }

                    if(str.matches("y")){

                        myBurger.AddIngredient();

                    }
                    else{

                        myBurger.Total();
                        break;

                    }
                    if(myBurger.getItems() == 4){
                        myBurger.Total();
                    }
                }
                break;
            case 2:
                   myHealthyBurger = new HealthyBurger(myHealthyBurger.getBreadType(), "Chicken",10);
                    System.out.println("Your burger has the following ingredients:");
                    System.out.println(myHealthyBurger.getBreadType());
                    System.out.println(myHealthyBurger.getMeat());
                    System.out.println("and costs $ " + myHealthyBurger.getPrice());


                String line ="";
                while( myHealthyBurger.getHealthItem() < 6 ){
                    Scanner yes = new Scanner(System.in);

                    System.out.println("Do you want to add any other ingredients? y/n:");

                    System.out.print("Enter a string: ");

                    if(yes.hasNextLine()){

                        line = yes.nextLine();

                    }

                    if(line.matches("y")){

                        myHealthyBurger.AddIngredient();

                    }
                    else{

                        myHealthyBurger.Total();
                        break;

                    }
                    if(myHealthyBurger.getItems() == 6){
                        myBurger.Total();
                    }
                }
                break;
            case 3:

                System.out.println("Your burger has the following ingredients:");
                System.out.print(deluxeBurger.getBreadType());
                System.out.println(deluxeBurger.getMeat());
                System.out.println("and costs $ " + deluxeBurger.getPrice());
                break;

                }
                deluxeBurger.Total();

        }

}

