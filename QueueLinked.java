public class QueueLinked{
    
    Node front;
    Node rear;
    public void QEnqueue(int data){
        
        Node node = new Node();
        node.data = data;
        node.next = null;
        if(front == null){
            front = node;
            rear = node;
        }
        else{            
            rear.next = node;
            rear = node;
        }
        System.out.println("Inserted data : " + node.data);
    }    
    public void QDequeue(){
        
        if(front == null){            
            System.out.println("Queue Underflow");
        }
        else{
            
            Node temp = front;
            front = front.next;
            System.out.println("Deleted data : " + temp.data);
        }
    }
    public void Qshow(){
        
        if(front == null){
            System.out.println("Queue is empty");
        }
        else{
            
            Node node = front;
            while(node.next != null){                
                System.out.print(node.data + " --> ");
                node = node.next;
            }
            System.out.print(node.data + "\n");
        }
    }
}