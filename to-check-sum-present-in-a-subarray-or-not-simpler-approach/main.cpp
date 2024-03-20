

#include <bits/stdc++.h>

using namespace std;

int main()
{
    int arr[]={1,2,3,4,5};
    int n=sizeof(arr)/sizeof(int);
    int val=3;
    for(int i=0;i<n;i++)
    {
        int sum=arr[i];
        
        for(int j=i+1;j<=n;j++)
        {
            if(sum==val)
            {
                cout<<"sum found between indexes "<<i<<" and"<<j-1;
                return 0;
            }
            if(sum>val||j==n)
            {
                break;
            }
            sum=sum+arr[j];
        }
        
    }
    cout<<"sum not found";

    return 0;
}

