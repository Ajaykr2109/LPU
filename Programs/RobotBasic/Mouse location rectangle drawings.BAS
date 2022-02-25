size = 50
LineWidth 3
rLocate 400,300
rTurn 20
while True
ReadMouse x,y,b
if b=1 then Rectangle x,y,x+size,y+size
if b=2 then CIrcle x,y,x+size,y+size
wend
