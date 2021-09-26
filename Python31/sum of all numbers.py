print("This application will find the sum of all numbers.")
print("this application has been made by Sameer Achhab.")
num=int(input("Type the number where you want to start from:"))
n=int(input("Type the number where you want to end:"))
sum=0
for x in range(num,n):
 sum+=x
print("The sum of all the numbers from",num,'to', n,'is:', sum)
d=input(("Type close to exit:"))
if d==("close") or ("Close") or ("close.") or ("Close"):
 exit()
