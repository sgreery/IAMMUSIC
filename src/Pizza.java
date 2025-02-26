public class Pizza {
    //variables ingredient, type, price, size(number of slices), hotness
    String ingredient;
    String type;
    double price;
    int size;
    boolean isHot;

    public Pizza(double x){
        ingredient = "Cheese";
        type = "New york";
        price = x;
        size = 8;
        isHot = true;
    }
    public void printInfo(){
        System.out.println("The price is: " + price);
        System.out.println("The type of pizza is " + type);
        System.out.println("The number of slices is"+size);
        System.out.println("The main ingredient is"+ingredient);
        System.out.println("The fact that the pizza is hot is "+isHot);
    }
}
