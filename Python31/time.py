import time
hour=int(input("Hours:"))
second=int(input("seconds:"))
activ=input(("Any special things you want me to remind you at the given time? type no to not get any reminders, type something to get a reminder:"))
message=input(("Select the message you want to be shown. Type . to get the default message."))
if hour==(0) and second==(0):
   print("Why did you enter 0 as the value for both the questions?")
   print("Go do something useful.")
if second>0:
   timefinal=(hour*60+second)
time.sleep(timefinal)
if activ==("no") or ("No") or ("No.") or ("no."):
   print("REMINDER.")
else:
 print(activ)
               
