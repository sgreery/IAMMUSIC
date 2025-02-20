public class MakingArrays {
    int [] Carti = new int [10];
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
        Carti[3] = 17;
        Carti[4] = 24;
        Carti[5] = 3;
        Carti[6] = 4;
        Carti[7] = 14;
        Carti[8] = 26;
        Carti[9] = 16;






        printArray();
    }
    public void printArray(){
        System.out.println(Carti[0]);
        System.out.println(Carti[1]);
        System.out.println(Carti[2]);
        System.out.println(Carti[3]);
        System.out.println(Carti[4]);
        System.out.println(Carti[5]);
        System.out.println(Carti[6]);
        System.out.println(Carti[7]);
        System.out.println(Carti[8]);
        System.out.println(Carti[9]);
    }
}