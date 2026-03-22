class Test1 {
    static {
        System.out.println("block 1");
    }
    static {
        System.out.println("block 2");
    }

}

public class Static_Blocks {

    public static void main(String[] args) {
        Test1 t = new Test1();
        System.out.println("main fn");
    }

}
