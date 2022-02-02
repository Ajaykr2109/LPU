Main:
 gosub inrobo
 gosub dsq
end
inrobo:
 rlocate 400,500 
 rinvisible RED                                           
 linewidth 8     
 rpen down       
 rslip 15
return


dsq:             
 for i=1 to 20   
 rforward 400   
 rturn 90 
 if rRange()<2
 rturn 90  
 endif     
 next
end

