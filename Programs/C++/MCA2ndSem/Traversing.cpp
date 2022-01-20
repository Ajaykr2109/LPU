#include<iostream>
using namespace std;
int main()
{

    int i,n,e;
    cout<<"Enter the size of Array.";
    cin>>n;
    int arr[n];
    cout<<"Enter the elements of the array :";
    for(i=1;i<=n;i++)
    {
        cin>>arr[i];
    }
    cout<<"Traversing of Array"<<endl;
    for(i=1;i<=n;i++)
    {
        cout<<arr[i];
    }
    return 0;
}
