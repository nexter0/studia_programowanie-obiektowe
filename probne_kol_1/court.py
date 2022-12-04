import datetime


class Court:
    __width: float
    __length: float
    __address: str
    __year_built: int

    def __init__(self, width: float = 68, length: float = 150, address: str = "", year_built: int = 0) -> None:
        if width < 45 or width > 90 or length < 90 or length > 120:
            self.__width = 68
            self.__length = 150
        else:
            self.__width = width
            self.__length = length

        self.__address = address
        self.__year_built = year_built

    @property
    def width(self) -> float:
        return self.__width

    @property
    def length(self) -> float:
        return self.__length

    @property
    def address(self) -> str:
        return self.__address

    @property
    def year_built(self) -> int:
        return self.__year_built

    @width.setter
    def width(self, value: float) -> None:
        if value < 45 or value > 90:
            raise ValueError("Width parameter must be in range: [45; 90].")
        self.__width = value

    @length.setter
    def length(self, value: float) -> None:
        if value < 90 or value > 120:
            raise ValueError("Length parameter must be in range: [90; 120].")
        self.__length = value

    @address.setter
    def address(self, address: str) -> None:
        self.__address = address

    @year_built.setter
    def year_built(self, year_built: int) -> None:
        self.__year_built = year_built

    def area(self) -> float:
        return self.__width * self.__length

    @staticmethod
    def validate(court: 'Court') -> None:
        year = int(datetime.date.today().year)
        if court.year_built > year or court.year_built < 0:
            court.year_built = year

    def __str__(self) -> str:
        return f'Boisko wybudowane w roku {self.year_built}, o długości {self.length} metrów ' \
               f'i szerokości {self.width} metrów. \n' \
               f'Pole powierzchni: {self.area()} mkw.\n' \
               f'Adres: {self.address}.'

    def __eq__(self, other: 'Court') -> bool:
        if self.area() == other.area:
            return True
        return False

    def __ne__(self, other: 'Court') -> bool:
        if not self == other:
            return True
        return False

