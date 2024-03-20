#include<bits/stdc++.h>
using namespace std;
int main()
{
   int arr[]={1,4,2,10,2,3,1,0,20};
   int n=sizeof(arr)/sizeof(int);
   bool flag=true;
   int k=4;
   int curr_sum=0,sum=18;
   for(int i=0;i<n-k+1;i++)
   {
       for(int j=0;j<k;j++)
       {
           curr_sum+=arr[i+j];
       }
       if(curr_sum==sum)
       {
           flag=true;
           break;
       }
   }
   if(flag)
   {
       cout<<"YES";
   }
   else
   {
       cout<<"NO";
   }
}