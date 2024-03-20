#include<bits/stdc++.h>
using namespace std;
int main()
{
	int n,m;
	cin>>n>>m;
	int arr[n][m];
	int res[n];
	vector<int> v;
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<m;j++)
		{
			cin>>arr[i][j];
		}
	}
	for(int i=0;i<n;i++)
	{
	    int max=arr[i][0];
		for(int j=0;j<m;j++)
		{
			if(arr[i][j]>=max)
			{
				max=arr[i][j];
				
				res[i]=max;
			}
		}
	}
	cout<<endl;
	
	
	for(int i=0;i<n;i++)
	{
	    cout<<res[i]<<" ";
	}
	cout<<endl;
 	for(int i=1;i<n;i++)
 	{
           v.push_back(abs(res[i]-res[i-1]));  
 	}
 	cout<<*min_element(v.begin(),v.end());
	
}