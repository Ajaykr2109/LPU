vlist<-list(1,TRUE,"CAP787","CAP788",2+5i,FALSE)
vlist[c(3,6)]

vlist[3]<-"Hello"
vlist<-vlist[-5]
for(x in vlist)
{
  print(x)
}