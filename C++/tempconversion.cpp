//WAP TO CONVERT FAHRENHEIT TO CELCIUS FORMULA: 9C/5 = F-32

#include<iostream>
using namespace std;
#include<math.h>
int main(){
int temp,c;
cout<< "Enter temp in fahrenheit: "<<endl;
cin>>temp;
c = 5* (temp - 32)/9;

cout<< "Temp in celcius is: "<<c;
return 0;
}
