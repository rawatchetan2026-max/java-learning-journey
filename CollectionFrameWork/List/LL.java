// implementation of a singly Linked list....

class LL {
    Node Head;

    class Node {
        String data;
        Node Next = null;
    }

    public void addFirst(String data) {

        Node newNode = new Node();
        newNode.data = data;

        if (Head == null) {
            Head = newNode;
            return;
        }

        newNode.Next = Head;
        Head = newNode;

    }

    public void addLast(String data) {

        Node newNode = new Node();
        newNode.data = data;

        if (Head == null) {
            Head = newNode;
            return;
        }

        Node currNode = Head;

        while (currNode.Next != null) {
            currNode = currNode.Next;
        }

        currNode.Next = newNode;

    }

    public void display() {

        if (Head == null) {
            System.out.println("LL is empty ");
            return;
        }

        Node currNode = Head;

        while (currNode != null) {
            System.out.print(currNode.data + " --> ");
            currNode = currNode.Next;
        }

        System.out.print("Null");

    }

    public void delFirst() {

        if (Head == null) {
            System.out.println("LL is empty");
            return;
        }

        Head = Head.Next;
        System.out.println("first Node deleted !!!!");

    }

    public void delLast() {

        if (Head == null) {
            System.out.println("LL is empty");
            return;
        }
        if (Head.Next == null) {
            Head = null;
            return;
        }

        Node currNode = Head;
        while (currNode.Next.Next != null) {
            currNode = currNode.Next;
        }
        currNode.Next = null;
        System.out.println("Last Node Deleted !!!!");

    }

    public void rev() {
        Node prevNode = Head;
        Node currNode = Head.Next;
        while (currNode != null) {
            Node nextNode = currNode.Next;
            currNode.Next = prevNode;

            prevNode = currNode;
            currNode = nextNode;

        }

    }

    public int getSize() {
        int size = 0;
        Node curr = Head;
        while (curr != null) {
            size++;
            curr = curr.Next;
        }
        return size;
    }

    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst("a");
        list.addFirst("is");
        list.addFirst("this");
        list.addLast("Singly Linked List");
        System.out.println(list.getSize());
        list.display();
        System.out.println();
        list.delLast();
        list.display();
        System.out.println();
        System.out.println(list.getSize());

    }
}
