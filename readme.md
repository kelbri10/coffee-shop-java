# Coffee Shop CLI Application

The Coffee Shop CLI is a super simple application that allows the user to select the coffee they would like to order from a predetermined selection. Once they are ready to checkout, they will receive their total, rounded to the nearest

## Diving Deeper

```java
import java.util.* ;
import java.math.BigDecimal;
import java.math.RoundingMode;
```
I utilized the above packages to create this CLI app. The util library allows me access to the Scanner class, which takes user input and turns it into a Scanner object to be used in my code.

```
Scanner order = new Scanner(System.in);
```
The ```boolean isPlacingOrder``` tracks whether the user wants to continue to add to their order or if they have completed their order and would like to receive their total. 
Using the Scanner object I created, I read the user input using the ```nextLine()``` method.
```
String customerOrder = order.nextLine();
```
The parent class, Coffee, is what I used to extend the constructor to the Mocha, Espresso, and Latte child classes. The ```super()``` constructor is how I defined the child objects. Through inheritance, the instance fields from the Coffee superclass are extended to its subclasses.
```
public class Mocha extends Coffee{
    public Mocha(){
        super("mocha", 4.99, 0);
    }
}
```
As the user adds to their order, the ```numOrdered``` instance field increments by 1. The value is tracked in the respective object. For example, if the user already has 2 lattes, ```latte.numOrdered``` would return 2. 

The objects are explicitly instantiated as members of the parent class. 
```
 //creates coffee objects
 
  Coffee mocha = new Mocha();
  Coffee espresso = new Espresso();
  Coffee latte = new Latte();
```
At compile time, the objects are perceived by the program as Coffee objects. Since I don't have any child class specific methods that need to be enacted upon by my objects, this worked best. However if I did want to add more specific preparation or order questions, having these objects instantiated as their child classes would be more beneficial because the child methods would be accessible at run-time.

## Contributing

Pull requests are welcome. For major changes, please open an issue first
to discuss what you would like to change.


## License

[MIT](https://choosealicense.com/licenses/mit/)