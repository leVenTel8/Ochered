
public class Deque {
    private int maxSize;
    private long[] queArray;
    private int front;
    private int rear;
    private int nItems;
    private int lefttop;
    private int rightbotom;

    public Deque(int s) {
        maxSize = s;
        queArray = new long[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;

        lefttop = 1;
        rightbotom = 0;

    }

    public void insertLeft(long j){

        if(!isFull()){
            lefttop--;
            if(lefttop<0)
                lefttop = maxSize-1;
            queArray[lefttop] = j;
            nItems++;
        }
        else System.out.println("Нету места");
    }

    public void insertRight(long j){

        if(!isFull()){
            rightbotom++;
            if(rightbotom >= maxSize)
                rightbotom = 0;
            queArray[rightbotom] = j;
            nItems++;
        }
        else System.out.println("Нету места");

    }

    public long removeLeft(){

        if(!isEmpty()){
            long temp = queArray[lefttop];
            lefttop++;
            if(lefttop >= maxSize)
                lefttop = 0;
            nItems--;
            return temp;

        }
        else{
            System.out.println("Пусто");
            return -1;
        }

    }

    public long removeRight(){

        if(!isEmpty()){
            long temp = queArray[rightbotom];
            rightbotom--;
            if(rightbotom < 0)
                rightbotom = maxSize-1;
            nItems--;
            return temp;

        }
        else{
            System.out.println("Пусто");
            return -1;
        }

    }


    public Boolean isEmpty()
    {
        if(nItems == 0) return true;
        else return false;
    }

    public Boolean isFull()
    {
        if(nItems == maxSize) return true;
        else return false;
    }
    public void display()
    {
        System.out.println("Left: " + lefttop + ", Right: " + rightbotom);
        int index = lefttop;
        for(int i = 0; i < nItems; i++)
        {
            if(index >= maxSize) index = 0;
            System.out.print(queArray[index] + " ");
            index++;
        }
        System.out.println("");
    }

    public long peekLeft()
    {
        return queArray[lefttop];
    }

    public long peekRight()
    {
        return queArray[rightbotom];
    }




}
