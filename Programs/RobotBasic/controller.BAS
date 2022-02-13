Rectangle 300,500,500,530,GREEN,GREEN
Rectangle 300,560,500,590,BLUE,BLUE
Rectangle 300,530,375,560,RED,RED
Rectangle 425,530,500,560,LIGHTRED,LIGHTRED

rLocate 400,400
while true
readmouse x,y,b     // find out where the mouse is
readpixel x,y,c     // read the color where the mouse is
if c = RED then rTurn -1 
if c=GREEN then rForward 1
if c=LightRED then rTurn 1
if c=BLUE then rForward -1
delay 10
wend
