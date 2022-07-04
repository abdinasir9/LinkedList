public class HelloWorld
{

    public static void main(String[] args)
    {
    LinkedList myNewList = LinkedList.createNode("A");
    LinkedList mySecondNewList = LinkedList.createNode("B");
    LinkedList myThirdNewList = LinkedList.createNode("C");
    LinkedList myFourthNewList = LinkedList.createNode("D");
    myNewList.setNext(mySecondNewList);
    mySecondNewList.setPrevious(myNewList);
    mySecondNewList.setNext(myThirdNewList);
    myThirdNewList.setPrevious(mySecondNewList);
    myThirdNewList.setNext(myFourthNewList);
    myFourthNewList.setPrevious(myThirdNewList);
    LinkedList myDeletion = myNewList.deleteNode("D");
//    LinkedList myResult =  myNewList.searchNode("C");
    System.out.println(myDeletion);
    System.out.println("test");
    }

}
