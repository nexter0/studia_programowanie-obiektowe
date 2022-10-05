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
while i < 10 :
        list_f.append(i % 5)
        i += 1

print(list_f)

# ++++++++++++++++++
# Zadanie 3
# ++++++++++++++++++


def ile_ujemnych(alist):
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


def iloczyn(alist):
    result = 1
    for x in alist:
        result *= x
    return result

print(f'Iloczyn liczb wynosi: {iloczyn(list_a)}')

# ++++++++++++++++++
# Zadanie 5
# ++++++++++++++++++


def minmax(alist):
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


def suma_przemienna(alist):
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


def uzupelnij_kolejne(alist):
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


def list_swap_first_last(alist):
    alist[0], alist[-1] = alist[-1], alist[0]


print(list_b)
list_swap_first_last(list_b)
print(f'Zad 9a: {list_b}')


def list_move_right(alist):
    last = alist[-1]
    n = len(alist) - 2
    while n >= 0:
        alist[n+1] = alist[n]
        n -= 1
    alist[0] = last


list_move_right(list_b)
print(f'Zad 9b: {list_b}')


def par_zero(alist):
    for n in range(len(alist) - 1):
        if alist[n] % 2 == 0:
            alist[n] = 0


par_zero(list_b)
print(f'Zad 9c: {list_b}')


def zastap_suma_sasiadow(alist):
    for n in range(1, len(alist) - 2):
        alist[n] = alist[n-1] + alist[n+1]
        # print(f'Zad 9d_{n}: {list_b}')


zastap_suma_sasiadow(list_b)
print(f'Zad 9d: {list_b}')


def usun_srodek(alist):
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


def par_poczatek(alist):
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