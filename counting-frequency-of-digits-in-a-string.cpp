#include <bits/stdc++.h>
using namespace std;
int main()
{
    string s="1214545";
    int n=s.length();
    map<int,int> mp;
    for(int i=0;i<10;i++)
    {
        mp.insert(make_pair(i,0));
    }
    
    for(int i=0;i<n-1;i++)
    {
        int c=0;
        int t=s[i]-'0';
        for(int j=0;j<n;j++)
        {
            if(s[j]-'0'==t)
            {
                c++;
            }
        }
        mp[t]=c;
    }
    for(auto m:mp)
    {
        cout<<m.first<<"->"<<m.second<<endl;
    }
    
    return 0;
}
