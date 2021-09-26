#some people might have to install random....
import random
print("type 0 to choose rock,1 to choose paper, 2 to choose scissors.")
choose=int(input("Choose:"))
if choose>2 or choose<0:
   print("Invalid number.type yes to play again, or type exit to close.")
   tryy=input(("Reply:"))
   if tryy==("yes"):
    import rockpaper
    if tryy==("exit"):
     exit()
    if choose<=0 and choose>=2:  
     bot=(random.randint(0,2))
print("ROCK,PAPER,SCISSORS!!!!!!!!!!")
print("The bot chose",bot)
if bot==0 and choose==2:
   print("You lose.")
if bot==1 and choose==0:
   print("You lose.")
if bot==2 and choose==1:
   print("You lose.")
if bot==0 and choose==1:
   print("You win!")
if bot==2 and choose==2:
 print("You win!")
if bot==1 and choose==2:
   print("You win!")
print("Again? Type yes to play again. type exit to close.")
reply=input(("Reply:"))
if reply==("exit"):
    exit()
if reply==("yes"):
  import rockpaper
if bot==choose:
   print("Its a tie. type yes to play again, and type exit to close.")
   asd=input(("Reply:"))
   if asd==("yes"):
    import rockpaper
   if asd==("exit"):
    exit()
    
