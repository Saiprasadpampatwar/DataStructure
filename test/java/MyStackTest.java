import org.junit.Assert;
import org.junit.Test;

public class MyStackTest {
    @Test
    public void given3NumbersWhenAddedToStackShouldHaveLastAddedNode() {
        MyNode<Integer> myFirstNode = new MyNode<Integer>(70);
        MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
        MyNode<Integer> myThirdNode = new MyNode<Integer>(56);
        MyStack myStack = new MyStack();
        myStack.push(myFirstNode);
        myStack.push(mySecondNode);
        myStack.push(myThirdNode);
        myStack.printStack();
        INode peakNode = myStack.prak();
        Assert.assertEquals(myThirdNode,peakNode);
    }
}
