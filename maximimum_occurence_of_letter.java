import java.lang.*;
import java.io.*;
import java.util.*;
class GFG
{
	public static void main (String[] args) throws IOException
	{
	 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	 int tc=Integer.parseInt(br.readLine().trim());
	 
	 while(tc-- >0)
	 {
	     String line=br.readLine().trim();
	     
	     Solution obj = new Solution();
	     
	     System.out.println(obj.getMaxOccuringChar(line));
	     
	 }
	 }
} } 




class Solution
{
    //Function to find the maximum occurring character in a string.
    public static char getMaxOccuringChar(String line)
    {
        // Your code here
         int max=0;
       Character ch=line.charAt(0);
       Map<Character,Integer> hs=new HashMap<Character,Integer>();
       for(int i=0;i<line.length();i++)
           hs.put(line.charAt(i),hs.getOrDefault(line.charAt(i),0)+1);
       for(int i=0;i<line.length();i++)
       {
           if(max<hs.get(line.charAt(i)))
           {
               max=hs.get(line.charAt(i));
               ch=line.charAt(i);
           }
           if(hs.get(line.charAt(i))==max)
           {
               if(ch.compareTo(line.charAt(i))>0)
                   ch=line.charAt(i);
           }
           
       }
       return ch;
    
    }
    
}
