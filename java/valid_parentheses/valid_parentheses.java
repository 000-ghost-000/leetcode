import java.util.*;
class Solution {
    public boolean isValid(String s) {
        HashMap <Character , Character> para=new HashMap<>();
        para.put(')','(');
        para.put(']','[');
        para.put('}','{');
        char stack[]=new char[s.length()/2];
        int x=-1;
        for (int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='('||s.charAt(i)=='['||s.charAt(i)=='{')
            {
                x++;
                stack[x]=s.charAt(i);
            }
            else if (stack[x]==para.get(s.charAt(i)))
            {
                stack[x]='\0';
                x--;
            }
        }
       return (x==-1);
    }
}
