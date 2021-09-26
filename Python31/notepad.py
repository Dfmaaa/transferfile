import os
print("Welcome to the python notepad!")
print("Type new() to create a new file")
print("Type open(file name) to open files.")
def new():
   try:
    name=input(("Name of the file:"))
    content=input(("Content of the file:"))
    write=open(name,mode='w')
    write.write(content)
    print(name,"has been saved!")
   except:
      print("An error has occurred.Please try again.")
def look(file):
   try:
    x=open(file)
    print(x.read())
   except:
    print("File not found! Make sure the file name is correct.")
   
    

   
   


   
   
   
   
   
   
