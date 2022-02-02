#include <iostream>
using namespace std;

struct node
{
    int roll;
    node *link;
};
int main()
{
    int item, n, i;
    node *ptr, *START;

    cout <<"Enter total number of nodes "<<endl;
    cin>>n;
    ptr = new node;
    START = ptr;
    for (i = 1; i <= n; i++)
    {
        cout << ("Enter node number of list ")<<endl;
        cin>>(" ", item);
        ptr->roll = item;
        if (i == n)
            ptr->link = NULL;
        else
            ptr->link = new node;
        ptr = ptr->link;
    }
    ptr = START;
    while (ptr != NULL)
    {
        cout << ("\t ", ptr->roll);
        ptr = ptr->link;
    }
    return 0;
}
