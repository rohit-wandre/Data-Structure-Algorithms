#include<bits/stdc++.h>
using namespace std;
int main()
{
    int arr[]={1,4,7,2};
    int n=sizeof(arr)/sizeof(int);
    int k=2;
    int c=0;
    sort(arr,arr+n);
    
    int i=0;
    int j=1;
    
    while(i<n)
    {
        int diff=arr[j]-arr[i];
        if(diff>k)
        {
            i++;
        }
        else if(diff==k)
        {
            c++;
            j++;
        }
        else
        {
            j++;
        }
    }
    cout<<c;
}