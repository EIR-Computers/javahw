import java.util.ArrayList;

public class Main {

    private class Node {
        private int value;
        private Node nextNode;
        private Node prevNode;

        public Node(int v) {
            value = v;
            nextNode = null;
            prevNode = null;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int v) {
            value = v;
        }

        public Node getNextNode() {
            return nextNode;
        }

        public void setNextNode(Node n) {
            nextNode = n;
        }

        public Node getPrevNode() {
            return prevNode;
        }

        public void setPrevNode(Node n) {
            prevNode = n;
        }
    }

    // Holds a reference to the head and tail of the list
    private Node headNode;
    private Node tailNode;

    public Main() {
        headNode = null;
        tailNode = null;
    }

    public void addAtHead(int o) {
        Node newNode = new Node(o);
        newNode.setNextNode(headNode);
        if (headNode != null)
            headNode.setPrevNode(newNode);
        headNode = newNode;
        // special case for empty list
        if (tailNode == null)
            tailNode = newNode;
    }

    public void addAtTail(int o) {
        Node newNode = new Node(o);
        // this means that headNode == null too!
        if(tailNode == null){
            tailNode = newNode;
            headNode = newNode;
        }else{
            newNode.setPrevNode(tailNode);
            tailNode.setNextNode(newNode);
            tailNode = newNode;
        }
    }

    public int deleteAtHead() {
        // list is empty
        if(headNode == null){
            headNode = null;
            tailNode = null;
            return -1;
        }
        // singleton: must update tailnode too
        if(headNode == tailNode){
            int res = headNode.getValue();
            headNode = null;
            tailNode = null;
            return res;
        }

        int res = headNode.getValue();
        headNode = headNode.getNextNode();
        headNode.setPrevNode(null);
        return res;
    }

    public int deleteAtTail() {
        // list is empty
        if(tailNode == null){
            headNode = null;
            tailNode = null;
            return -1;
        }
        // singleton: must update tailnode too
        if(headNode == tailNode){
            int res = tailNode.getValue();
            headNode = null;
            tailNode = null;
            return res;
        }
        int res = tailNode.getValue();
        tailNode = tailNode.getPrevNode();
        tailNode.setNextNode(null);
        return res;
    }

    public int delete(Node n) {
        if (n == null)
            return -1;
        Node next = n.getNextNode();
        Node prev = n.getPrevNode();
        int val = n.getValue();
        if (prev != null)
            prev.setNextNode(next);
        if (next != null)
            next.setPrevNode(prev);
        // deleting at the end
        if (n == tailNode)
            tailNode = prev;
        // deleteing at beginning
        if (n == headNode)
            headNode = next;
        return val;
    }

    public void insertAfter(Node n, int val) {
        if (n == null) { // this is the headNode
            addAtHead(val);
            return;
        }
        Node next = n.getNextNode();
        Node newNode = new Node(val);
        newNode.setPrevNode(n);
        newNode.setNextNode(next);
        n.setNextNode(newNode);
        if (next == null) { // insert at tail
            tailNode = newNode;
        } else {
            next.setPrevNode(newNode);
        }
    }

    // computes the size of the list
    public int size() {
        if (headNode == null)
            return 0;
        Node n = headNode;
        int size = 0;
        while (n != null) {
            size++;
            n = n.getNextNode();
        }
        return size;
    }

    // Predicate to check if the linked list is sorted
    public boolean isSorted() {
        if (headNode == null || headNode.nextNode == null)
            return true;
        Node i = headNode.nextNode;
        while (i != null) {
            if (i.getValue() < i.getPrevNode().getValue())
                return false;
            i = i.nextNode;
        }
        return true;
    }

    public void sortedInsert(int insertItem){
        Node newNode = new Node(insertItem);
        if(headNode == null){
            headNode = tailNode = newNode;
            return;
        }
        else {
            Node temp = new Node(insertItem);
            Node current = headNode;

            while((current != null) && current.getValue() < insertItem){
                temp = current;
                current = current.getNextNode();
            }
            if(current == headNode){
                addAtHead(insertItem);
                return;
            }
            if (current == null){
                addAtTail(insertItem);
                return;
            }
            temp.setNextNode(newNode);
            newNode.setNextNode(current);
            current.setPrevNode(newNode);
            newNode.setPrevNode(temp);
        }
    }
    public String toString()
    {
        Node n = headNode;
        StringBuffer buf = new StringBuffer();
        while (n != null) {
            buf.append(n.getValue());
            buf.append(" ");
            n = n.getNextNode();
        }
        return buf.toString();
    }

    public static void main(String[] args) {
        Main d = new Main();
        String beforeSort = "";
        d.sortedInsert(4);
        beforeSort+=" 4";
        d.sortedInsert(1);
        beforeSort+=" 1";
        d.sortedInsert(7);
        beforeSort+=" 7";
        d.sortedInsert(10);
        beforeSort+=" 10";

        System.out.println("Before sort: " + beforeSort);
        System.out.println("After sort: " + d);
    }
}