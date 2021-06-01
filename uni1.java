 import java.util.*;
class uni1
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str1[]=new String[50];
        String str2[]=new String[50];
        int i,j;
        String s1,s2;
        s1="(";
        s2=")";
        int c1=0,c2=0,p1=0,p2=0;
        System.out.println("Enter the first string");
        for(i=0;i<50;i++)
        {
            str1[i]=sc.nextLine();
            if(str1[i].equals(s1)==true)
                c1=i;
            if(str1[i].equals(s2)==true)
            {
                c2=i;
                break;
            }
        }
        System.out.println("Enter the second string");
        for(i=0;i<50;i++)
        {
            str2[i]=sc.nextLine();
            if(str2[i].equals(s1)==true)
                p1=i;
            if(str2[i].equals(s2)==true)
            {
                p2=i;
                break;
            }
        }
        
        if((str1[0].equals(str2[0]))==false)
            System.out.println("No Match");
        else if((str1[0].equals(str2[0]))==true)
        {   
           
            if(c2!=p2)
                System.out.println("Cant be unified, different number of elements");
            else if(c2==p2)
            {
                if(str1[c1+1].equals(str2[c1+1])==false)
                        {System.out.println("Can't be unified"); }
                else{
                    for(i=c1+2;i<c2;i++)
                {
                                    
                    if(str1[i].length()<str2[i].length())
                        System.out.println(str1[i]+"="+str2[i]);
                    else if(str1[i].length()>str2[i].length())
                        System.out.println(str2[i]+"="+str1[i]);
                    
                }
            }}
        }
    }
    }
 