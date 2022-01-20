#include<iostream>
using namespace std;
int main()
{
    int i,n,pos,val,temp;
    cout<<"Enter the size of Array."<<endl;
    cin>>n;
    int arr[n];
    cout<<"Enter the elements of the array :"<<endl;
    for(i=1;i<=n;i++)
    {
        cin>>arr[i];
    }
    cout<<"Enter the position"<<endl;
    cin>>pos;
    cout<<"Enter the Value"<<endl;
    cin>>val;
    temp=n;
    for(i=temp;i<=pos;i--)
    {
        arr[n+1]=arr[n];
        n=n-1;
    }
    arr[pos]=val;
      for(i=1;i<=n;i++)
    {
        cout<<arr[i];
    }
    return 0;
}

