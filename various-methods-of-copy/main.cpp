#include<bits/stdc++.h>
using namespace std;
int main()
{
    vector<int> v1={1,2,3,4,5};
    vector<int> v2(3);
    vector<int> v3(5);
    
    // copies entire vector
    
    copy(v1.begin(),v1.end(),v3.begin());
    
    // copies first 3 elements 
     
    copy(v1.begin(),v1.begin()+3,v2.begin());
   
   // copies n elements
   
    copy_n(v1.begin(),3,v2.begin());
   
   // copy if elements are odd
   
   copy_if(v1.begin(),v1.end(),v3.begin(),[] (int i){return i%2!=0;});
    
    for(auto i:v3)
    {
        cout<<i<<" ";
    }
}