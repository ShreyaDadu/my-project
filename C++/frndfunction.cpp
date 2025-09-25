//WAP to find greatest of 2 given no. in 2 different classes using friend function

#include<iostream>
using namespace std;
class A;
class B{
int number;
public:
    B(int x){
    number=x;
    }
    void friend greatest(A o1, B o2);
};
class A{
int number;
public:
    A(int x){
    number=x;
    }
    void friend greatest(A o1, B o2);
};
void greatest(A o1, B o2){
if(o1.number>o2.number){
    cout<<"Number in class A is greatest= "<<o1.number;
}
else if(o2.number>o1.number){
    cout<<"Number in class B is greatest= "<<o2.number;
}
else{
    cout<<"Numbers in both classes are equal"<<endl;
}
   }
   int main(){
   int num;
   cout<<"Enter number for class A: ";
   cin>>num;
   A o1(num);
   cout<<"Enter number for class B: ";
   cin>>num;
   B o2(num);
   greatest(o1, o2);
   return 0;
   }
