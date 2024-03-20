#include <bits/stdc++.h>
using namespace std;
int main()
{
    int n=49;
    bool flag=false;
    for(int i=2;i<=sqrt(n);i++)
    {
        if(n%i==0)
        {
            flag=true;
            break;
        }
    }
    if(flag)
    {
        cout<<"Not prime";
    }
    else
    {
        cout<<"prime";
    }

    return 0;
}
