#include<iostream>
using namespace std;
int main(){
int n;
cout<< "n is: "<<endl;
cin>>n;
if(n==0 || n==1 ){
    cout<< "1" <<endl;
}
else{
    int result = 1;
    for(int i=2;i<=n;i++){
        result *= i;
    }
    cout<< result;
}
return 0;
}
