public class MyStack {


    private final MyLinkedList myLinkedList;

    public MyStack() {
        this.myLinkedList = new MyLinkedList();
    }

    public void push(INode myNode) {
        myLinkedList.addAtTop(myNode);
    }

    public void printStack() {
        myLinkedList.printMyNodes();
    }

    public INode prak() {
        return myLinkedList.head;
    }
}
