class ransome
{
    public boolean canConstruct(String ransomNote, String magazine)
    {
        int counts[]=new int[26];
        for(char c: magazine.toCharArray())
        {
            counts[c-'a']++;
        }
        for(char c: ransomNote.toCharArray())
        {
            counts[c-'a']--;
            if(counts[c-'a']<0)
            {
                return false;
            }
        }
        return true;
    }
}
public class lc383 {
    public static void main(String args[])
    {
        String s1= "apple";
        String s2="eppla";
        ransome r1= new ransome();
        if(r1.canConstruct(s1, s2))
        {
            System.out.println("we can form a letter");
        }
    }
}
