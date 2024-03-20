#include<bits/stdc++.h>
using namespace std;
int main()
{
    map<int,int> m1,m2;
    int arr[]={11,4,11,7,13,4,12,11,10,14};
    int n1=sizeof(arr)/sizeof(int);
    int brr[]={11,4,11,7,3,7,10,13,4,8,12,11,10,14,12};
    int n2=sizeof(brr)/sizeof(int);
    for(int i=0;i<n1-1;i++)
    {
        int c=1;
        for(int j=i+1;j<n1;j++)
        {
            if(arr[i]==arr[j])
            {
                c++;
            }
        }
        m1.insert(make_pair(arr[i],c));
    }
    
    for(auto i:m1)
    {
        cout<<i.first<<"->"<<i.second<<endl;
    }
    cout<<endl;
    
    for(int i=0;i<n2-1;i++)
    {
        int c=1;
        for(int j=i+1;j<n2;j++)
        {
            if(brr[i]==brr[j])
            {
                c++;
            }
        }
        m2.insert(make_pair(brr[i],c));
    }
    
    for(auto i:m2)
    {
        cout<<i.first<<"->"<<i.second<<endl;
    }
    
    
    cout<<endl;
    
   auto it1=m1.begin();
   auto it2=m2.begin();
   
   while(it1!=m1.end()&&it2!=m2.end())
   {
       if(it1->second!=it2->second)
       {
           cout<<it1->first<<" ";
       }
       it1++;
       it2++;
   }
}