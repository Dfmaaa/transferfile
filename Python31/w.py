open("TEXTTRY.txt", "w")
    
TEXTTRY.txt.write("Hello \n")
TEXTTRY.txt.writelines(L)
TEXTTRY.txt.close()  
  
open("TEXTTRY.txt", "r+")
print(TEXTTRY.txt.read())
