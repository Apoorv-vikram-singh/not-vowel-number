//except vowel print modified same String..
import java.util.*;
public class notvowel
{
	public static void main(String args[])
	{
	   Scanner sc=new Scanner(System.in);
	   String name=sc.next();
	   String name2="";
	   String vowels="aeiouAIEOU";
	   for(int i=0;i<name.length();i++)
	   {
	       int count=0;
	       char ch=name.charAt(i);
	       for(int j=0;j<vowels.length();j++)
	       {
	           if(ch==vowels.charAt(j))
	           {
	               count++;
	           }
	       }
	       if(count==0)
	       {
	           name2=name2+ch;
	       }
	       
	   }
	   System.out.println(name2);
	    
	}
}