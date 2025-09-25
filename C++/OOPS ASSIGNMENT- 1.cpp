//OOPS ASSIGNMENT-1

//1) WAP TO FIND SUM OF DIGITS OF GIVEN INTEGER
/*#include<iostream>
#include<conio.h>
using namespace std;
int main(){
int n,d1,d2,d3,d4,d5,sum;
cout<< "Enter a five digit number: ";
cin>>n;
d1=n%10;
n=n/10;
d2=n%10;
n=n/10;
d3=n%10;
n=n/10;
d4=n%10;
n=n/10;
d5=n%10;
sum = d1+d2+d3+d4+d5;
cout<< "The sum of digits of given no: "<<sum;
getch();
return 0;
}
*/
//2) WAP TO SWAP TWO NUMBERS USING THIRD VARIABLE.
/*#include<iostream>
#include<conio.h>
using namespace std;
int main(){
int a,b,c;
cout<< "Enter first number: "<<endl;
cin>>a;
cout<< "Enter second number: "<<endl;
cin>>b;
c=a;
a=b;
b=c;
cout<< "Value of numbers after swapping: "<<endl;
cout<< "First no.: "<<a<<endl;
cout<< "Second no. "<<b<<endl;
getch();
}*/

//3) WAP TO CONVERT DEGREE FAHRENHEIT TO CELCIUS
/*#include<iostream>
#include<conio.h>
using namespace std;
int main(){
int f,c;
cout<< "Enter degree in fahrenheit: ";
cin>>f;
c= (5*(f-32))/9;
cout<< "Degree in celcius is: "<<c;
getch();
return 0;
}*/

//4) WAP TO ENTER ANY 5DIGIT NUMBER AND PRINT IT IN REVERSE ORDER
/*#include<iostream>
#include<conio.h>
using namespace std;
int main(){
int n,d1,d2,d3,d4,d5,sum;
cout<< "Enter a five digit number: ";
cin>> n;
d1 = n%10;
n= n/10;
d2 = n%10;
n= n/10;
d3 = n%10;
n= n/10;
d4 = n%10;
n= n/10;
d5 = n%10;
cout<< "Entered no. in reverse order is: "<<d1<<d2<<d3<<d4<<d5;
getch();
}*/

//5) WAP TO PRINT CIRCUM AND AREA OF CIRCLE
/*#include<iostream>
#include<conio.h>
using namespace std;
int main(){
float pi,r,c,a;
cout<< "Enter radius of circle: ";
cin>> r;
pi = 3.14;
c = 2*pi*r;
a=pi*r*r;
cout<< "Circumference of circle is: "<<c<<endl;
cout<< "Area of circle is: "<<a<<endl;
getch();
return 0;
}*/

//6) WAP TO OBTAIN GROSS SALARY BY CALCULATING DEARNESS ALLOWANCE AND HOUSE RENT
/*#include<iostream>
#include<conio.h>
using namespace std;
int main(){
float basic,da,hr,gs;
cout<< "Enter basic salary: ";
cin>>basic;
da = (basic * 12)/100;
hr = (basic * 30)/100;
gs = basic + da + hr;
cout<< "Gross salary calculated is: "<< gs;
getch();
}*/

//7) WAP TO CONVERT KILOMETERS TO METERS
#include<iostream>
#include<conio.h>
using namespace std;
int main(){
int km,m;
cout<< "Enter distance in kilometers: ";
cin>> km;
m = km * 1000;
cout<< "Distance in meters is: "<<m;
return 0;
}
