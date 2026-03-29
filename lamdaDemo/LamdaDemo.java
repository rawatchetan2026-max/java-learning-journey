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

    public static void main(String[] args) {
        MyInterface obj = () -> {
            System.out.println("hello world");
        };
        obj.show();
    }

}