/******************************************************************************

                              Online C++ Compiler.
               Code, Compile, Run and Debug C++ program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/

#include <bits/stdc++.h>

using namespace std;

int main()
{
    int arr1[]={2,3,5,1};
    int arr2[]={3,1,2,5};
    int n=sizeof(arr1)/sizeof(int);
    int i=0,j=0,c=0;
    while(i<n&&j<n)
    {
        if(arr1[i]!=arr2[j])
        {
            int k=arr1[i];
            for(int r=i;r<n-1;r++)
            {
                arr1[r]=arr1[r+1];
            }
            arr1[n-1]=k;
            c++;
        }
        else
        {
            i++;
            j++;
            c++;
        }
    }
   cout<<c;
    return 0;
}
