#include <iostream>
#include <string>

int main() {
    std::string s = "AaBbCcDd";
    std::string u, l;

    for (size_t i = 0; i < s.length(); i++) {
        if (i % 2 == 0) {
            u += s[i]; 
        } else {
            l += s[i]; 
        }
    }

    std::cout << u << std::endl;
    std::cout << l << std::endl;

    return 0;
}
