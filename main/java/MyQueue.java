public class MyQueue {
    private final MyLinkedList myLinkedList;

    public MyQueue() {
        this.myLinkedList = new MyLinkedList();
    }

    public void enqueue(INode myNode) {
        myLinkedList.addAtBottom(myNode);
    }

    public void printQueue() {
        myLinkedList.printMyNodes();
    }
}
