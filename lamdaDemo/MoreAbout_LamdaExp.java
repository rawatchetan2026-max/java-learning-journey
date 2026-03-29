public class MoreAbout_LamdaExp {
    public static void main(String[] args) {
        demo d = new demo();
        d.meth1();
    }
}

interface MyLamda {
    abstract void display();
}

class Uselambda {
    public void callLambda(MyLamda obj) {
        obj.display();
    }
}

class demo {
    int c = 0;

    public void meth1() {
        // int count = 0;
        // int x = 0;
        // MyLamda obj = () -> {System.out.println("hii.." + count +x+ c++);};
        // obj.display();
        Uselambda ul = new Uselambda();
        ul.callLambda(() -> {
            System.out.println("Hello");
        });
    }
}