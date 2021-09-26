import os
print("Type find() to search for stuff.")
def option():
 print("File not found. Please type Y to try again. N to exit.")
 x=input()
 if x==("Y"):
  find()
 if x==("N"):
  exit()
def find():
 try:
  counter=0
  inp = input("File name or type:")
  hard=input("Hard drive:")
  thisdir = os.getcwd()
  for r, d, f in os.walk(hard):
    for file in f:
        filepath = os.path.join(r, file)
        if inp in file:
        	counter += 1
        	print(os.path.join(r, file))
  print(f,"trovati {counter} files.")
  find()
 except:
     print("File not found. Please type Y to try again. N to exit.")
     x=input()
     if x==("Y"):
      find()
     if x==("N"):
       exit()
     else:
       print("Invalid command, please try again.")
       option()
       
    
