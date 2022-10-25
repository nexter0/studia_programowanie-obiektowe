import math


class Rational:
    p: int
    q: int

    def __init__(self, p=0, q=1):
        if q == 0:
            raise ValueError("Disivion by zero.")
        self.p = p
        self.q = q
        if q < 0:
            self.p *= -1
            self.q *= -1
        divisor = math.gcd(self.p, self.q)
        if divisor != 1:
            self.p //= divisor
            self.q //= divisor

    def __repr__(self):
        return f'{self.p}/{self.q}'

    def __float__(self):
        return self.p / self.q

    def reduce(self) -> None:
        divisor = math.gcd(self.p, self.q)
        if divisor != 1:
            self.p //= divisor
            self.q //= divisor

    def __add__(self, x):
        result_p: int = self.p
        result_q: int = self.q
        if self.q == x.q:
            result_p += x.p
            result = Rational(result_p, result_q)
            result.reduce()
            return result
        result_p = result_p * x.q + x.p * self.q
        result_q = result_q * x.q
        result = Rational(result_p, result_q)
        result.reduce()
        return result

    def __sub__(self, x):
        result_p: int = self.p
        result_q: int = self.q
        if self.q == x.q:
            result_p -= x.p
            result = Rational(result_p, result_q)
            result.reduce()
            return result
        result_p = result_p * x.q - x.p * self.q
        result_q = result_q * x.q
        result = Rational(result_p, result_q)
        result.reduce()
        return result

    def __mul__(self, other):
        result_p: int = self.p * other.p
        result_q: int = self.q * other.q
        result = Rational(result_p, result_q)
        result.reduce()
        return result

    def __truediv__(self, other):
        result_p: int = self.p * other.q
        result_q: int = self.q * other.p
        result = Rational(result_p, result_q)
        result.reduce()
        return result

    def __eq__(self, x):
        p1: int = self.p
        q1: int = self.q
        p2: int = x.p
        q2: int = x.q
        if q1 == q2:
            if p1 == p2:
                return True
            else:
                return False
        p1 *= q2
        q1 *= q2
        p2 *= self.q
        q2 *= self.q
        # print(f'{p1}/{q1} ... {p2}/{q2}')
        if p1 == p2:
            return True
        return False

    def __ne__(self, other):
        p1: int = self.p
        q1: int = self.q
        p2: int = other.p
        q2: int = other.q
        if q1 == q2:
            if p1 != p2:
                return True
            else:
                return False
        p1 *= q2
        q1 *= q2
        p2 *= self.q
        q2 *= self.q
        # print(f'{p1}/{q1} ... {p2}/{q2}')
        if p1 != p2:
            return True
        return False

    def __lt__(self, other):
        p1: int = self.p
        q1: int = self.q
        p2: int = other.p
        q2: int = other.q
        if q1 == q2:
            if p1 < p2:
                return True
            else:
                return False
        p1 *= q2
        q1 *= q2
        p2 *= self.q
        q2 *= self.q
        # print(f'{p1}/{q1} ... {p2}/{q2}')
        if p1 < p2:
            return True
        return False

    def __le__(self, other):
        p1: int = self.p
        q1: int = self.q
        p2: int = other.p
        q2: int = other.q
        if q1 == q2:
            if p1 <= p2:
                return True
            else:
                return False
        p1 *= q2
        q1 *= q2
        p2 *= self.q
        q2 *= self.q
        # print(f'{p1}/{q1} ... {p2}/{q2}')
        if p1 <= p2:
            return True
        return False

    def __gt__(self, other):
        p1: int = self.p
        q1: int = self.q
        p2: int = other.p
        q2: int = other.q
        if q1 == q2:
            if p1 > p2:
                return True
            else:
                return False
        p1 *= q2
        q1 *= q2
        p2 *= self.q
        q2 *= self.q
        # print(f'{p1}/{q1} ... {p2}/{q2}')
        if p1 > p2:
            return True
        return False

    def __ge__(self, other):
        p1: int = self.p
        q1: int = self.q
        p2: int = other.p
        q2: int = other.q
        if q1 == q2:
            if p1 >= p2:
                return True
            else:
                return False
        p1 *= q2
        q1 *= q2
        p2 *= self.q
        q2 *= self.q
        # print(f'{p1}/{q1} ... {p2}/{q2}')
        if p1 >= p2:
            return True
        return False

    def get_nominator(self):
        return self.p

    def get_denominator(self):
        return self.q

