package GenericDemo;

public class GenericMethod {
    static <T> void show(T[] list) {
        for (T x : list) {
            System.out.println(x);
        }
    }

    public static void main(String[] args) {
        show(new String[] { "chetan", "rawat" });
        ;
    }
}
