print("Hello, this is the TSMA(Test Social Media App")
print("Options:")
print("Type login to view your content.")
print("Type users to see all the users.")
user1=("Sameer Achhab")
user2=("Fariya Achhab")
user3=("Samima Yasmin")
user4=("Ilias Achhab")
pass1=("$bigpass1729")
pass2=("noob940")
pass3=("BIGNOOB")
pass4=("$$$pass$$$")
inpt=input(("Type:"))
if inpt==("users") or ("Users"):
  print("The users are",user1,',',user2,',',user3,',''and',user4)
if inpt==("login") or ("Login"):
 usertype=input(("User:"))
password=input(("Password:"))
if usertype==user1 and password==pass1:
   import content
if usertype==user2 and password==pass2:
   import Content2
if usertype==user3 and password==pass3:
   import Content3
if usertype==user4 and password==pass4:
   import Content4
else:
      print("WRONG PASSWORD OR USER. GET OUT!!!!")
      


   

