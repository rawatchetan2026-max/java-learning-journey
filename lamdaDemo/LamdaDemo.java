// public class LamdaDemo {

//     @FunctionalInterface
//     interface MyInterface {
//         public void show();
//     }

//     public static void main(String[] args) {
// anonymous class 
//         MyInterface obj = new MyInterface() {
//             public void show() {
//                 System.out.println("hello world");
//             }
//         };
//         obj.show();
//     }
// }
public class LamdaDemo {
    interface MyInterface {
        public void show();
    }

    interface INterface {
        public int add(int a, int b);
    }

    public static void main(String[] args) {
        MyInterface obj = () -> {
            System.out.println("hello world");
        };
        INterface obj1 = (a, b) -> a + b;
        obj.show();
        int r = obj1.add(4, 5);
        System.out.println(r);
    }

}