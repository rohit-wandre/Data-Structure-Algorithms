

#include <bits/stdc++.h>

using namespace std;

int main()
{
    int dd,yyyy,mm;
    cin>>dd>>mm>>yyyy;

 if(dd!=1)
 {
    dd=dd-1;
    cout<<dd<<" "<<mm<<" "<<yyyy<<endl;
 }
 
 else
 {
     if(mm==1)
     {
         dd=31;
         mm=12;
         yyyy=yyyy-1;
     }
     else if(mm==4||mm==6||mm==9||mm==11)
     {
         dd=31;
         mm=mm-1;
     }
     else if(mm==3)
     {
         if(yyyy%4==0)
         {
             
             dd=29;
         }
         else {
             dd=28;
             
         }
         mm=mm-1;
     }
     else if(mm==2)
     {
         
         dd=31;
         mm=mm-1;
     }
     else
     {
         dd=30;
         mm=mm-1;
     }
     cout<<dd<<" "<<mm<<" "<<yyyy<<endl;
     
 }
    return 0;
}
