rlocate 400,500

circle 100,150,200,50,green,green
circle 250,150,350,50,red,red
rectangle 300,300,500,400,yellow,yellow
rectangle 50,300,150,400,blue,blue
 
for i=1 to 10000
          if (rFeel()>0)
             rturn random(200)
          endif
rforward 1
next
