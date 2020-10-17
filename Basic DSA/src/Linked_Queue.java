public class Linked_Queue {
    
    private Node front;
    private Node rear;

    Linked_Queue(){
        front = rear = null;
    }

    public void insert(int data){

        if(rear == null){

            rear = new Node();
            rear.setData(data);
            rear.setLink(null);
            front = rear;

        }
        else{

            Node temp = new Node();
            temp.setData(data);
            temp.setLink(null);
            rear.setLink(temp);
            rear = temp;
            temp = null;

        }

    }

    public void delete(){

        if(front == null)
            System.out.println("Queue Underflow!");
        else{

            System.out.println("Value deleted: " + front.getData());

            if(front == rear)
                front = rear = null;
            else
                front = front.getLink();

        }

    }

    public void display(){

        if(front == null)
            System.out.println("Queue Underflow!");
        else{

            Node temp = front;
            while(temp != null){

                System.out.print(temp.getData() + " ");
                temp = temp.getLink();

            }
            System.out.println();

        }

    }

}
