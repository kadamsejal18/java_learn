print("select operation")
print("1.Add")
print("2.Subtract")
print("3.multiply")
print("4.Divide")

a = input("Enter your operation +,-,*,/ :")
b=int(input("Enter first number :"))
c=int(input("Enter second number:"))

if a=='+':
    result=b+c
    print("The result is :",result)
elif a=='-':
    result=b-c
    print("The result is :",result)
elif a=='*':
    result=b*c
    print("The result is :",result)
elif a=='/':
 if c!=0:
    result=b/c
    print("The result is :",result)
 else:
    print("Error !")
else:
    print("Invalid !")
    
    
    
