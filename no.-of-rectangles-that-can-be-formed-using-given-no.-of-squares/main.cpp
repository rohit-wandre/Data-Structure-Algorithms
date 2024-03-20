#include <bits/stdc++.h>
using namespace std;
int main()
{
    int n;
    cin>>n;
    int c=0;
    for(int l=1;l<=sqrt(n);l++)
    {
        for(int h=l;h*l<=n;h++)
        {
            c++;
        }
    }

      cout<<c;
    return 0;
}
