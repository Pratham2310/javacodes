import java.util.HashSet;
import java.util.Arrays;
import java.util.Set;

class valpara
{
    public boolean validPara(String s)
    {

        Set<Character> openBrackets = new HashSet<>(Arrays.asList('(', '[', '{'));
        StringBuilder Stack = new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            char ch= s.charAt(i);
            if(openBrackets.contains(ch))
            {
                Stack.append(ch);
            }
            else
            {
                if(Stack.length()==0) return false;
                char last =Stack.charAt(Stack.length()-1);
                if((ch==')' && last =='(') ||
                    (ch==']' && last=='[') ||
                    (ch=='}' && last=='{'))
                {
                    Stack.deleteCharAt(Stack.length()-1);
                }
                else
                {
                    return false;
                }
            }
        }
        return Stack.length()==0;
    }
}
public class lc20 {
    public static void main(String args[])
    {
        valpara v1= new valpara();
        String s="(){}[]";
        v1.validPara(s);
    }
}
