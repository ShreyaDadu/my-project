//WAP TO FIND MAX/MIN VALUE IN A LIST OF 10 INTEGERS.USING POINTER MANIPULATION

#include<iostream>
using namespace std;
int main(){
int num[10];
 int *ptr = num;
cout<< "Enter 10 integers: "<<endl;
for(int i=0; i<10; i++){
    cin>> *(ptr + i);
}
int max = *ptr;
int min = *ptr;
for(int i=1; i<10; i++){
    if(*(ptr + i)> max)
    {
        max = *(ptr + i);
    }
    if(*(ptr + i)<min){
        min = *(ptr + i);
    }}
    cout<< "Maximum value is: "<< max<<endl<< "Min is: " << min;
return 0;
}
