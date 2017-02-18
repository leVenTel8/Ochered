
public class QueueApp {
    public static void main(String[] args){
        Deque theQueue = new Deque(5);

        theQueue.insertRight(10);
        theQueue.insertRight(20);
        theQueue.insertRight(30);
        theQueue.insertRight(40);

        theQueue.removeRight();
        theQueue.removeRight();
        theQueue.removeRight();

        theQueue.insertRight(50);
        theQueue.insertRight(60);
        theQueue.insertRight(70);
        theQueue.insertRight(80);

        theQueue.display();

        //while( !theQueue.isEmpty()){
           // long n = theQueue.remove();
           // System.out.print(n);
           // System.out.print(" ");
        //}
       // System.out.println();

    }
}
