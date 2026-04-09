package GenericDemo;

import java.util.Arrays;

@SuppressWarnings("unchecked") // annotation used to prevent warning
class MyArr<T> {
    T A[] = (T[]) new Object[10]; // converting object to generic
    int length = 0;

    public void append(T obj) {
        A[length++] = obj;
    }

    public void display() {
        System.out.println(Arrays.toString(A));
    }

}

class MyArr1 extends MyArr<String> { // chid class (a subtype eg.)
}

class MyArr2<T extends Number> extends MyArr<T> {
} // bounded type Example and extends works for even interfaces

public class ClassMyArray {
    public static void main(String[] args) {
        MyArr<Integer> ma = new MyArr<Integer>();
        ma.append(1);
        ma.append(2);
        ma.append(3);
        ma.display();

        MyArr1 ma1 = new MyArr1();
        ma1.append("Good");
        ma1.append("nigth");
        // ma1.append(1); only string type is valid rn
        ma1.display();

        // MyArr2<String> ma2 = new MyArr2<>(); can't be use as it only hold a sub class
        // of Number
        MyArr2<Float> ma2 = new MyArr2<>();
        ma2.append(1.323f);
        ma2.append(22.212f);
        ma2.append(3.908f);
        ma2.display();

    }
}
