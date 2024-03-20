
#include <bits/stdc++.h>
using namespace std;

int main()
{
    int arr[]={8,7,6,7,6,5,4,3,2,3,4,3};
    int n=sizeof(arr)/sizeof(int);
    int i=0;
    int x=3;
    while(i<n)
    {
        if(arr[i]==x)
        {
            cout<<"Element found at index "<<i;
            break;
        }
       
     i=i+abs(arr[i]-x);
       
    }

    return 0;
}
