/*#include<iostream>
#include<cstdlib>
#include<ctime>
using namespace std;
int balance = 1000;
int holding = 0;

int get_price(){
    return 90 + rand() %21;
}
int main(){
    int price;
while (true){
     price = get_price();
    cout<< "Enter current price: "<<price<<endl;

if(holding == 0 && price<90){
    holding = 1;
    balance = balance - price;
}
else if(holding == 1 && price>105){
    holding = 0;
    balance += price;
}}
cout<< "balance = "<<balance<<endl;
return 0;
}*/
#include <iostream>
#include <string>

using namespace std;

int main()
{
    int i = 2;
    string s = "2";
    cout << s == i;
}








































































