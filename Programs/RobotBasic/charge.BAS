rLocate 300,500
print "Starting Charge = ",rChargeLevel()

print
print "Loop # Charge"
for i=1 to 50
rForward 300
rTurn 90
print " ",i;rChargeLevel()
if rChargelevel()<90
print"Battery is low"
break;
endif
next
end
