#include<bits/stdc++.h>
using namespace std;
int main()
{
    int arr[]={10,20,30};
    int n=sizeof(arr)/sizeof(int);
    
    cout<<accumulate(arr,arr+n,0); //to get sum of all elements of an array. 3rd arg is to initialize s=0
    
    // to find sum of 10,20
    
    cout<<accumulate(arr,arr+2,0); // +1 has to be add as last is not inclusive accumulate[first,last);
}