#include<bits/stdc++.h>
using namespace std;
stack<int> stk;
 int evaluator(string s)
 {
     for(int i=0;i<s.length();i++)
     {
         if(s[i]>='0'&& s[i]<='9')
         {
             stk.push(s[i]-'0');
         }
         
         else
         {
             int x=stk.top();
             stk.pop();
             int y=stk.top();
             stk.pop();
             
             if(s[i]=='+')
             {
                 stk.push(x+y);
             }
             
             else if(s[i]=='-')
             {
                 stk.push(y-x);
             }
             
             else if(s[i]=='*')
             {
                 stk.push(x*y);
             }
             else
             {
                 stk.push(y/x);
             }
         }
         
     }
     
     return stk.top();
 }




int main()
{
    string s="231*+9-";
    cout<<evaluator(s);
    return 0;
}
