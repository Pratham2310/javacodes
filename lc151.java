class Solution {
    public String reverseWords(String s) {
        StringBuilder s1=new StringBuilder();
        int i=s.length()-1;
        while(i>=0)
        {
            while(i>=0 && s.charAt(i)==' ')
            {
                i--;
            }
            if(i<0) break;
            int j=i;
            while(i>=0 && s.charAt(i)!=' ')
            {
                i--;
            }
            s1.append(s.substring(i + 1, j + 1)).append(" ");
        }
        return s1.toString().trim();
    }
}
public class lc151 {
    public static void main(String args[])
    {
        Solution s1=new Solution();
        String s="the sky is blue";
        System.out.println(s1.reverseWords(s));
    }
}
