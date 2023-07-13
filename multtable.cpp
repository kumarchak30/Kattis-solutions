#include <iostream>
#include <vector>
#include <algorithm>
#include <cstdint>

int findOccurrences(const std::vector<std::vector<int64_t> >& mulTable, int64_t element) {
    int count = 0;
    for (const auto& row : mulTable) {
        for (int64_t num : row) {
            if (element == num) {
                count++;
            }
        }
    }
    return count;
}

int main() {
    int n, target;
    std::cin >> n >> target;
    
    std::vector<std::vector<int64_t> > MulTable(n, std::vector<int64_t>(n));
    int64_t row = 1;
    int64_t column = 1;

    for (int i = 0; i < MulTable.size(); i++) {
        for (int j = 0; j < MulTable[i].size(); j++) {
            MulTable[i][j] = row * column;
            column = column + 1;
        }
        row = row + 1;
        column = 1;
    }
    
    std::cout << findOccurrences(MulTable, target) << std::endl;

    return 0;
}