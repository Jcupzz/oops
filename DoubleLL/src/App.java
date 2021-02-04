import java.util.Scanner;

public class App {

  public static void main(String[] args) {

    DoublyLinkedList doubleLinkedList = new DoublyLinkedList();
    Node node = new Node();
    Scanner scanner = new Scanner(System.in);

    int choice;
    while (true) {
      System.out.println(
          "\nEnter your choice:\n1.Insert at beginning\n2.Insert at end\n3.Delete at beginning\n4.Delete at Last\n5.Display\n6.Quit");
      choice = scanner.nextInt();
      switch (choice) {
        case 1:
          doubleLinkedList.insertFirst();
          break;
        case 2:
          doubleLinkedList.insertLast();
          break;
        case 3:
          doubleLinkedList.deleteFirst();
          break;
        case 4:
          doubleLinkedList.deleteLast();
          break;
        case 5:
          doubleLinkedList.printLinkedList();
          break;
        case 6:
          System.exit(0);
          break;
        default:

          break;
      }
    }
  }

}