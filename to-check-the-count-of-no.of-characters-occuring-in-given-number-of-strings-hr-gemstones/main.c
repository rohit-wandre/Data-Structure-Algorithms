#include<stdio.h>
#include<string.h>
int main()
{
    int n;
    scanf("%d",&n);
    int letter[26]={0}; // this array is used to keep the count of alphabets occuring in each array.
    int count=0;
    for(int i=0;i<n;i++) // take 'n' number of strings one by one.
    {
        char s[100];
        scanf("%s",s);
        for(int j=0;j<strlen(s);j++) // iterate over (i+1)th string 
        {
            char  c=s[j]; // pick first character of that string 
            
            if(letter[c-'a']==i) // if that character is occuring ith number of times then increment its count.
            {
                letter[c-'a']++;
            }
            
            if(letter[c-'a']==n)  // if that character is occuring given number of strings time that means it is present in all strings.
            {
                count++;  
            }
        }
    }
    printf("%d",count);
}
