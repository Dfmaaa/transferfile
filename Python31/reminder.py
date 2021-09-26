import time
hour=int(input("Hours:"))
minute=int(input("Minutes:"))
second=int(input("Seconds:"))
message=input(("The message you want to be shown at the given time:"))
if hour==(0) and second==(0) and minute==(0):
   print("Why did you enter 0 as the value for both the questions?")
   print("Go do something useful.")
if  second>0 or hour>0 or minute>0:
   timefinal=(hour*60*60+minute*60+second)
   print("We will remind you when the time comes..")
time.sleep(timefinal)
print(message)
import reminder
               
