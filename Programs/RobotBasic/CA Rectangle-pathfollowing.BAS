MainProgram:
gosub Drawline
gosub iniSim

gosub FollowLine

end

Drawline:

setColor GREEN

lineWidth 10

Line 400,400,400,400
Lineto 400,300
Lineto 700,300
Lineto 700,400
Lineto 400,400




return

iniSim:

rlocate 400,400

rinvisible GREEN

return

FollowLine:
while(true)

rforward 1

if rsense()=0

rturn 1

else

rturn -1

endif

wend
