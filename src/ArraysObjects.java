public class ArraysObjects {
    public static void main(String[] args) {
        ArraysObjects a = new ArraysObjects();
    }
    Pizza[] kat = new Pizza [10];
    public ArraysObjects(){
        Pizza s = new Pizza(12.99);
        kat[0] = s;
        kat[0].printInfo();
        System.out.println("Making arrays with objects!");
    }
}
