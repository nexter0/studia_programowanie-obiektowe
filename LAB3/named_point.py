from punkt_alfa import Point


class NamedPoint(Point):

    nazwa: str

    def __init__(self, x: float, y: float, nazwa: str) -> None:
        # Point.__init__(self, x, y)
        super().__init__(x, y)
        self.nazwa = nazwa

    def __str__(self) -> str:
        return f'{self.nazwa}({self.x}, {self.y})'

    def __del__(self) -> None:
        self.nazwa = ""
