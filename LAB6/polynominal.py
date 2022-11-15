from typing import List


class Polynomial:
    coefficients: List[float]

    def __init__(self, coefficients):
        self.coefficients = coefficients

    def deg(self) -> int:
        if self.coefficients != [] or self.coefficients != [0]:
            return len(self.coefficients) - 1
        else:
            raise ValueError("Degree of zero polynomial is not defined.")

    def copy(self):
        new_coefficients = []
        for x in self.coefficients:
            new_coefficients.append(x)
        return Polynomial(new_coefficients)

    def __str__(self) -> str:
        result = ""
        power = 0
        for n in self.coefficients:
            if power == 0:
                result = f"{n}"
            elif power == 1:
                if n >= 0:
                    result = f'{n} * x + {result} '
                else:
                    result = f'({n}) * x + {result} '
            else:
                if n >= 0:
                    result = f'{n} * x^{power} + {result}'
                else:
                    result = f'({n}) * x^{power} + {result}'
            power += 1
        return result

    def normalize_poly_len(self, other_poly) -> tuple['Polynomial', 'Polynomial']:
        difference = self.deg() - other_poly.deg()
        if difference == 0:
            print("0")
            return self.copy(), other_poly
        if difference < 0:
            print("g0")
            new = self.copy()
            for i in range(abs(difference)):
                new.coefficients.append(0)
            return new.copy(), other_poly
        else:
            print("l0")
            new = other_poly.copy()
            for i in range(difference):
                new.coefficients.append(0)
            return self.copy(), new

    def __neg__(self):
        new = self.copy()
        for i in range(0, len(new.coefficients)):
            new.coefficients[i] *= -1
        return new

    def __add__(self, other_poly):
        pol = self.normalize_poly_len(other_poly)
        pol1 = pol[0]
        print(pol1.coefficients)
        pol2 = pol[1]
        print(pol2.coefficients)
        for i in range(0, len(pol1.coefficients)):
            pol1.coefficients[i] += pol2.coefficients[i]
        return pol1

    def __sub__(self, other_poly):
        return self + -other_poly
