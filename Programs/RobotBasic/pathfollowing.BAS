MainProgram:
gosub Drawline
gosub iniSim

gosub FollowLine

end

Drawline:

setColor GREEN

lineWidth 100

Line 400,400,400,350

lineTo 430,300

lineTo 460,270

lineTo 470,250

lineTo 470,200

lineTo 450,150

LineTo 450,100

return

iniSim:

rlocate 400,400

rinvisible GREEN

return

FollowLine:
while(true)

rforward 1

if rsense()=0

rturn -1

else

rturn 1

endif

wend
