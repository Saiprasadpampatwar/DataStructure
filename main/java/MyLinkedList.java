public class MyLinkedList {
      public INode tail;
     public INode head;

    public MyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void addAtBottom(INode newNode) {
        if(this.head == null){
            this.head = newNode;
        }
        if(this.tail == null){
            this.tail = newNode;
        }else {
            this.tail.setNext(newNode);
            this.tail = newNode;
        }
    }

    public void addAtTop(INode newNode){
        if(this.tail == null){
            this.tail = newNode;
        }
        if(this.head == null){
            this.head = newNode;
        }else {
            INode tempNode = this.head;
            this.head = newNode;
            head.setNext(tempNode);
        }
    }

    public void printMyNodes(){
        StringBuffer myNodes = new StringBuffer("My nodes: ");
        INode tempNode = head;
        while (tempNode.getNext()!=null){
            myNodes.append(tempNode.getKey());
            if(!tempNode.equals(tail)) myNodes.append("->");
            tempNode = tempNode.getNext();
        }
        myNodes.append(tempNode.getKey());
        System.out.println(myNodes);
    }

    public void insert(INode myNode, INode newNode) {
        INode tempNode = myNode.getNext();
        myNode.setNext(newNode);
        newNode.setNext(tempNode);
    }

    public INode pop() {
        INode tempNode = this.head;
        this.head = head.getNext();
        return tempNode;
    }

    public INode popLast() {
        INode tempNode = head;
        while (!(tempNode.getNext().equals(tail))){
            tempNode = tempNode.getNext();
        }
        this.tail = tempNode;
        tempNode = tempNode.getNext();
        return tempNode;

    }


    public INode searchKey(INode givenNode) {
        INode tempNode = head;
        while (tempNode != null && tempNode.getNext() != null){
            if(tempNode.getKey().equals(givenNode.getKey())){
                return tempNode;
            }
            tempNode = tempNode.getNext();
        }
        return tempNode;
    }

    public <K> void delete(K i) {
        INode tempNode = head, prev = null;

        if(tempNode.getKey()==i && tempNode!=null){
            head = tempNode.getNext();
            return;
        }
        while (tempNode!=null && tempNode.getKey() !=i){
            prev = tempNode;
            tempNode = tempNode.getNext();
        }

        prev.setNext(tempNode.getNext());


    }
}
