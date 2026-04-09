package GenericDemo;

class Data<T> {// This is a generic class

    // Variable of type T unknown type decided later
    private T obj;

    public void setData(T obj) {
        this.obj = obj;
    }

    public T getData() {
        return obj;
    }
}

// Main class where program starts
public class GenericCode {
    public static void main(String[] args) {

        // Creating object of Data class with type String
        // Now T will behave like String everywhere in the class
        Data<String> obj = new Data<>();

        obj.setData("hello world");

        // No need for type casting because of generics
        // Printing the value
        System.out.println(obj.getData());
    }
}