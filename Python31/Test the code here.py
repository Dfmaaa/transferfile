import os
def find():
 counter=0
 inp = input("What are you looking for?:")
 hard=input("Hard drive:")
 thisdir = os.getcwd()
 for r, d, f in os.walk(hard): # change the hard drive, if you want
    for file in f:
        filepath = os.path.join(r, file)
        if inp in file:
        	counter += 1
        	print(os.path.join(r, file))
 print(f,"trovati {counter} files.")
