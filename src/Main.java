public class Main {
    public static void main(String[] args) {

       System.out.println("Order 1 Margarita Pizza with Extra cheese and Veggies ");

       Pizza margaretPizza = new Margherita();
       CheeseDecorator cheeseMargharetaPizza = new CheeseDecorator(margaretPizza);
       VeggiesDecorator VeggieCheeseMargaretPizza = new VeggiesDecorator(cheeseMargharetaPizza);

       System.out.println(VeggieCheeseMargaretPizza.cost());

       System.out.println("Order 1 Green Godess Pizza with Extra cheese and Jalepeno ");

       Pizza greenGodessPizza = new GreenGoddess();
       JalepenoDecorator jalepenoGreengodess = new JalepenoDecorator(greenGodessPizza);
       CheeseDecorator cheeseJalepenoGreenGds = new CheeseDecorator(jalepenoGreengodess);
       System.out.println(cheeseJalepenoGreenGds.cost());



    }
}