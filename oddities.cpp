#include <iostream>
#include <cmath>
using namespace std;

int main()
{
    int times;
    cin>> times;
    for(int i = 0; i < times; i++)
    {
        int input;
        cin>> input;
        if(input % 2 == 0)
            cout<< input << " is even" << endl;
        else    
            cout<< input << " is odd" << endl;

    }
    return 0;
}