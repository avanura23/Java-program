public class Linked_Stack {
    
    private Node sp;

    Linked_Stack(){
        sp = null;
    }

    public void push(int data){

        if(sp == null){

            sp = new Node();
            sp.setData(data);
            sp.setLink(null);

        }
        else{

            Node temp = new Node();
            temp.setData(data);
            temp.setLink(sp);
            sp = temp;
            temp = null;

        }

    }

    public void pop(){

        if(sp == null)
            System.out.println("Stack Underflow!");
        else{

            System.out.println("Value popped out: " + sp.getData());
            sp = sp.getLink();

        }

    }

    public void display(){

        if(sp == null)
            System.out.println("Stack Underflow!");
        else{

            Node temp = sp;

            while(temp != null){

                System.out.println("  " + temp.getData());
                System.out.println("-----");
                temp = temp.getLink();

            }

        }

    }

}
