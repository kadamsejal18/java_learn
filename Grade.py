Grade=float(input("Enter your score:"))

if(Grade>=90):
    print("A",Grade)
elif(Grade>=70):
    print("B",Grade)
elif(Grade>=30):
    print("C",Grade)
elif(Grade<30):
    print("fail",Grade)
else:
    print("invalid !",Grade)
