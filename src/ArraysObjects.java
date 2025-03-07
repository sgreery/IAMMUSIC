public class ArraysObjects {
    public static void main(String[] args) {
        ArraysObjects a = new ArraysObjects();
    }
    Pizza[] kat = new Pizza [10];
    public ArraysObjects(){
        Pizza s = new Pizza(12.99);
        for(int x = 0; x<10; x++){
            kat[x]= new Pizza(Math.random()*500);
        }
        Pizza s1 = new Pizza(10.00);
        kat[1] = s1;
        changeSizes();
        printArray();
        totalPizzaSlices();
        biggestPizzaOrder();


        System.out.println("Making arrays with objects!");
    }
    public void printArray(){
        for(int x = 0; x<kat.length; x++){
            kat[x].printInfo();
        }
    }
    public void changeSizes(){
        for(int x = 0; x<kat.length; x++){
            kat[x].size = (int) (Math.random() * 10) + 10;
        }
    }
    public void totalPizzaSlices(){
        int sum = 0;
        for(int x = 0; x<kat.length; x++){
            sum = sum +kat[x].size;
        }
        System.out.println("Total slices: " + sum);
    }
    public void biggestPizzaOrder(){
        int biggestOrder = 0;
        for(int x = 0; x<kat.length; x++){
            if(kat[x].size>biggestOrder){
                biggestOrder = kat[x].size;
            }
        }
        System.out.println("The most ordered slices is: " + biggestOrder);
    }
}
