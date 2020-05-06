#include <cstring>
#include <iostream>
#include<stdlib.h>
using namespace std;
int main()
{
   //Your code goes here
  char c[100];
  cin.getline(c,100);
  int cnt=1;
  for(int i=0;c[i]!='\0';i++)
  {
    if(c[i]==' ' && c[i+1]!=' ')
      cnt++;
  }
  if(cnt<=10)
    cout<<"Caption eligible for the contest";
  else
    cout<<"Caption not eligible for the contest";
   
}