#include <bits/stdc++.h>
using namespace std;

int binarySearch(int arr[], int l, int r, int x)
{
    if (r >= l) {
        int mid = l + (r - l) / 2;
        if (arr[mid] == x)
            return mid;

        if (arr[mid] > x)
            return binarySearch(arr, l, mid - 1, x);

        return binarySearch(arr, mid + 1, r, x);
    }

    return -1;
}

int main(void)
{

    int x,num,val;
    cout<<"Enter the Size of array"<<endl;
    cin>>num;
    int arr[num];
     cout<<"Enter the Elements!"<<endl;
    for(int i=1;i<=num;i++)
    {
        cin>>val;
        arr[i]=val;
    }
    cout<<"Enter the Element to search"<<endl;
    cin>>x;
    int n = sizeof(arr) / sizeof(arr[0]);
    int result = binarySearch(arr, 0, n , x);
    if(result == -1)
         cout << "Element is not present in array";

        else
         cout << "Element is present at index " << result;
    return 0;
}
