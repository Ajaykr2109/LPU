rectangle 300,50,500,100,green,blue
rLocate 400,300
rspeed 5
rturn 10
while true
getkey k

if k==ascii("s") then rforward -1
if k==ascii( "a") then rturn -1
if k==ascii( "d") then rturn 1
if k==ascii( "w") then rforward 1


wend
