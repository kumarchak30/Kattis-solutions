#include <iostream>
#include <cmath>
using namespace std;

int main()
{
    int n, caseNum = 1;
    while (cin >> n) {
        double logCircumference = log10(3) + n * log10(1.5);
        int numDigits = (int) floor(logCircumference) + 1;
        cout << "Case " << caseNum << ": " << numDigits << endl;
        caseNum++;
    }
    return 0;
}