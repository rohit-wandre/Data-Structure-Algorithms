#include<bits/stdc++.h>
using namespace std;

int comp(int a,int b)
{
    return a*b;
}


int main()
{
   int arr[]={2,-3,4,5};
 
 int n=sizeof(arr)/sizeof(arr[0]);
  sort(arr,arr+n);  
   
  int res[n];
  // this method stores the difference of adjacent elements of an array into another array . 
  // **** 1st element will always be the first element of given array
  // *** make sure to traverse from 1st index to get the correct result
  
  
  // It can also be used to store product of adjacent elements of an array. 
  
  adjacent_difference(arr,arr+n,res,comp);
  
  for(int i=1;i<n;i++)
  {
      cout<<res[i]<<" ";
  }
  
  
}