#include<iostream>
#include<string.h>
#include<stdlib.h>
using namespace std;
int main()
{
  char s[200];
  cin>>s;
  for(int i=0;i<strlen(s);i++)
  {
    if((s[i]>='a' && s[i]<='z')||(s[i]>='A' && s[i]<='Z'))
      cout<<s[i];
  }
  //Type your code here.
}