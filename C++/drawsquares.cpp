#include <iostream>
using namespace std;
int main(void) {
	cout << '+';
	for(int i = 0; i < 4; i++)
		cout << '-';
	cout << '+' << endl;
	for(int i = 0; i < 4; i++) {
		cout << '|';
		for(int j = 0; j < 4; j++)
			cout << ' ';
		cout << '|' << endl;
	}
	cout << '+';
	for(int i = 0; i < 4; i++)
		cout << '-';
	cout << '+' << endl;
	return 0;
}
