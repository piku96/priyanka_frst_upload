package com.packagee;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
public class LengthofString {
	
	/*length of string*/
	
	
/*public static void main(String[] args) 
	{
	Scanner Scn=new Scanner(System.in);
	System.out.print("enter the string");
String str=Scn.nextLine();
int count=0;

for(int i=0;i<=str.length()-1;i++)
{
	if(str.charAt(i)!=' ')
			{
	count++;
	
			}

}
System.out.println(count);
}
	}

//

/*repeated character count*/


/*public static void main(String[] args) 
	{
	Scanner Scn=new Scanner(System.in);
	System.out.print("enter the string");
String str=Scn.nextLine();


for(int i=0;i<=str.length()-1;i++)
{
	int count=0;
	
	for(int j=0;j<str.length();j++) {
		if(str.charAt(i)==str.charAt(j))
		{
			count++;
	}
	}
	
if(str.charAt(i)!=' ') {
	System.out.println(str.charAt(i)+" "+count);
}
}
	}
}*/

	public static void main(String[] args) 
	{
	Scanner Scn=new Scanner(System.in);
	System.out.print("enter the string");
String str=Scn.nextLine();

HashMap
for(int i=0;i<=str.length()-1;i++)
{
	int count=0;
	
	for(int j=0;j<str.length();j++) {
		if(str.charAt(i)==str.charAt(j))
		{
			count++;
	}
	}
	hs.put(str.charAt(i), count);
}
Set s=hs.keySet();
Iterator itr=s.iterator();
while(itr.hasNext()) {
	Object obj=itr.next();
	

	System.out.println(obj+" "hs.get(obj));
}
}





