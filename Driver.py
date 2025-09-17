m = input("Enter marital status (Married/Unmarried): ")
gender = input("Enter the gender (Male/Female): ")
age = int(input("Enter your age: "))

if m == "married":
    print("Driver is insured")
else:
    print("Driver is unmarried")
    if gender == "male" and age > 30:
        print("Driver is insured")
    elif gender == "female" and age > 26:
        print("Driver is insured")
    else:
        print("Driver is not insured")
