def find_maximum(a,b,c):
    return max(a,b,c)
num1=float(input("enter the first number:"))
num2=float(input("enter the second number:"))
num3=float(input("enter the third number:"))
maximum=find_maximum(num1,num2,num3)
print(f"The maximum of {num1},{num2} and {num3} is:{maximum} ")
