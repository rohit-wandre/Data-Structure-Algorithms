#include<bits/stdc++.h>
using namespace std;
int main()
{
    int arr[][3]={1,2,3,
                  4,5,6,
                  7,8,9};
    
    int max=0,ind=0;
    for(int i=0;i<3;i++)
    {
        int sum=0;
        for(int j=0;j<3;j++)
        {
            sum+=arr[i][j];
        }
        if(sum>max)
        {
            ind=i;
            max=sum;
        }
        cout<<"Row "<<i+1<<":"<<sum<<endl;
    }
    cout<<"Row "<<ind+1<<" is having max sum: "<<max;
    
}
