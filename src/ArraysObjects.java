public class ArraysObjects {
    public static void main(String[] args) {
        ArraysObjects a = new ArraysObjects();
    }
    Pizza[] kat = new Pizza [10];
    public ArraysObjects(){
        Pizza s = new Pizza(12.99);
        for(int x = 0; x<10; x++){
            kat[x]=s;
            kat[x].printInfo();
        }


        System.out.println("Making arrays with objects!");
    }
}
