import java.util.*;

public class QueueMain{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        QueueLinked qn = new QueueLinked();
        int choice,c;
        
        do{
            System.out.print("1. Insert data in queue\n2. Delete data in queue\n3. Display queue\n4. Exit\nEnter your choice : ");
            choice = in.nextInt();
            switch(choice){
                case 1:
                    System.out.print("Enter the integer data to be inserted : ");
                    int q1 = in.nextInt();
                    qn.QEnqueue(q1);
                    break;
                case 2:
                    qn.QDequeue();
                    break;
                case 3:
                    System.out.print("Data in queue : ");
                    qn.Qshow();
                    break;
                case 4:
                    System.out.println("GoodBye!!!");
                    System.exit(0);
                default:
                    System.out.println("Invalid Choice");
            }
            System.out.print("Enter integer 1(one) to continue : ");
            c = in.nextInt();
        }while(c==1);
    }
}