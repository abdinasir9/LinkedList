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
    public static LinkedList newLinkedList(String value){
        LinkedList methodLinkedList = new LinkedList();
        methodLinkedList.setValue(value);
        return methodLinkedList;
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
    public void addNode(String value){
        LinkedList current = this;
        while(current.next != null){
            current = current.next;
        }
       LinkedList newNode = newLinkedList(value);
        newNode.setPrevious(current);
        current.setNext(newNode);

    }
//    public LinkedList deleteNode(String value){
//        LinkedList current = this;
//        LinkedList previous = null;
//    while(current !=null){
//        if (current.value.equals(value)){
//            previous.next =
//
//        }
//    }
//
//    }
}
