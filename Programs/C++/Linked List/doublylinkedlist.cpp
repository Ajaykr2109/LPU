#include<iostream>
using namespace std;    

class test 
{
    int data, *ptr;

};
int main()
{
    int size;
    cout<<"Enter the size of array"<<endl;
    cin>>size;

    test t[size];
 int i=15;
    while(i){
        cout<<"enter the value in array"<<endl;
        cin>>t[i];

    }
    
    
    return 0;
}
