#include<iostream>
#include<string.h>
#include<stdlib.h>
using namespace std;
int main()
{
  int v=0,c=0,w=0,d=0,s=0;
  char ss[200];
  cin.getline(ss,200);
  for(int i=0;i<strlen(ss);i++)
  {
    if((ss[i]>='a' && ss[i]<='z')||(ss[i]>='A' && ss[i]<='Z'))
    {  if(ss[i]=='a'||ss[i]=='A'||ss[i]=='e'||ss[i]=='E'||ss[i]=='i'||ss[i]=='I'||
         ss[i]=='o'||ss[i]=='O'||ss[i]=='u'||ss[i]=='U')
        v++;
       else
         c++;
    }
    else if(ss[i]==' ')
      w++;
    else if(ss[i]>='0' && ss[i]<='9')
      d++;
    else
      s++;
  }
   cout<<"Vowels:"<<v<<'\n'<<"Consonants:"<<c<<'\n'<<"White Spaces:"<<w<<'\n'<<"Digits:"<<d<<'\n'<<"Symbols:"<<s;        
    
  //Type your code here.
}