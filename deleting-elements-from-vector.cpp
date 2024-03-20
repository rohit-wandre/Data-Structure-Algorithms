#include<bits/stdc++.h>
using namespace std;
int main()
{
    vector<int> v={1,2,3,4,5,6,7,8,9,10};
  
  // make a vector empty---> v.clear()
  
  // to remove selected elements from a vector--->
       
       
       // v.erase(it)
       
       //* To remove first element->
       
         // v.erase(v.begin())
         
        // * to remove elements from a given range->
        
        // suppose remove elements-1,2,3 
        
        v.erase(v.begin(),v.begin()+2+1); //one has to be added extra because upper limit in not inclusive
  
  
      //To remove odd/even elements from vector---->
  
  //Algorithm-
  
  //1. Iterate from starting to the end of vector 
  //2. Check at each position if the element is divisible by 2. If yes, remove the element.
  //3. Decrement the vector as elements will get shifted one position backward.
  
  
   for(auto it=v.begin();it!=v.end();it++)
   {
       if(*it%2==0)
       {
           v.erase(it);
           --it; 
       }
   }
   for(auto i:v)
   {
       cout<<i<<" ";
   }
}
