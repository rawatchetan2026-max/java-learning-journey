public class langdemo {
    // Class Object
    public static void main(String[] args) {
        Myobj o = new Myobj();
        Myobj o1 = new Myobj();
        System.out.println(o.equals(o1));
        System.out.println(o.toString());
        System.out.println(o.hashCode());

    }
}

class Myobj { 
    public String toString(){
     

    
    public int hashCode() {
        return 100;
    }

    public boolean equals(Object o) {
        return this.hashCode() == o.hashCode();
    }
}
