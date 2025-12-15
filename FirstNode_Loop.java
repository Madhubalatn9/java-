import java.util.Scanner;
class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}

   public class FirstNode_Loop{
    public static Node findFirstNode(Node head){

        if (head == null || head.next == null)
            return null;

        Node slow=head;
        Node fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                slow=head;
                while(slow!=fast){
                    slow=slow.next;
                    fast=fast.next;
                }
                return slow;
            }
             }
             return null;   
            }
        public static void main(String args[]){
                Scanner scan=new Scanner(System.in);
                System.out.println("Enter the Number of Nodes:");
                int n=scan.nextInt();

                if(n==0){
                    System.out.println("Linked List is empty");
                    return;
                }
                System.out.println("Enter the Node Values:");
                Node head=new Node(scan.nextInt());
                Node temp=head;
                Node loopNode=null;

                for(int i = 2; i <= n; i++) {
            Node newNode = new Node(scan.nextInt());
            temp.next = newNode;
            temp = newNode;
        }

        // Input loop position
        System.out.print("Enter position to create loop (0 for no loop): ");
        int pos = scan.nextInt();

        if (pos > 0) {
            temp = head;
            for (int i = 1; i < pos; i++) {
                temp = temp.next;
            }
            // Create loop
            Node last = head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = temp;
        }

        // Find first node of loop
        Node result = findFirstNode(head);

        if (result != null)
            System.out.println("First node of loop is: " + result.data);
        else
            System.out.println("No loop found in the linked list");
    }
}

            
        

    
        
    
