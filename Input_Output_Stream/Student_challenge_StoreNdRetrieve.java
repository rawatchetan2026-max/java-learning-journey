import java.io.*;

// class Customer implements Serializable {
//     static String custId;
//     String custName;
//     String PhoneNo;
//     int count = 0;

//     Customer() {
//     }

//     Customer(String custName, String PhoneNo) {
//         count++;

//         custId = "C" + count;
//         this.custName = custName;
//         this.PhoneNo = PhoneNo;
//     }

//     public String toString() {
//         return "\n Customer Details :::::\n" + "\n Customer ID : " + custId + "\n Customer Name : " + custName
//                 + "\n Phone Num : " + PhoneNo + "\n";
//     }
// }

// public class Student_challenge_StoreNdRetrieve {
//     public static void main(String[] args) throws Exception {
//         FileOutputStream fos = new FileOutputStream("Shop.txt");
//         ObjectOutputStream oos = new ObjectOutputStream(fos);

//         Customer c1 = new Customer("Chetan Rawat", "8505XXXX92");
//         Customer c2 = new Customer("Aman Rawat", "999XXXXX22");

//         oos.writeObject(c1);
//         oos.writeObject(c2);

//         oos.close();
//         fos.close();

//         FileInputStream fis = new FileInputStream("Shop.txt");
//         ObjectInputStream ooi = new ObjectInputStream(fis);

//         Customer obj1 = (Customer) ooi.readObject();
//         Customer obj2 = (Customer) ooi.readObject();

//         System.out.println(obj1);
//         System.out.println(obj2);

//         fis.close();
//         ooi.close();

//     }
// }
public class Student_challenge_StoreNdRetrieve {
    public static void main(String[] args) throws Exception {

        float list[] = { 1.2f, 3.45f, 6.78f, 9.01f, 2.34f };

        FileOutputStream fos = new FileOutputStream("Stu_challenge.txt");
        DataOutputStream dos = new DataOutputStream(fos);

        dos.writeInt(list.length);
        for (float f : list) {
            dos.writeFloat(f);
        }
        dos.close();
        fos.close();

        FileInputStream fis = new FileInputStream("Stu_Challenge.txt");
        DataInputStream dis = new DataInputStream(fis);

        int length = dis.readInt();

        for (int i = 0; i < length; i++) {
            System.out.println(dis.readFloat());
        }
        dis.close();
        fis.close();

    }
}
