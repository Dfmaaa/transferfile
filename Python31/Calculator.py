print("Type help to see the options. Type open to start the calculator")
inz=input(("Type:"))
if inz==("help"):
 print("This is a Calculator.")
 print("Type add(1st number,the 2nd number) to add.")
 print("Type subtract(the number you want to subtract from,the number you want to subtract) to subtract.")
 print("Type divide(the dividend,the divisor) to divide.")
 print("Type multiply(number 1,number 2) to multiply.")
 print("exponent(base,exponent) to use the exponent function.")
 print("Type squareroot(the number you want the square root of) to use the square root function.")
 print("Type cuberoot(the number you want the cube root of.")
 print("Type mod(the number,the divisor) to find the modulus.")
 import Calculator
if inz==("open") or ("Open"):
 print("You can use the calculator now! Use all the functions!")
 def add(x,y):
      return x+y
 def subtract(number1,number2):
      return number1-number2
 def divide(dividend,divisor):
      return dividend/divisor
 def multiply(number1,number2):
      return number1*number2
 def exponent(base,exponent):
      return base**exponent
 def squareroot(thenumber):
      return thenumber**(1/2)
 def cuberoot(thenumber):
      return thenumber**(1/3)
 def mod(num,num1):
    return num%num1
else:
   print("Wrong response. Please try again with 'open' or 'help'")
   import Calculator
   

 



       


   
