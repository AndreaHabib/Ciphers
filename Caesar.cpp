#include<iostream>
#include<string>
using namespace std;
string encrypt(int, string);
int main() {
	string mes = ""; //message to be encrypted
	string result = ""; //encrypted message
	int shift; //how many shifts of each letter in message to be encrypted
	cout << "Enter message to encrypt: " << endl;
	cin >> mes;
	cout << "Enter amounts of shifts: " << endl;
	cin >> shift;
	result = encrypt(shift, mes); //call encrypt
	cout << result << endl; //print encrypted message
	return 0;
} //end main
string encrypt(int shift, string mes) {
	string result = "";
	for (int i = 0; i < mes.length(); i++) { //check through all the letters in message to be encrypted
		if (isupper(mes[i])) { //check if upper case
			result += char(int(mes[i] + shift - 65) % 26 + 65); //use encryption algorithm (x + n) % 26 using ASCII values
			// cast as int then shift each letter in ASCII + shift, then mod with 26 and add 65 (uppercase ASCII) then cast back to char
		}
		else {
			result += char(int(mes[i] + shift - 97) % 26 + 97);
			//same as uppercase but lowercase ASCII starting from 97
		}
	}
	return result; //return the encrypted message

} //end encrypt