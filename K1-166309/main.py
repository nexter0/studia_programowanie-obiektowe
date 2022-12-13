from car import *

v_1 = Vehicle()
print(v_1)
print("==================")
v_2 = Vehicle("NO-38EK1", 2, 2013)
print(v_2)
print("==================")
print(f'Model pojazdu v_1: {v_1.model}')
print("==================")
v_1.prod_year = 1990
print(v_1)
v_1.prod_year = 4154
print(v_1)
v_1.model = -564541
print(v_1)
print("==================")
c_1 = Car()
print(c_1)
print("==================")
c_2 = Car("XYZ12345", 3, 2019, 20000, "Czerwony", 3)
print(c_2)
print("==================")
print(c_1 == c_2)
c_3 = Car("XYZ12345", 3, 2019, 20000, "Czerwony", 3)
print(c_2 == c_3)
