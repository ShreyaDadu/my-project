/* Your task is to write a simple "measurement converter". We want it to perform the following actions:

ask the user which system she/he uses to input data; we assume that 0 means "metric" and 1 means "imperial";
depending on the user's answer, ask either for meters or feet and inches;
output the distance in proper (different) units: either in feet and inches or in meters;
a result outputted as metric should look like 123.4m;
a result outputted as imperial should look like 12'3.5".*/

#include <iostream>
using namespace std;
int main(void) {
	int   sys; 		// measurement system
	float m, ft, in;	// metres, feet and inches
	int   ift;		// feet but as integer
	cout << "What is your measurement system? 0-metric/1-imperial: ";
	cin >> sys;
	// metric?
	if(sys == 0) {
		cout << "m = ";
		cin >> m;
		// inches first
		in = m / 0.0254;
		// we need integral number of feet
		ift = in / 12;
		// remainder is a real number of inches
		in = in - (ift * 12);
		cout << ift << "'" << in << "\"" << endl;

	// imperial?
	} else if(sys == 1) {
		cout << "ft = ";
		cin >> ft;
		cout << "in = ";
		cin >> in;

		// cumulate inches and feet as inches
		in += 12 * ft;

		// convert inches into meters
		m = in * 0.0254;

		cout << m << "m" << endl;
	}
	return 0;
}
