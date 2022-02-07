package Java;
public class elements{
    public static void main(String[] args)
    {
        int[] a = new int[]{1,5,7,-1,5}; 
     int i=0,count=0;
     System.out.println("Elements are ");
    while(i<5)
    {
        for(int j=0;j<5;j++)
        {
            if(a[i]+a[j]==6)
            {
                count ++;
                System.out.print(" "+a[i]+" "+a[j]+",");
            }
            else{
                continue;
            }
        }
        i++;

     if(i==3)
     break;
    }
        System.out.println("\nCount is"+" "+count);
    } 
}