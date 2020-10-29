per_inch = 2.54
user = input("inch? ")
inch = float(user)
cm = inch * per_inch
desc = "{0}inch = {1}cm".format(inch,cm)
print(desc)