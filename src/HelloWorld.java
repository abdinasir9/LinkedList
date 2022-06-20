public class HelloWorld
{

    public static void main(String[] args)
    {
    LinkedList myNewList = LinkedList.newLinkedList("A");
    LinkedList mySecondNewList = LinkedList.newLinkedList("B");
    myNewList.setNext(mySecondNewList);
    LinkedList myThirdNewList = LinkedList.newLinkedList("c");
    mySecondNewList.setNext(myThirdNewList);
    LinkedList myFourthNewList = LinkedList.newLinkedList("d");
    myThirdNewList.setNext(myFourthNewList);
    LinkedList myResult =  myNewList.searchLinkedList("c");
    System.out.println("test");
    }

}
