interface INTER {
    abstract void display(String str);
}

public class methodRef {
    public static void reverse(String str) {
        StringBuffer sb = new StringBuffer(str);
        sb.reverse();
        System.out.println(sb);
    }

    public static void main(String[] args) {
        INTER d = System.out::println;
        d.display("chetan");
        d.display("chetan1");
        INTER i = methodRef::reverse;
        i.display("NAMAN");
    }
}