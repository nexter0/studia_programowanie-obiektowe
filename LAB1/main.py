# ++++++++++++++++++
# Zadanie 1
# ++++++++++++++++++

list_a = []
list_b = []
list_c = []
list_d = []
list_e = []
list_f = []

for i in range(10):
    list_a.append(i+1)

print(list_a)

for i in range(11):
    list_b.append(2*i)

print(list_b)

for i in range(10):
    list_c.append((i+1)**2)

print(list_c)

for i in range(10):
    list_d.append(0)

print(list_d)

for i in range(10):
    if i % 2 == 0:
        list_e.append(0)
    else:
        list_e.append(1)

print(list_e)

for i in range(10):
        list_f.append(i % 5)

print(list_f)

# ++++++++++++++++++
# Zadanie 2
# ++++++++++++++++++

list_a = []
list_b = []
list_c = []
list_d = []
list_e = []
list_f = []

i = 0
while i < 10:
    list_a.append(i+1)
    i += 1

print(list_a)

i = 0
while i < 11:
    list_b.append(2*i)
    i += 1

print(list_b)

i = 0
while i < 10:
    list_c.append((i+1)**2)
    i += 1

print(list_c)

i = 0
while i < 10:
    list_d.append(0)
    i += 1

print(list_d)

i = 0
while i < 10:
    if i % 2 == 0:
        list_e.append(0)
    else:
        list_e.append(1)
    i += 1

print(list_e)

i = 0
while i < 10:
        list_f.append(i % 5)
        i += 1

print(list_f)

# ++++++++++++++++++
# Zadanie 3
# ++++++++++++++++++


def ile_ujemnych(alist: list):
    result = 0
    for x in alist:
        if x < 0:
            result += 1
    return result


list_a = [-4, 6, -3, 6, 8, -6, -5, -6, 8, 5, 3, -5]
print(f'W liscie jest {ile_ujemnych(list_a)} liczb ujemnych')

# ++++++++++++++++++
# Zadanie 4
# ++++++++++++++++++


def iloczyn(alist: list):
    result = 1
    for x in alist:
        result *= x
    return result


print(f'Iloczyn liczb wynosi: {iloczyn(list_a)}')

# ++++++++++++++++++
# Zadanie 5
# ++++++++++++++++++


def minmax(alist: list):
    res_min = alist[0]
    res_max = alist[0]
    for x in alist:
        if x < res_min:
            res_min = x
        if x > res_max:
            res_max = x
    return res_min, res_max


print(f"(min, max) = {minmax(list_a)}")

# ++++++++++++++++++
# Zadanie 6
# ++++++++++++++++++


def suma_przemienna(alist: list):
    result = 0
    list_len = len(alist)
    for n in range(list_len):
        if n % 2 == 0:
            result += alist[n]
        else:
            result -= alist[n]
    return result


print(f'Suma przemienna wynosi: {suma_przemienna(list_a)}')

# ++++++++++++++++++
# Zadanie 7
# ++++++++++++++++++

list_b = [2, 3, 7]


def uzupelnij_kolejne(alist: list):
    n = 0
    while len(alist) < 10:
        if not (n in alist):
            alist.append(n)
        n += 1


uzupelnij_kolejne(list_b)
print(list_b)

# ++++++++++++++++++
# Zadanie 8
# ++++++++++++++++++

list_c = []


for i in range(2, 10000):
    list_c.append(i)

print(len(list_c))
for k in range(2, 100):
    i = len(list_c) - 1
    while i > 0:
        if (list_c[i] != k) and (list_c[i] % k) == 0:
            del list_c[i]
        i -= 1

print(list_c)

# ++++++++++++++++++
# Zadanie 9
# ++++++++++++++++++


def list_swap_first_last(alist: list):
    alist[0], alist[-1] = alist[-1], alist[0]


print(list_b)
list_swap_first_last(list_b)
print(f'Zad 9a: {list_b}')


def list_move_right(alist: list):
    last = alist[-1]
    n = len(alist) - 2
    while n >= 0:
        alist[n+1] = alist[n]
        n -= 1
    alist[0] = last


list_move_right(list_b)
print(f'Zad 9b: {list_b}')


def par_zero(alist: list):
    for n in range(len(alist) - 1):
        if alist[n] % 2 == 0:
            alist[n] = 0


par_zero(list_b)
print(f'Zad 9c: {list_b}')


def zastap_suma_sasiadow(alist: list):
    for n in range(1, len(alist) - 2):
        alist[n] = alist[n-1] + alist[n+1]
        # print(f'Zad 9d_{n}: {list_b}')


zastap_suma_sasiadow(list_b)
print(f'Zad 9d: {list_b}')


def usun_srodek(alist: list):
    if (len(alist) % 2) == 0:
        del alist[len(alist) // 2]
        del alist[len(alist) // 2]
    else:
        del alist[len(alist) // 2]


usun_srodek(list_b)
print(f'Zad 9e_1: {list_b}')
list_b.append(9)
usun_srodek(list_b)
print(f'Zad 9e_2: {list_b}')


def par_poczatek(alist: list):
    temp = []
    for x in alist:
        if (x % 2) == 0:
            temp.append(x)
    for x in alist:
        if (x % 2) == 1:
            temp.append(x)
    for n in range(len(alist) - 1):
        alist[n] = temp[n]


par_poczatek(list_b)
print(f'Zad 9f: {list_b}')


def second_biggest(alist: list):
    gmax = alist[0]
    result = alist[0]
    for x in alist:
        if x > gmax:
            gmax = x
    for x in alist:
        if (x > result) and (x < gmax):
            result = x
    return result


print(f'Zad 9g: {second_biggest(list_b)}')


def is_asc(alist):
    for n in range(len(alist) - 1):
        if alist[n+1] < alist[n]:
            return False
    return True


print(f'Zad 9h: {is_asc(list_b)}')


def has_eq_neighbours(alist):
    for n in range(len(alist) - 1):
        if alist[n+1] == alist[n]:
            return True
    return False


print(f'Zad 9i: {has_eq_neighbours(list_b)}')


def has_eq(alist):
    temp = []
    for x in alist:
        if x not in temp:
            temp.append(x)
        else:
            return True
    return False


print(f'Zad 9j_1: {has_eq([3,4,6,4,7,8,6])}')
print(f'Zad 9j_2: {has_eq([1,2,3,4,5])}')


def equals(list1, list2):
    if len(list1) != len(list2):
        return False
    for n in range(len(list1)):
        if list1[n] != list2[n]:
            return False
    return True


print(f'Zad 10_1: {equals([2,3,4], [2,3,4])}')
print(f'Zad 10_2: {equals([0,0,0,9], [0,0,0])}')



