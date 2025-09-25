#include<iostream>
using namespace std;
int main()
{
    int n;
    cout>>"n";
    cin>>n;
    for(n==1 || n=2){
        cout<< 1<<endl;
    }
    else{
        long a=1,b=1,c;
        for(int i=2; i<n; i++){
            c=a+b;
            a=b;
            b=c;
        }
        cout>>c>>endl;
    }
    return 0;
}
