import time
print("Answer the questions to get a list of passwords made specifically for the person.")
fname=input(("First name of the person:"))
lname=input(("Last name of the person:"))
age=input(("Age of the person:"))
sport=input(("Favorite sport of the person:"))
subject=input(("Favorite subject of the person:"))
birthyear=input(("Birth year of the person:"))
favnumber=input(("Favorite number of the person:"))
spec=("$")
print("List of possible passwords:")
print(fname+fname)
print(lname+lname)
print(subject+favnumber)
print(fname+birthyear)
print(fname+sport)
print(sport+fname)
print(favnumber+subject)
print(sport+favnumber)
print(favnumber+sport)
print(fname+favnumber)
print(fname+age)
print(lname+age)
print(fname+fname+age)
print(fname+lname+age)
print(lname+lname+age)
print(lname+fname+age)
print(age+fname+lname)
print(age+lname+fname)
print(fname+spec+favnumber)
print(fname+spec+age)
print(lname+birthyear)
print(fname+spec+lname)
print(fname+fname+spec+favnumber)
print(fname+fname+spec+age)
print(fname+lname+spec+favnumber)
print(fname+lname+birthyear)
print(fname+spec+birthyear)
print(fname+lname+spec+birthyear)
print(sport+spec+favnumber)
print(fname+lname+spec+birthyear)
print("You can paste these paswords in a txt file, then use this a wordlist for brute-forcing someones login.")
time.sleep(999999)
















