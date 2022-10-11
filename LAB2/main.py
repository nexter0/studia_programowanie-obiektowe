from typing import Dict
# LAB2 - Funkcje
# ================

def mult(arg):
    result = 1
    for x in arg:
        result *= x
    return result


def mult_ints(arg) -> int:
    result: int = 1
    for x in arg:
        if type(x) == int:
            result *= x
    return result


def multiply(*args):
    result = 1
    for x in args:
        result *= x
    return result


def multiply_ints(*args) -> int:
    result: int = 1
    for x in args:
        if type(x) == int:
            result *= x
    return result


def make_car(firma: str = "Kia", model: str = "Piccanto", **kwargs) -> Dict:
    car = {"firma": firma, "model": model}
    for k in kwargs:
        car[k] = kwargs[k]
    return car


# LAB 2 - TABLICE WIELOWYMIAROWE I MACIERZE
# =========================================
list2d_1: list[list[int]] = [
    [x for x in range(11)],
    [x**2 for x in range(11)],
    [x**3 for x in range(11)]
]

list2d_2: list[list[int]] = [[x+1 for x in range(i)] for i in range(1, 11)]

complete_sum: int = 0
row_sum: int = 0

for i in range(len(list2d_2)):
    for x in list2d_2[i]:
        row_sum += x
        complete_sum += x
    print(f'Suma wiersza {i}: {row_sum}')
    row_sum = 0

print(f'Suma calkowita: {complete_sum}')


def matrix_sum(a: list[list[int]], b: list[list[int]]):
    c: list[list[int]] = a
    for i in range(len(c)):
        for j in range(len(c[i])):
            c[i][j] += b[i][j]
    return c


def matrix_product(a: list[list[int]], b: list[list[int]]):
    c: list[list[int]] = a
    for i in range(len(c)):
        for j in range(len(c[i])):
            c[i][j] *= b[i][j]
    return c

# ++++ main ++++
def main():
    car1 = {"Kolor": "cafe mocca", "poj_silniki": 900}
    print(mult((3, 5, 7)))
    print(mult(range(2, 8, 2)))
    print(mult_ints([3, 3.14, 5, "abc", 7]))
    print(multiply(3, 5, 7))
    print(multiply_ints(3, 3.14, 5, "abc", 7))
    print(make_car("Kia", "Piccanto", kolor="cafe mocca", pojemnosc=900))
    print(list2d_1)
    print(list2d_2)
    print(matrix_sum([[1, 2, 3], [4, 5, 6]], [[1, 1, 1], [1, 1, 1]]))

if __name__ == "__main__":
    main()
