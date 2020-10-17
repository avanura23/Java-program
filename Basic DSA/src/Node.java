public class Node {
    
    private int data;
    private Node link;

    // Getters
    public int getData(){ return data; }
    public Node getLink(){ return link; }
    
    // Setters
    public void setData(int data){
       
        this.data = data;
    
    }

    public void setLink(Node link){
    
        this.link = link;
    
    }

}
