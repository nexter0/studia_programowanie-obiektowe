from typing import List, Union


class Polynominal:
    coefficients: List[float]

    def __init__(self, coefficients):
        self.coefficients = coefficients

    def deg(self) -> int:
        if self.coefficients != [] or self.coefficients != [0]:
            return len(self.coefficients) - 1
        else:
            raise ValueError("Degree of zero polynominal is not defined.")

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

    def normalize_poly_len(self, other_poly) -> tuple['Polynominal', 'Polynominal']:
        difference = self.deg() - other_poly.deg()
        if difference == 0:
            print("0")
            return self, other_poly
        if difference < 0:
            print("g0")
            new = self
            for i in range(abs(difference)):
                new.coefficients.append(0)
            return new, other_poly
        else:
            print("l0")
            new = other_poly
            for i in range(difference):
                new.coefficients.append(0)
            return self, new

    def __neg__(self):
        new = self
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
        pol = self.normalize_poly_len(other_poly)
        pol1 = pol[0]
        print(pol1.coefficients)
        pol2 = pol[1]
        print(pol2.coefficients)
        for i in range(len(pol1.coefficients)):
            pol1.coefficients[i] -= pol2.coefficients[i]
        return pol1
