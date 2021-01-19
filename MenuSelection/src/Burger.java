import java.util.Scanner;

public class Burger {
    private String breadType;
    private String meat;
    private String lattuce;
    private String tomato;
    private String cheese;
    private String sauce;
    private int items;
    private int price;

    public Burger (){

    }
    public int getPrice() {

        return price;
    }

    public int getItems() {
        return items;
    }



    public Burger(String breadType, String meat, int price) {
        this.breadType = breadType;
        this.meat = meat;
       this.lattuce = lattuce;
       this.tomato = tomato;
       this.cheese = cheese;
       this.sauce = sauce;
       this.items = 0;
       this.price = price;
    }

    public void  AddIngredient(){
        System.out.println("Choose an ingredient from the list below:");
        System.out.println("1 - lettuce");
        System.out.println("2 - tomato");
        System.out.println("3 - cheese");
        System.out.println("4 - sauce");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();



        switch (choice){
            case 1:
                System.out.println("Lettuce");
                items ++;
                price += 2;
        }


    }

    public void Total (){

        System.out.println("Your bill is: " + (items * 2 + price));
    }
    public void SubtractIngredient(String ingredient){

        this.items -= 1;
    }
    public String getBreadType() {
        return breadType;
    }

    public String getMeat() {
        return meat;
    }

    public String getLattuce() {
        return lattuce;
    }

    public String getTomato() {
        return tomato;
    }

    public String getCheese() {
        return cheese;
    }

    public String getSauce() {
        return sauce;
    }
}
