#include <iostream>
using namespace std;

int main()
{
    int times;
    cin>> times;
    for(int i =0; i < times; i++)
    {
        int r, e, c;
        cin>> r>> e>> c;
        if(r > e-c)
            cout<< "do not advertise"<< endl;
        else if(r < e-c)
            cout<< "advertise"<< endl;
        else    
            cout<< "does not matter"<< endl;
    }
    return 0;
}