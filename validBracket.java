import java.util.Scanner;
import java.util.Stack;
class validBracket{
    public boolean isValid(String s){
       Stack<Character> st=new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch=='('|| ch=='{'|| ch=='['){
                st.push(ch);
            }else{
                if(st.isEmpty()){
                    return false;
                }

            char top=st.pop();
           if((ch==')' && top!='(')|| 
              (ch=='}' && top!='{')||
              (ch==']' && top!='[')){
                return false;
        }
    }

        }
        return st.isEmpty();
}
  public static void main(String args[]){
    Scanner scan=new Scanner(System.in);
        System.out.println("Enter the Brackets:");
        String s1=scan.nextLine();

        validBracket v1=new validBracket();
        boolean res=v1.isValid(s1);

        System.out.println(res);
    
  }
}