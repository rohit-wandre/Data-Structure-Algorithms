#include<bits/stdc++.h>
using namespace std;
bool isPrime(int n)
{
    if(n<=1)
    {
        return false;
    }
    for(int i=2;i<n;i++)
    {
        if(n%i==0)
        {
            return false;
        }
    }
    return true;
}
int main()
{
    bool flag=false;
    int c=0;
    int n=24;
    vector<int> v;
    for(int i=1;i<=n;i++)
    {
        if(isPrime(i))
        {
            v.push_back(i);
        }
    }
    
    for(int i=0;i<v.size();i++)
    {
        if(v[i]%10==v[i])
        {
            c++;
        }
        
        else
        {
            int t=v[i];
            while(t>0)
            {
                int r;
                r=t%10;
                if(isPrime(r))
                {
                    flag=true;
                }
                else
                {
                    flag=false;
                    break;
                }
                t=t/10;
            }
            if(flag)
            {
                c++;
            }
        }
       
    }
    cout<<c;
    return 0;
}