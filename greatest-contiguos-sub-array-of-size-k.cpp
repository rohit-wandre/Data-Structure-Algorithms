#include<bits/stdc++.h>
using namespace std;
vector<int> findSubArr(int arr[],int k,int n)
{
    vector<vector<int>> vec;
    for(int i=0;i<n-k+1;i++)
    {
        vector<int> temp;
        
        for(int j=i;j<i+k;j++)
        {
           temp.push_back(arr[j]);    
        }
        vec.push_back(temp);
    }
sort(vec.begin(),vec.end());

return vec[vec.size()-1];
}

int main()
{
    int arr[]={1,4,3,2,5};
    int n=sizeof(arr)/sizeof(int);
    int k=4;
    vector<int> ans=findSubArr(arr,k,n);
    for(auto i:ans)
    {
        cout<<i<<" ";
    }
}

