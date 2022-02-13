rectangle 5,10,200,100
rectangle 800,100,700,500
rectangle 450,320,250,420
rectangle 220,850,120,220


rlocate 40,800
for i=1 to 10000
d=rFeel()
if d<20
rturn random(200)
endif
rforward 1
next
