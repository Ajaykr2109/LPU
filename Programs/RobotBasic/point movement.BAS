circle 100,500,120,520,Red,red
circle 100,200,120,220,yellow, yellow
circle 500,500,520,520,green,green
circle 500,200,520,220,blue,blue
rlocate 400,300
rspeed 3
d=rRange()
x=1

while rlook() <> RED
rturn 1
wend 

while x<=10
if d<20
while rlook() <> yellow
rturn 1
wend
endif

if d>20
rforward 1  
endif
wend                                     
