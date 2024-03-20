#include<bits/stdc++.h>
using namespace std;
int main()
{
    int n;
    cin>>n;
    int arr[n];
    for(int i=0;i<n;i++)
    {
        cin>>arr[i];
    }
    map<int,int> mp1;

   mp1.insert(make_pair(0,2));
   mp1.insert(make_pair(1,2));
   mp1.insert(make_pair(2,1));
   mp1.insert(make_pair(3,2));
   mp1.insert(make_pair(4,2));
   mp1.insert(make_pair(5,2));
   mp1.insert(make_pair(6,1));
   mp1.insert(make_pair(7,2));
   mp1.insert(make_pair(8,2));
   mp1.insert(make_pair(9,2));
   
   map<int,string> mp2;
   
   mp2.insert(make_pair(0,"zero"));
    mp2.insert(make_pair(1,"one"));
     mp2.insert(make_pair(2,"two"));
      mp2.insert(make_pair(3,"three"));
       mp2.insert(make_pair(4,"four"));
        mp2.insert(make_pair(5,"five"));
         mp2.insert(make_pair(6,"six"));
          mp2.insert(make_pair(7,"seven"));
           mp2.insert(make_pair(8,"eight"));
            mp2.insert(make_pair(9,"nine"));
            
            
            int sum=0;
            for(int i=0;i<n;i++)
            {
                sum=sum+mp1[arr[i]];
            }
            
        
            int c=0;
            for(int i=0;i<n-1;i++)
            {
                for(int j=i+1;j<n;j++)
                {
                    if(arr[i]+arr[j]==sum)
                    {
                        c++;
                    }
                }
            }
            
            cout<<mp2[c];
            
            
}