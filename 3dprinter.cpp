#include <iostream>
#include <cmath>
using namespace std;

int main() {
    int n;
    cin >> n;
    cout << static_cast<int>(ceil(log2(n))) + 1 << endl;
    return 0;
}