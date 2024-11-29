class Solution {
    public boolean isPalindrome(int x) {
        String s="";
        String y=x+"";
        for (int i=0;i<y.length();i++)
        {
            s=y.charAt(i)+s;
        }
        if(y.equalsIgnoreCase(s))
        {
            return true;
        }
        return false;
    }
}
