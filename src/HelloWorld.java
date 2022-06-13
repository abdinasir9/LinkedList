public class HelloWorld
{

    public static void main(String[] args)
    {
    LinkedList myNewList = new LinkedList();
    myNewList.setValue("Hello World!");
    LinkedList mySecondList = new LinkedList();
    myNewList.setNext(mySecondList);
    LinkedList myThirdList = new LinkedList();
    mySecondList.setNext(myThirdList);
    System.out.println(myNewList.getValue());
    }
}
