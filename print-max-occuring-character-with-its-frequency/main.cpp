#include <bits/stdc++.h>
using namespace std;
int main()
{
 char arr[]="aaa!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!b";
 int n=strlen(arr);
 int temp[256]={0};
 int max=0;
 char res;
 for(int i=0;i<n;i++)
 {
    temp[arr[i]]++; // this part will count the frequencies of all characters
    
    
 // this part will update max with maximum occring character. It's frequency will be stored in max and character will get stored in res 
 
    if(max<temp[arr[i]]) 
    {
        max=temp[arr[i]];
        res=arr[i];
    }
 }
 cout<<res<<" "<<max;
 return 0;
}
