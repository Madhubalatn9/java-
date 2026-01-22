import java.util.Scanner;
class Anagram{
    public static void main(String args[]){
        
       Scanner scan=new Scanner(System.in);
       System.out.println("Enter the Word 1:");
       String s1=scan.nextLine();
       System.out.println("Enter the word 2:");
       String s2=scan.nextLine();

       if(s1.length()!=s2.length()){
        System.out.println("Its not Anagram");
        return;
       }
       int[] count=new int[26];
       
       for(int i=0;i<s1.length();i++){
            count[s1.charAt(i)-'a']++;
            count[s2.charAt(i)-'a']--;
       }
       for(int i=0;i<26;i++){
       if(count[i]!=0){
        System.out.println("Its not Anagram");
        return;
       }
       }
       System.out.println("Its Anagram");
    }
}