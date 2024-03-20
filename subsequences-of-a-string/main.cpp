

#include <bits/stdc++.h>

using namespace std;


unordered_set<string> st;


void subsequence(string s)
{
    for(int i=0;i<s.length();i++)
    {
        for(int j=s.length();j>i;j--)
        {
            string t1=s.substr(i,j);
            st.insert(t1);
            for(int k=1;k<t1.length()-1;k++)
            {
                string t2=t1;
                t2.erase(t2.begin()+k);
                subsequence(t2);
            }
        }
    }
}

int main()
{
    string s="abc";
    subsequence(s);
    for(auto i:st)
    {
        cout<<i<<" ";
    }
    return 0;
}
