public class LinkedList
{
    String value ;
    LinkedList next;

    LinkedList previous;
    public String getValue()
    {

        return value;
    }

    public LinkedList getPrevious()
    {
        return previous;
    }

    public LinkedList getNext()
    {

        return next;
    }

    public void setValue(String value)
    {
        this.value = value;
    }

    public void setPrevious(LinkedList previous)
    {
        this.previous = previous;
    }

    public void setNext(LinkedList next)
    {
        this.next = next;
    }
    public static LinkedList createNode(String value){
        LinkedList methodLinkedList = new LinkedList();
        methodLinkedList.setValue(value);
        return methodLinkedList;
    }
    public void addNode(String value){
        LinkedList current = this;
        while(current.next != null){
            current = current.next;
        }
        LinkedList newNode = createNode(value);
        newNode.setPrevious(current);
        current.setNext(newNode);

    }
    public  LinkedList searchNode(String value)
    {   LinkedList current = this;
        while (current != null)
        {
            if (current.value.equals(value))
            {
                return current;
            }
            current = current.next;
        }
        return null;
    }

//    public LinkedList deleteNode(String value)
//    {
//        LinkedList current = this;
//        LinkedList myPrevious =this.previous;
//        while(current != null){
//            if(current.value.equals(value)){
//                current.next = null;
//                current.previous = null;
//
//                return current;
//            }
//            current = current.next;
//        }
//        return null;
//    }
    public LinkedList deleteNode(String value)
    {
        LinkedList current = this;
        LinkedList obj1;
        LinkedList obj2;
        while (current != null)
        {
            if (current.value.equals(value) && current.previous == null)
            {
                System.out.println("found it");
                obj1 = current.next;
                obj1.previous = null;
                current.next = null;
                return current;
            } else if (current.value.equals(value) && current.next == null)
            {
                obj1 = current.previous;
                obj1.next = null;
                current.previous = null;
                return current;
            } else if (current.value.equals(value))
            {
                System.out.println("found it");
                obj1 = current.previous;
                obj2 = current.next;
                obj1.next = obj2;
                obj2.previous = obj1;
                current.next = null;
                current.previous = null;
                return current;
            }
            else
            {
                current = current.next;
            }
            }
        return null;
    }

};
