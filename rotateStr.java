public class rotateStr{
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()) return false;
        for(int i=0;i<s.length();i++){
            String left=s.substring(i)+s.substring(0,i);
            if(left.equals(goal)){
                return true;
            }
        }
        return false;
}
    public static void main(String[] args){
        rotateStr rs= new rotateStr();
        String s="abcde";
        String goal="cdeab";
        System.out.println(rs.rotateString(s, goal));

}
}