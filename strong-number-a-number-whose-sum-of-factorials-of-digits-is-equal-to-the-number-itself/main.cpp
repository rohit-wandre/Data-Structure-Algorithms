#include<bits/stdc++.h>
using namespace std;

int fact(int n)
{
    int f=1;
    for(int i=1;i<=n;i++)
    {
        f=f*i;
    }
    return f;
}

int main()
{
   int n=145,s=0;
   int temp=n;
   while(temp>0)
   {
       int r=temp%10;
       s=s+fact(r);
       temp=temp/10;
       
   }
   if(s==n)
   {
       cout<<"Strong number";
   }
   else
   {
       cout<<"Not strong";
   }
	return 0;
}
	
	