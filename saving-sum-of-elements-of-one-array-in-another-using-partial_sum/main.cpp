#include<bits/stdc++.h>
using namespace std;

// int myfunc(int a,int b)
// {
//     return a+2*b;
// }

int main()
{
    int a[]={1,2,3,4,5};
    int n=sizeof(a)/sizeof(int);
    int b[n];
    partial_sum(a,a+n,b);
    
    for(auto i:b)
    {
        cout<<i<<" ";
    }
}
