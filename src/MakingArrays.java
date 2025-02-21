public class MakingArrays {
    public int Carti[] = new int [(int)(100*Math.random())];
    public double total;
    public static void main(String[] args) {
        System.out.println("Hello world!");
        MakingArrays make = new MakingArrays();

    }

    public MakingArrays(){
        System.out.println("seeyuh");
        System.out.println("fwaeh");
        System.out.println("bububu");
        System.out.println("polannd");
        System.out.println("Carti");
        for (int x=0; x<Carti.length; x++){
            Carti[x] = (int)(100*Math.random());
        }

        printArray();
    }
    public void printArray(){

        for(int x=0; x < Carti.length; x=x+1){
            System.out.println(Carti[x]);
        }
        for(int x=0; x < Carti.length; x=x+1){
            total = total + Carti[x];
        }
        System.out.println("The total is " + total);
        System.out.println("The average is " + total/Carti.length);

    }
}