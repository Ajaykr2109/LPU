#include <iostream>
using namespace std;
int main()
 {
    int n,j,num;
    cout<<"Enter the size of Array."<<endl;
    cin>>n;
    int arr[n];
    cout<<"Enter the elements of the array :"<<endl;
    for(int i=0;i<n;i++)
    {
        cin>>arr[i];
    }
    cout<<"Enter the index to delete from array :"<<endl;
    cin>>num;
    j=num;
    while(j<n)
    {
      arr[j-1] = arr[j];
      j = j + 1;
    }
    n = n -1;

   cout<<"After Deletion :"<<endl;
   for(int i = 0; i<n; i++)
   {
      cout<<(" ", arr[i]);
   }
}
