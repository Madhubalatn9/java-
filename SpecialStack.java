import java.util.Stack;
import java.util.Scanner;
class SpecialStack {
    
    Stack<Integer> mainSt;
    Stack<Integer> minSt;
    
    public SpecialStack() {
        mainSt=new Stack<>();
        minSt=new Stack<>();
    }

    public void push(int x) {
        mainSt.push(x);
        if(minSt.isEmpty()){
            minSt.push(x);
        }else{
            minSt.push(Math.min(x,minSt.peek()));
        }
    }

    public void pop() {
        if(!mainSt.isEmpty()){
          mainSt.pop();
          minSt.pop();
        }
    }

    public int peek() {
        if(mainSt.isEmpty()) return -1;
        else return mainSt.peek();
    }

    boolean isEmpty() {
        if(mainSt.isEmpty()) return true; 
        else return false;
    }

    public int getMin() {
        if(minSt.isEmpty()){
            return -1;
        }else return minSt.peek();
    }
    public static void main(String args[]){
        SpecialStack st=new SpecialStack();
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number Queries:");
        int q=scan.nextInt();
        
        while(q-->0){
            int type=scan.nextInt();
            
            switch(type){
                case 1:
                int x=scan.nextInt();
                st.push(x);
                break;
            
                case 2:
                    st.pop();
                    break;
                
                case 3:
                    System.out.println("Peek : "+st.peek());
                    break;
                    
                case 4:
                    System.out.println("Min : "+st.getMin());
                    break;
                    
                case 5:
                    System.out.println("Empty : "+st.isEmpty());
            }      
        }
        
    }
}
