from polynominal import Polynominal

pol_1 = Polynominal([3, 1, 0, 4])
print(pol_1)
pol_2 = Polynominal([5, 2, 5, 3, 6])
print(pol_2)
pol_3 = pol_1 + pol_2
print(f'pol_1 + pol_2: {pol_3}')
pol_4 = pol_3 - pol_1
print(f'pol_3 - pol_1: {pol_4}')

