//write a function equipped with the following features:
//its name should be "isLeap";
//it accepts one argument of type int representing the year number;
//it returns a bool value: true if the year is leap and false otherwise;
//it should be mute! It mustn't write anything to the output � the only way it reveals its actions is by the value it returns.

#include<iostream>
using namespace std;
bool isLeap(int year){
if(year%4 != 0){
    return false;
}
else if (year % 100 != 0){
		return true;}
	else if (year % 400 != 0){
		return false;}
	else{
		return true;
} }
int main(void){
int yr;
cout<< "enter yr: "<<endl;
cin>> yr;
cout<< isLeap(yr);
}
