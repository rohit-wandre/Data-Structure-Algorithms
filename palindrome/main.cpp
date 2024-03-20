

#include <bits/stdc++.h>

using namespace std;

int main()
{
    string s="abbac";
    int n=s.length();
    int l=0;
    int h=n-1;
    bool flag=false;
    while(l<h)
    {
        if(s[l++]!=s[h--])
        {
         
         flag=true;
         break;
        }
    }
    if(flag)
    {
        cout<<"Not palindrome";
    }
    else
    {
        cout<<"palindrome";
    }
    
    return 0;
}


