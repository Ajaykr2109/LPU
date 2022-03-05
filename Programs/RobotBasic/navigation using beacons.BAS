rLocate 500, 100
rspeed 4
rInvisible red
rectangle 400, 480, 450, 450, red, red
rectangle 100, 180, 150, 150, blue, blue
rectangle 600, 280, 650, 250, yellow, yellow
rslip 50
repeat
while !(rBeacon(red))
rTurn 1
Wend
rForward rBeacon(red)
while !(rBeacon(blue))
rTurn 1
Wend
rForward rBeacon(blue)
while !(rBeacon(yellow))
rTurn 1
Wend
rForward rBeacon(yellow)
until(rBeacon(red) != 0) && (rBeacon(red) < = 2)
