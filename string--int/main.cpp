

#include <bits/stdc++.h>

using namespace std;

int main()
{
   string s="1221";
   int n=s.length();
   int ans=0;
   for(int i=n-1;i>=0;i--)
   {
       int t=s[i]-'0';
       ans=ans+t*pow(10,n-i-1);
   }
cout<<ans;
    return 0;
}
