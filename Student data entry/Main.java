#include <iostream>
#include<string.h>
#include<stdlib.h>
using namespace std;
struct student
{
  char name[50];
  int roll;
  float marks;
}s;
int main() 
{
  
  cin.getline(s.name,50);
  cin>>s.roll>>s.marks;
  cout<<"\nStudent Details"<<"\nName: "<<s.name<<"\nRoll: "<<s.roll<<"\nMarks: "<<s.marks;
   //Your code goes here
}