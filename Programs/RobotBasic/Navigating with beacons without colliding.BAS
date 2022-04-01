rLocate 500,100
rInvisible red


rectangle 400,480,450,450,red,red
rectangle 100,180,150,150,yellow,yellow
rectangle 600,280,650,250,blue,blue
rslip 50 //slip the robots whenever it reach near the object
repeat
while!(rBeacon(red))
rturn 1
wEnd
rForward rBeacon(red)
until(rBeacon(red) != 0) && (rBeacon(red) < = 2)

rInvisible blue
repeat
while!(rBeacon(blue))
rturn 1
wEnd
rForward rBeacon(blue)
until(rBeacon(blue) != 0) && (rBeacon(blue) < = 2)

rInvisible yellow
repeat
while!(rBeacon(yellow))
rturn 1
wEnd
rForward rBeacon(yellow)
until(rBeacon(yellow) != 0) && (rBeacon(yellow) < = 2)
