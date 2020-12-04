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

    @Test
    public void poppingFirstElement() {
        MyNode<Integer> myFirstNode = new MyNode<Integer>(56);
        MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
        MyNode<Integer> myThirdNode = new MyNode<Integer>(70);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addAtBottom(myFirstNode);
        myLinkedList.addAtBottom(mySecondNode);
        myLinkedList.addAtBottom(myThirdNode);
        myLinkedList.pop();
        myLinkedList.printMyNodes();
        boolean result = myLinkedList.head.equals(mySecondNode) &&
                        myLinkedList.tail.equals(myThirdNode);
        Assert.assertTrue(result);
    }

    @Test
    public void poppingLastElement() {
        MyNode<Integer> myFirstNode = new MyNode<Integer>(56);
        MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
        MyNode<Integer> myThirdNode = new MyNode<Integer>(70);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addAtBottom(myFirstNode);
        myLinkedList.addAtBottom(mySecondNode);
        myLinkedList.addAtBottom(myThirdNode);
        INode deletedNode = myLinkedList.popLast();
        Assert.assertEquals(myThirdNode,deletedNode);

    }

    @Test
    public void searchingGivenNode() {
        MyNode<Integer> myFirstNode = new MyNode<Integer>(56);
        MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
        MyNode<Integer> myThirdNode = new MyNode<Integer>(70);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addAtBottom(myFirstNode);
        myLinkedList.addAtBottom(mySecondNode);
        myLinkedList.addAtBottom(myThirdNode);
        INode result = myLinkedList.searchKey(mySecondNode);
        myLinkedList.printMyNodes();
        Assert.assertEquals(mySecondNode,result);

    }

    @Test
    public void adding40After30() {
        MyNode<Integer> myFirstNode = new MyNode<Integer>(56);
        MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
        MyNode<Integer> myThirdNode = new MyNode<Integer>(70);
        MyNode<Integer> myNewNode = new MyNode<Integer>(40);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addAtBottom(myFirstNode);
        myLinkedList.addAtBottom(mySecondNode);
        myLinkedList.addAtBottom(myThirdNode);
        myLinkedList.insert(mySecondNode,myNewNode);
        myLinkedList.printMyNodes();
        boolean result = mySecondNode.getNext().equals(myNewNode);
        Assert.assertTrue(result);

    }

    @Test
    public void deleteNodeWithValue40AndThenSizeShouldBe3() {
        MyNode<Integer> myFirstNode = new MyNode<Integer>(56);
        MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
        MyNode<Integer> myThirdNode = new MyNode<Integer>(70);
        MyNode<Integer> myNewNode = new MyNode<Integer>(40);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addAtBottom(myFirstNode);
        myLinkedList.addAtBottom(mySecondNode);
        myLinkedList.addAtBottom(myThirdNode);
        myLinkedList.insert(mySecondNode,myNewNode);
        myLinkedList.printMyNodes();
        INode deletedNode = myLinkedList.delete(40);
        System.out.println("Size of LinkedList is: "+myLinkedList.size());
        Integer size = myLinkedList.size();
        myLinkedList.printMyNodes();
        Assert.assertEquals((Integer) 3,size);
        Assert.assertEquals(myNewNode,deletedNode);
    }
}
