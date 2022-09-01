from __future__ import print_function
#from pytube import YouTube
# a=9.12
# b=3
# #rint(b**b)
# #print(a**b**b)
# print(a/b)

# ##########################################################################
# #single divide will always give float
# #double divide will give float if one of the operands is float
# #double divide will give int if both operands are int
# ##########################################################################

# str="ajay" #string is immutable
# str1='ajay' #s
# str2='''ajay kumar chaturvedi''' #multilple line string
# ##########################################################################
# #string can be taken in single and double quotes. If we need 
# ##########################################################################
# print(str,str1,str2)

# def arihtmatics():
#     a=int(input("Enter a number A: "))
#     b=int(input("Enter a number B: "))
#     a=a^b
#     b=a^b
#     a=a^b
#     print("A is ",a)
#     print("B is ",b)

#     c=20
#     d=19
#     c=c%d
#     print(c)

# arihtmatics()


# def string():
#     str='Hello Python'
#     print(str[len(str)-1])
#     print(str[-5])

# string()


# ##########################################################################
# escape sequence | combinational characters | baking characters
# ##########################################################################
# print("'\'Ajay Kumar Chaturvedi\'' b\f")

# ##########################################################################
# boolean is a data type that can be either True or False
# ##########################################################################
# z=True
# print(z)

# ##########################################################################
# None is a data type that is used to represent the absence of value
# ##########################################################################
# i=None
# print (i)

# ##########################################################################
# python has interpreter 
# code executes from top to bottom
# ##########################################################################

# ##########################################################################
# triple quotes are used to write multiple line string
# ##########################################################################

#program to print 2D array
# ##########################################################################
# def print2DArray(arr):
#     for i in range(0,len(arr)):
#         for j in range(0,len(arr[i])):
#             print(arr[i][j],end=" ")
#         print()

# arr=[[1,2,3],[4,5,6],[7,8,9]]
# print2DArray(arr)

# ###########################################################################
# list is a collection which is ordered and changeable. Allows duplicate members.
# with the help of list we can perform all the list operations.
# difference betwween append and extend is that extend is used to add list to another list. append is used to add single element to list. 
# list is mutable and list can be changed. 
# list can be created by using square brackets or by using the list() function.
# ##########################################################################  

# ##########################################################################
# difference between pop and remove is that pop is used to remove last element from list and remove is used to remove specific element from list.
# ##########################################################################

# ##########################################################################
# 
# ##########################################################################

# arr=[1,2,3,4,5,6,7,5,5,5,8,9]
# #remove(x) removes the first occurrence of x =() is fucntion calling operator
# arr.remove(5)
# print(arr)

# ##########################################################################
# n=int(input("Enter the number of elements in the list: "))
# arr=[]
# for i in range(0,n):
#     x=int(input("Enter the element: "))
#     arr.append(x)
# print(arr)
# ##########################################################################

# ##########################################################################
# a=[1,2,3,4,5,6]
# a.insert(10,23)
# print(a)

# for i in range (0,len(a)):
#     print(a[i])
# ##########################################################################

# ##########################################################################
# a=[1,2,3,4,5]
# b=[6,7,8,9,10]
# a.append(b)
# #a.extend(b)
# print(a[5][1])
# a.pop()
# print(a)
# ##########################################################################

# ##########################################################################
# Tuples are immutable lists. Tuples can be created by using parantheses or by using the tuple() function.
# Tuple is a collection which is ordered and unchangeable. Allows duplicate members.
# in bulit in function we can use tuple() function to convert list to tuple. 
# methods in tuple are: count(), index(), len(), max(), min(), reverse(), sort() and tuple() 
# we can update the nested values of list in tuple if we go t[1][0] like this only
# ##########################################################################

# ##########################################################################
# Dictionary is a collection which is unordered, changeable and indexed. Allows duplicate members.
# Dictionary is defined by {}
# Dictionary can be created by using dict() function or by using key-value pairs.
# Dicionary keys must be immutable.
# ##########################################################################

# ##########################################################################
# l=[["Name1","Manish"],["Name2","Ajay"]]
# d=dict(l)
# print(d)
# built in methods of dictionary are clear(),copy(),fromkeys(),get(),items(),keys(),pop(),popitem(),setdefault(),update(),values() and viewitems() and viewkeys() and viewvalues() methods.
#
# dic={1:"Manish",2:"Ajay",3:"Kamal",4:"Pawan"}
# dic.pop(3)
# print(dic)
# dic.popitem()
# print(dic)
# dic.clear()
# ##########################################################################

