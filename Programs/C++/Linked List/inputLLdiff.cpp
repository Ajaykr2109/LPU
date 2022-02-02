#include <iostream>
using namespace std;

struct node
{
    int roll;
    node *link;
};
int main()
{
    char ch;
    int x,item,aitem;
    do
    {
        cout<<" 1. for Insertion at beginning. \n 2. for Insertion at End. \n 3. for Searching. \n 4. for Insertion at specific location. \n 5. for Traverse. \n 6. for Deletion at Beginning. \n 7. for Deletion at End. \n 8. for Deletion after a specific Location."<<endl;
        cin>>x;

        switch(x)
        {
        case 1:
            cout<<"Enter the Element to be inserted."<<endl;
            cin>>item;
            insert_beg(item);
            break;
        case 2:
            cout<<"Enter the Element to be inserted."<<endl;
            cin>>item;
            insert_end(item);
            break;
        case 3:
            cout<<"Enter an Element which is to be searched."<<endl;
            cin>>item;
            temp=searchh(item);
            if(temp==NULL)
            {
                cout<<"Element is not found."<<endl;
            }
            else
            {
                cout<<"Element is at "<<temp<<" location."<<endl;
            }
            break;
        case 4:
            cout<<"Enter that element after Insertion is to be done."<<endl;
            cin>>aitem;
            cout<<"Enter Element is to be Insert."<<endl;
            cin>>item;
            insafter(item,aitem);
            break;
        case 5:
            traverse();
            break;
        case 6:
            del_beg();
            break;
        case 7:
            del_endd();
            break;
        case 8:
            cout<<"Enter element after that deletion is to done. "<<endl;
            cin>>aitem;
            del_aftergiven(aitem);
            break;
        default:
            cout<<"Wrong choice."<<endl;
            break;
        }
        cout<<"press 'y' If want to enter again."<<endl;
        cin>>ch;
    }
    while(ch=='y');
    return 0;
}
