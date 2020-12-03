public class MyNode<K extends Comparable<K>> implements INode<K>{
    private K key;
    private INode next;

    public MyNode(K key ){
        this.key = key;
        this.next = null;
    }

    @Override
    public K getKey() {
        return this.key;
    }

    @Override
    public void setKey(K key) {
        this.key = key;
    }

    public INode getNext() {
        return this.next;
    }

    public void setNext(INode next) {
        this.next = next;
    }


}
