#include <iostream>
#include <cmath>
using namespace std;

int main()
{
    int times;
    cin>> times;
    int sum = 1;
    for(int i =0; i < times; i++)
    {
        int test;
        cin>>test;
        for(int j = 0; j< test; j++)
        {
            int temp;
            cin>> temp;
            sum+= temp;
        }
        cout<< sum-test<< endl;
        sum = 1;
    }
    return 0;
}