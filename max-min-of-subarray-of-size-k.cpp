#include<bits/stdc++.h>
using namespace std;
int main()
{
    int arr[]={2,4,5,9,10};
    int n=sizeof(arr)/sizeof(int);
    int k=3,s1=0,s2=0;
    for(int  i=0;i<k;i++)
    {
        s1+=arr[i];
    }
    
    for(int j=k;j<n;j++)
    {
        s2+=arr[j]-arr[j-k];
    }
    
    cout<<max(s1,s2);
}

