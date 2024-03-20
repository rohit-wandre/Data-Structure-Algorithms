#include<bits/stdc++.h>
using namespace std;
int main()
{
		char mat[7][7]={'.','.','.','.','.','.','.',
		                '.','.','.','.','.','.','.',
		                '.','.','.','.','.','.','.',
		                '.','.','.','.','.','.','.',
		                '.','.','.','.','.','.','.',
		                '.','.','.','.','.','*','.',
		                '.','.','.','.','.','.','.',};
		int mid=3;
		bool flag=false;
		int p1=0,p2=0;
		for(int i=0;i<7;i++)
		{
			for(int j=0;j<7;j++)
			{
				if(mat[i][j]=='*')
				{
					p1=i;
					p2=j;
				}
		}
		}
		int res=abs(mid-p1)+abs(mid-p2);
       cout<<res<<endl;
}