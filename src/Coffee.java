import java.util.* ;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Coffee {
    protected String name;
    protected double price;

    protected int numOrdered;

    public Coffee(String name, double price, int numOrdered){
        this.name = name;
        this.price = price;
        this.numOrdered = numOrdered;
    }


    public static void main(String[] args){
        //creates a scanner object
        Scanner order = new Scanner(System.in);
        boolean isPlacingOrder = true;

        //creates coffee objects
        Coffee mocha = new Mocha();
        Coffee espresso = new Espresso();
        Coffee latte = new Latte();

        Coffee[] coffees = {mocha, espresso, latte};
        System.out.println("=============================");
        System.out.println("Welcome to the coffee shop!!");
        System.out.println("=============================");
        System.out.println("1. Latte");
        System.out.println("2. Espresso");
        System.out.println("3. Mocha");
        System.out.println("4. Checkout");
        System.out.println("=============================");

        while(isPlacingOrder){

            System.out.println("Type the number for the coffee you'd like to order.");

            String customerOrder = order.nextLine();

            //depending on the number pushed, increment number of specific coffee by 1
            switch(customerOrder){
                case "1":
                    latte.numOrdered++;
                    break;
                case "2":
                    espresso.numOrdered++;
                    break;
                case "3":
                    mocha.numOrdered++;
                    break;
                case "4":
                    double total = 0;
                    System.out.println("You ordered: ");
                    for(Coffee coffee : coffees){
                        total = total + (coffee.numOrdered * coffee.price);
                        System.out.println(coffee.numOrdered + " " + coffee.name);
                    }

                    /*Big decimal is a package that has a setScale method to round numbers, the rounding mode HALF UP
                    * checks to see what the next place over is, if equal distant then will round up by default
                    * other methods can be found
                    * https://docs.oracle.com/javase/8/docs/api/java/math/RoundingMode.html
                    * Other ways to round decimal points:
                    * https://www.javatpoint.com/how-to-round-double-and-float-up-to-two-decimal-places-in-java */

                    BigDecimal num = new BigDecimal(total).setScale(2, RoundingMode.HALF_UP);
                    total = num.doubleValue();
                    System.out.println("Your total is: $" + total + ". Thank you for shopping with us!");
                    isPlacingOrder = false;
                    break;
            }
        }
   }
}

