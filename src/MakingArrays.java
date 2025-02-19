public class MakingArrays {
    int [] Carti = new int [3];
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
        Carti[0] = 5;
        Carti[1] = 10;
        Carti[2] = Carti[1]*3;
        printArray();
    }
    public void printArray(){
        System.out.println(Carti[0]);
        System.out.println(Carti[1]);
        System.out.println(Carti[2]);
    }
}