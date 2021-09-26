import random
choose=int(input("Choose:"))
if choose>2 or choose<0:
   print("Invalid number.")
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
print("Again? Type yes to play again.")
reply=input(("Reply:"))
if reply==("yes"):
   import rockpaper
if bot==choose:
   print("It's a tie. Type yes to play again.")
   r=input(("Reply:"))
   if r==("yes"):
    import rockpaper
    
   
