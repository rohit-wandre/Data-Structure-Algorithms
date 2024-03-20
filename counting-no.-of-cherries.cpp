#include<bits/stdc++.h>
using namespace std;
int main()
{

		int n=3,c=0;
		char arr[][n]={'#','#','#','#',
		                '.','#','#','.',
		                '.','#','.','.',
		                  '#','.','.','.'
		};
		                
		map<int,int>mp1,mp2;
		bool flag=false;
			for(int i=0;i<n;i++)
		    {
			for(int j=0;j<n;j++)
			{
				if(arr[i][j]=='#')
				{
				    c++;
				}
			}
		    }
		cout<<c<<endl;
		
		int half=c/2;
        for(int i=0;i<n;i++)
		{
			int crow=0;
			for(int j=0;j<n;j++)
			{
				
				if(arr[i][j]=='#')
				{
					crow++;
				}
			}
			mp1.insert(make_pair(i,crow));
			
		}
		for(auto i:mp1)
			{
			    cout<<i.first<<"->"<<i.second<<endl;
		
			}
			cout<<endl;
		for(int j=0;j<n;j++)
		{
			int ccol=0;
			for(int i=0;i<n;i++)
			{
				if(arr[i][j]=='#')
				{
					ccol++;
				}
			}
			mp2.insert(make_pair(j,ccol));
		}
		for(auto i:mp2)
		{
		    cout<<i.first<<"->"<<i.second<<endl;
		}
		for(auto i:mp1)
 		{
 			if(i.second==half)
 			{
 				flag=true;
 				break;
 			}
 		}
 if(mp1.count(half))
 {
     flag=true;
     
 }
 		for(auto i:mp2)
 		{
 			if(i.second==half)
 			{
 				flag=true;
 				break;
 			}
 		}
 if(mp2.count(half))
 {
     flag=true;
     
 }
 		if(flag)
 		{
 			cout<<"YES"<<endl;
 		}
 		else
 		{
 			cout<<"NO"<<endl;
 		}
 return 0;
}
