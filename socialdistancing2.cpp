#include <cmath>
#include <iostream>
#include <vector>
using namespace std;

int main()
{
    int n, k;
    cin>> n>>k;
    vector<int> occupied(k);

    for(int i =0; i < k; i++)
        cin>> occupied[i];

    vector<int> empty_seats;
    empty_seats.push_back(occupied[0] - occupied[k-1] + n - 1);
    for (int i = 1; i < k; i++)
        empty_seats.push_back(occupied[i] - occupied[i-1] - 1);

    int max_friends = 0;
    for (int empty : empty_seats)
        max_friends += (empty - 1) / 2;

    cout << max_friends << endl;
    return 0;
}