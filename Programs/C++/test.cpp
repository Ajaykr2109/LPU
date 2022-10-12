// // input : ab - efg - t output : tg - feb - a

// #include <iostream>
// #include <string>
// using namespace std;

// int main()
// {
//     string s;
//     cin >> s;
//     int i = 0;
//     while (i < s.length())
//     {
//         int j = i;
//         while (j < s.length() && s[j] != '-')
//         {
//             j++;
//         }
//         int k = j - 1;
//         while (k >= i)
//         {
//             cout << s[k];
//             k--;
//         }
//         if (j < s.length())
//         {
//             cout << s[j];
//         }
//         i = j + 1;
//     }
//     return 0;
// }

// maximum sum of subarray
#include <iostream>
using namespace std;
int main()
{
    int n;
    cin >> n;
    int a[n];
    for (int i = 0; i < n; i++)
    {
        cin >> a[i];
    }
    int maxSum = 0;
    for (int i = 0; i < n; i++)
    {
        for (int j = i; j < n; j++)
        {
            int sum = 0;
            for (int k = i; k <= j; k++)
            {
                sum += a[k];
            }
            maxSum = max(maxSum, sum);
        }
    }
    cout << maxSum << endl;

    return 0;
}