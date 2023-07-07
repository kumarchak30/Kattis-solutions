#include <iostream>
#include <cmath>
using namespace std;

int main() {
    int a, b;
    cin >> a >> b;

    if (a == 0 && b == 0) {
        cout << "Not a moose";
    } else if (a == b) {
        cout << "Even " << a * 2;
    } else {
        int points = max(a, b) * 2;
        cout << "Odd " << points;
    }
    return 0;
}