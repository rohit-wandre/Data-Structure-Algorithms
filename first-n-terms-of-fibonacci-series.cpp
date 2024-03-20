#include<iostream>
using namespace std;
int main()
{
    
    int f=0,s=1,nxt;
    int n;
    cin>>n;
    /*while(n>0)
    {
        cout<<f<<" ";
        nxt=f+s;
        f=s;
        s=nxt;
        n--;
    }
	*/
	
	cout<<f<<" "<<s;
	n=n-2;
	while(n>0)
	{
	    nxt=f+s;
	    cout<<" "<<nxt;
	    f=s;
	    s=nxt;
	    n--;
	}
		
}
