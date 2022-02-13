Rectangle 300,530,375,560,RED,RED
Rectangle 300,500,500,530,GREEN,GREEN
while true
readmouse x,y,b   //mouse position  
readpixel x,y,c                   //pixel color

if c=RED
size = 50
xyString 350,20,"RED     "
endif
if c=GREEN 
size = 50
xyString 350,20,"GREEN"
endif
delay 10
wend
