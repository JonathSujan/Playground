#include <iostream>  
using namespace std;  
int main() {  
  int n1=0,n2=1,n3 = 0,i,number;  
  cin>>number;
  if(number == 1)
    n3 = 1;
  else if(number > 1){
  for(i=2;i<number;++i)
  {    
  n3=n1+n2;        
  n1=n2;    
  n2=n3;    
  }    
  }
  cout<<n3;
   } 