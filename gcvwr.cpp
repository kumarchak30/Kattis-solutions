#include <iostream>
#include <cmath>
using namespace std;

int main()
{
    int G, T, times;
    cin>> G;
    cin>> T;
    cin>> times;
    int v9 = (G-T)*0.9;
    int sum= 0;
    for(int i =0; i < times; i++)
    {
        int temp;
        cin>> temp;
        sum+= temp;
    }
    cout<< v9-sum;
    sum = 0;
    return 0;
}