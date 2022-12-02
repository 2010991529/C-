#include <iostream>
using namespace std;
int main() {
    int x, i;
    float avg = 0, y;
    cout << "Enter the number of elements to calculate the average::\n";
    cin >> x;
    cout << "Enter " << x << " elements one by one\n\n";
    for(i = 0; i < x; i++) {
        cin >> y;
        avg += y;
    }
    avg /= x;
    cout << "\nThe average of the entered input numbers is = " << avg;
    return 0;
}