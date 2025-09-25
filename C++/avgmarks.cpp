//WAP TO TAKE STUDENT INFORMATION AND DISPLAY RESULT OF 15 STUDENTS ON THE BASIS OF AVG MARKS (ABOVE 40-PASS)
/*#include <iostream>
using namespace std;

struct Student {
    int rollNo;
    string name;
    int marks[5];   // suppose 5 subjects
    float avg;
};

int main() {
    Student s[15];

    cout << "Enter details of 15 students:\n";

    for (int i = 0; i < 15; i++) {
        cout << "\nStudent " << i + 1 << ":\n";
        cout << "Roll No: ";
        cin >> s[i].rollNo;
        cout << "Name: ";
        cin >> s[i].name;

        int sum = 0;
        cout << "Enter marks of 5 subjects: ";
        for (int j = 0; j < 5; j++) {
            cin >> s[i].marks[j];
            sum += s[i].marks[j];
        }

        s[i].avg = sum / 5.0;
    }

    cout << "\n===== RESULTS =====\n";
    cout << "RollNo\tName\tAverage\tResult\n";

    for (int i = 0; i < 15; i++) {
        cout << s[i].rollNo << "\t" << s[i].name << "\t"
             << s[i].avg << "\t";

        if (s[i].avg > 40)
            cout << "PASS\n";
        else
            cout << "FAIL\n";
    }

    return 0;
}*/









