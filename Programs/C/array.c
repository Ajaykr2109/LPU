#include<stdio.h>
int main()
{
    int a[5]={1,5,7,-1,5};
     int i=0,count=0;;
    while(i<5)
    {
        for(int j=0,j<5;j++)
        {
            if(a[i]+a[j]==6 || a[i]-a[j]==6)
            {
                count ++;
                printf("%d,%d", a[i],a[j]);
                printf("\n");
            }
            else{
                continue;
            }
        }
        i++;
    }
}