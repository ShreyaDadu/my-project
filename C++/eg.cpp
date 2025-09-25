#include<iostream>
#include <iomanip>
using namespace std;
int main(){
float taxrate,grossprice,netprice,taxvalue;
cout<<"Enter taxrate: "<<endl;
cin>>taxrate;
cout<<"grossprice: "<<endl;
cin>>grossprice;
if(grossprice<=0.0 || taxrate<0.0 || taxrate>100.0){
    cout<<"Enter valid values.";
}
else {
        netprice = grossprice / (1.0 + taxrate / 100.0);
        taxvalue = grossprice - netprice;
        cout << fixed << setprecision(4); // Set precision to 4 decimal places
        cout << "Net price: " << netprice << endl;
        cout << "Tax value: " << taxvalue << endl;
    }
    return 0;


}
