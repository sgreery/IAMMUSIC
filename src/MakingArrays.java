public class MakingArrays {
    public int Carti[] = new int [(int)(100*Math.random())]; //Creates an array that has a random amount of indexes from 1-100
    public double total; //Declares the variable total
    public static void main(String[] args) { //Makes the array called make and prints hello world
        System.out.println("Hello world!");
        MakingArrays make = new MakingArrays();

    }

    public MakingArrays(){
        System.out.println("seeyuh");//Message
        System.out.println("fwaeh");//Message
        System.out.println("bububu");//Message
        System.out.println("polannd");//Message
        System.out.println("Carti");//Message
        for (int x=0; x<Carti.length; x++){//Makes each index of the array given a value from 1-100
            Carti[x] = (int)(100*Math.random());
        }

        printArray();//Calls the printArray Method
    }
    public void printArray(){

        for(int x=0; x < Carti.length; x=x+1){//Prints out each index of the array
            System.out.println(Carti[x]);
        }
        for(int x=0; x < Carti.length; x=x+1){//Calculates the sum of all the indexes
            total = total + Carti[x];
        }
        System.out.println("The total is " + total);//Prints the total
        System.out.println("The average is " + total/Carti.length);//Divides the total by the number of indexes to print the average

    }
}