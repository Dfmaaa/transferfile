#include <iostream>
using namespace std;
int add(int x){
return x+1;
}
void swap(int &x, int &n){
 int z=x;
 x=n;
n=z;
}
int main(){
 cout << "How many numbers would you like to sort?" << endl;
int len=0;
cin >> len;
int arr[len];
 for(int x=0;x<len;x++){
  cout << "Enter number " << add(x) << ':';
  cin >> arr[x];
}
for(int nn=0;nn<len;nn++){
for(int f=0;f<len-1;f++){
if(arr[f]<arr[f+1]){
swap(arr[f],arr[f+1]);
}
}
}
cout << "sorted.. now showing.." << endl;
for(int g=0;g<len;g++){
cout << arr[g] << endl;
}
char n=' ';
cin >> n;
}