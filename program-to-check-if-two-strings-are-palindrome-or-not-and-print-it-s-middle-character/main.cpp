#include <iostream>
using namespace std;
int main()
{
    string s1="abc";
    string s2="cba";
    string
    int i=0,j=s2.length()-1;
    int mid=s1.length()/2;
    while(i<s1.length()&&j>=0)
    {
        if(s1[i]!=s2[j])
        {
            cout<<"not palindrome";
            exit(0);
        }
        i++;
        j--;
    }
    cout<<"palindrome "<<s1[mid];
    return 0;
}
