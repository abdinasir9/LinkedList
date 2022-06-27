public class LinkedList
{
    String value ;
    LinkedList next;

    public String getValue()
    {

        return value;
    }
    public LinkedList getNext()
    {

        return next;
    }

    public void setValue(String value)
    {
        this.value = value;
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

}
