#include <iostream>
#include <cmath>
using namespace std;

int main()
{
    string in;
    cin>> in;

    int days;
    for(int i = 0; i < in.length(); i++)
    {
        char target = "Per"[i %3];
        if(in[i] != target)
        days++;
    }
    cout<< days<< endl;
    return 0;  
}