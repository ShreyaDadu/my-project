//We've shown you how to declare structures intended to store information about dates. Now we encourage you to declare a structure for handling the time of day with an accuracy of one minute. We think your structure will have two fields, but we don't want to suggest anything more – all the design decisions are up to you.
//After you've done that, declare a variable of the previously declared structure type and write a code asking your user for two values: hours and minutes. Note: you should use a 24-hour clock, sometimes referred to as "military time".
//Check the inputted values carefully – don't accept ideas like 25:71; store the values in your structure variable.
//Next, input an int value and assume that this is a number of minutes – let it be the duration of some event.
//Your task is to output a time of day (hours and minutes respectively) that will be shown on clocks immediately after our event; try to show it in the form "HH:MM".

//Sample Input--
//11
//58
//23
//Expected output-12:21

#include<iostream>
using namespace std;
/*struct TIME{
int h;
int m;
};
int main(){
TIME time;
int dur;
dur = time.h = time.m = -1;
while(time.h<0 || time.h>23){
    cout << "Enter hour: ";
    cin>> time.h;
    if(time.h<0 || time.h>23){
        cout<< "Invalid hours: "<<time.h<<endl;
    }
}
while(time.m<0 || time.m>59){
    cout << "Enter min: ";
    cin>> time.m;
    if(time.m<0 || time.m>59){
        cout<< "Invalid minutes: "<<time.m<<endl;
    }
}
while(dur < 0) {
		cout << "Enter duration (minutes): ";
		cin >> dur;
		if(dur < 0)
			cout << "Invalid duration: " << dur << endl;
	}
int hh = dur / 60;		// hours within duration
	int mm = dur % 60;		// remaining minutes
	time.m += mm;			// increment minutes
	time.h += hh;			// increment hours
	time.h += time.m / 60;		// update hours to reflect minutes above 59
time.m %= 60;			// correct minutes
	time.h %= 24;			// correct hours
	if(time.h < 10)
		cout << 0;
	cout << time.h << ":";
	if(time.m < 10)
		cout << 0;
	cout << time.m << endl;
	return 0;
}*/





int main() {
        for(float val = -10.0; val < 100.0; val = -val * 2) {
            if(val < 0 && -val >= 40)
                break;
            cout << "*";
        }
        return 0;
}





