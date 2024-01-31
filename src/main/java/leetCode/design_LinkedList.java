package leetCode;

public class design_LinkedList {
    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList();
        linkedList.addAtTail(1);
        linkedList.addAtTail(3);
        int get = linkedList.get(1);

    /*

Input: ["leetCode.MyLinkedList","addAtTail","addAtTail","get"]
[[],[1],[3],[1]]
Output: [null,null,null,-1]
Expected: [null,null,null,3]

*/
    }

}
class MyLinkedList {
    private class Node {
        public int val;
        public Node next;
        public Node(int val){
            this.val = val;
            this.next = null;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public MyLinkedList() {
        this.size = 0;
        this.head = null;
        this.tail = null;
    }

    public int get(int index) {

        if(index < 0 | index > size) return -1;

        Node result = this.head;
        for(int i = 0; i<index; i++) result = result.next;

        return result != null ? result.val : -1;
    }

    public void addAtHead(int val) {
        Node nodeAdded = new Node(val);
        nodeAdded.next = head;
        this.head = nodeAdded;

        if(nodeAdded.next == null) tail = head;
        ++size;
    }

    public void addAtTail(int val) {
        Node nodeAtTail = new Node(val);
        if(tail == null & size == 0) head = nodeAtTail;
        if(tail != null) tail.next = nodeAtTail;
        tail = nodeAtTail;
        size++;
    }

    public void addAtIndex(int index, int val) {
        Node addNode = new Node(val);

        if(index < 0 | index > size) return;

        if(size == 0 || index == 0) addAtHead(val);
        else if(index == size) addAtTail(val);

        else{
            Node puntero = head;

            for(int i = 0; i < index-1; i++) puntero = puntero.next;

            Node prev = puntero;
            puntero = puntero.next;
            prev.next = addNode;
            addNode.next = puntero;

            ++size;
        }

    }

    public void deleteAtIndex(int index) {
        if(index < 0 | size == 0 | index > size | index==size) return;

        else if(index == 0){
            head = head.next;
            --size;
            if(size == 0) tail = null;
        }else{
            Node puntero = head;
            for(int i = 1; i < index; i++){
                if((puntero.next) !=null)puntero = puntero.next;
            }
           // if(puntero == null) return;
            if(puntero.next != null) puntero.next = puntero.next.next;
            if(puntero.next == null) tail = puntero;

            --size;

        }
    }
}
