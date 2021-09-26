import geocoder
while True:
 add=input(("enter ip:"))
 see=geocoder.ip(add)
 print("Address:",see.address)
 print("latitude & longitude:",see.latlng)
 print("postal:",see.postal)
