import org.junit.Assert;
import org.junit.Test;

public class MyLinkedListTest {
    @Test
    public void given3NumbersWhenAddedToLinkedListShouldAddAtBottom() {
        MyNode<Integer> myFirstNode = new MyNode<Integer>(56);
        MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
        MyNode<Integer> myThirdNode = new MyNode<Integer>(70);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addAtBottom(myFirstNode);
        myLinkedList.addAtBottom(mySecondNode);
        myLinkedList.addAtBottom(myThirdNode);
        myLinkedList.printMyNodes();
        boolean result = myLinkedList.head.equals(myFirstNode) &&
                        myLinkedList.head.getNext().equals(mySecondNode) &&
                        myLinkedList.tail.equals(myThirdNode);
        Assert.assertTrue(result);
    }

    @Test
    public void given3NumbersWhenAddedToLinkedListShouldAddAtTop() {
        MyNode<Integer> myThirdNode = new MyNode<Integer>(56);
        MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
        MyNode<Integer> myFirstNode = new MyNode<Integer>(70);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addAtTop(myFirstNode);
        myLinkedList.addAtTop(mySecondNode);
        myLinkedList.addAtTop(myThirdNode);
        myLinkedList.printMyNodes();
        boolean result = myLinkedList.head.equals(myThirdNode) &&
                myLinkedList.head.getNext().equals(mySecondNode) &&
                myLinkedList.tail.equals(myFirstNode);
        Assert.assertTrue(result);
    }

    @Test
    public void insertingBetweenTwoNodes() {
        MyNode<Integer> myFirstNode = new MyNode<Integer>(56);
        MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
        MyNode<Integer> myThirdNode = new MyNode<Integer>(70);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addAtBottom(myFirstNode);
        myLinkedList.addAtBottom(myThirdNode);
        myLinkedList.insert(myFirstNode,mySecondNode);
        myLinkedList.printMyNodes();
        boolean result = myLinkedList.head.equals(myFirstNode) &&
                myLinkedList.head.getNext().equals(mySecondNode) &&
                myLinkedList.tail.equals(myThirdNode);
        Assert.assertTrue(result);
    }
}
