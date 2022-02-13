Rectangle random(300),530,random(375),560,RED,RED
Rectangle random(300),500,random(500),530,GREEN,GREEN
Rectangle random(400),400,random(500),530,Blue,BLue
Rectangle random(600),500,random(600),580,Yellow,Yellow
while true
readmouse x,y,b   //mouse position  
readpixel x,y,c  //pixel color

if c=RED
size = 50
xyString 350,20,"RED     "
endif
if c=Yellow
size = 50
xyString 350,20,"Yellow    "
endif
if c=GREEN 
size = 50
xyString 350,20,"GREEN"
endif
if c=Blue
size = 50
xyString 350,20,"Blue     "
delay 10
endif
wend
