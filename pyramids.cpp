#include <cmath>
#include <iostream>
using namespace std;

int main()
{
    int n, temp=0, i=1, j=0;
    cin>> n;
    while(temp<n)
    {
        temp += i*i;
        i += 2;
        j+= 1;
    }

    if(temp > n)
        j-=1;
    cout<< j<< endl;
    return 0;
}