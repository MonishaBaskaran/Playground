#include<iostream>
#include<string.h>
#include<stdlib.h>
using namespace std;
void strrevs(char *s)
{
  int i=0,j=0;
  while(s[j+1])j++;
  while(i<j)
  {
    char tem=s[i];
    s[i]=s[j];
    s[j]=tem;
    i++;
    j--;
  }
}
int main()
{
  char s1[50],s2[50];
  cin>>s1>>s2;
 strrevs(s1);
  int x=strcmp(s1,s2);
  if(x==0)
    cout<<"It is correct";
  else
    cout<<"It is wrong";
  
  //Type your code here.
}