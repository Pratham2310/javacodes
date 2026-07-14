class Solution {
    public int lengthOfLastWord(String s) {
        int count=0;
        int i=s.length()-1;
        while(i>=0 && s.charAt(i)==' ')
        {
            i--;
        }
        while(i>=0 && s.charAt(i)!=' ')
        {
            i--;
            count++;
        }
        return count;
    }
}
public class lc58
{
    public static void main(String args[])
    {
        Solution s1= new Solution();
        String s="this is a test line";
        System.out.println(s1.lengthOfLastWord(s));
    }
}

