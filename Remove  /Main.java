
#include <bits/stdc++.h> 
using namespace std; 

string removeWord(string str, string word) 
{ 
	if (str.find(word) != string::npos) 
	{ 
		size_t p = -1; 

		string tempWord = word + " "; 
		while ((p = str.find(word)) != string::npos) 
			str.replace(p, tempWord.length(), ""); 

		tempWord = " " + word; 
		while ((p = str.find(word)) != string::npos) 
			str.replace(p, tempWord.length(), ""); 
	} 
	return str; 
} 

// Driver Code 
int main(int argc, char const *argv[]) 
{ 
	char str[200];
  cin.getline(str,200);
    string word("the");
  
cout<<removeWord(str,word);
}
