from vehicle import *


class Car(Vehicle):
    __price: float
    __colour: str
    __extra_seats: int

    def __init__(self, reg: str = None, model: int = 0, prod_year: int = 2022, price: float = 0, colour: str = None,
                 extra_seats: int = 0) -> None:

        super().__init__(reg, model, prod_year)

        if price < 0:
            self.__price = 0
        else:
            self.__price = price

        if extra_seats < 0:
            self.__extra_seats = 0
        else:
            self.__extra_seats = extra_seats

        self.__colour = colour

    @property
    def price(self) -> float:
        return self.__price

    @property
    def colour(self) -> str:
        return self.__colour

    @property
    def extra_seats(self) -> int:
        return self.__extra_seats

    @price.setter
    def price(self, price: float) -> None:
        if price < 0:
            print("Invalid value. Price cannot be lower than 0.")
        else:
            self.__price = price

    @colour.setter
    def colour(self, colour: str) -> None:
        self.__colour = colour

    @extra_seats.setter
    def extra_seats(self, extra_seats: int) -> None:
        if extra_seats < 0:
            print("Invalid value. Number of extra seats cannot be lower than 0.")
        else:
            self.__extra_seats = extra_seats

    def drive(self) -> str:
        return f'Jadę świetnym pojazdem z roku {self.prod_year}! Ma kolor {self.colour}.'

    def __eq__(self, other: 'Car') -> bool:
        if self.model == other.model and self.price == other.price:
            return True
        return False

    def __ne__(self, other: 'Car') -> bool:
        if not self == other:
            return True
        return False

    def __str__(self) -> str:
        string = ''
        string += f'Pojazd wyprodukowany w roku: {self.prod_year}.\n' \
                  f'Model: {self.model}.\n'

        if self.reg is not None:
            string += f'Rejestracja: {self.reg}.\n'

        string += f'Cena: {self.price}.\n'

        if self.colour is not None:
            string += f'Kolor: {self.colour}.\n'

        string += f'Dodatkowe siedzenia: {self.extra_seats}.'

        return string
