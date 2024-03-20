#include<iostream>
using namespace std;
int main()
{
	int f=0,s=1,nxt;
	int n;
	cin>>n;
	cout<<f<<" "<<s<<" ";
 
    nxt=f+s;
    
    while(nxt<=n)
    {
        cout<<nxt<<" ";
        f=s;
        s=nxt;
        nxt=f+s;
        
    }

	
		
	
}