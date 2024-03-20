#include<bits/stdc++.h>
using namespace std;
int main()
{
	
	vector<int> v;
	
		int k=2;
		int arr[]={1,1,1,2,2,3,3,3};
		int n=sizeof(arr)/sizeof(int);
		
		sort(arr,arr+n);
	 int i=0;
	 while(i<n)
	 {
	    int k=i+1;
	    int c=1;
	    if(arr[i]<=k)
	    {
	        int t=arr[i];
	        while(k<n)
	        {
	            if(arr[k]==t)
	            {
	            c++;
	            k++;
	            }
	            else
	            {
	                i=k;
	                break;
	            }
	        }
	        v.push_back(c*t);
	    }
	    else
	    {
	        break;
	    }
	   
	}
		cout<<*max_element(v.begin(),v.end())<<endl;
	
	
}