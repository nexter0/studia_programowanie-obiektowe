from court import *


class Staduim(Court):
    __name: str
    __common_name: str  # optional
    __capacity: int = 0

    def __init__(self, width: float = 68, length: float = 150, address: str = "", year_built: int = 0,
                 name: str = "", capacity: int = 0, common_name: str = "") -> None:
        super().__init__(width, length, address, year_built)
        self.__name = name
        self.__common_name = common_name
        if capacity < 0:
            self.capacity = 0
        else:
            self.__capacity = capacity

    @property
    def name(self) -> str:
        return self.__name

    @property
    def common_name(self) -> str:
        return self.__common_name

    @property
    def capacity(self) -> int:
        return self.__capacity

    @name.setter
    def name(self, name: str) -> None:
        self.__name = name

    @common_name.setter
    def common_name(self, common_name: str) -> None:
        self.__common_name = common_name

    @capacity.setter
    def capacity(self, value: int) -> None:
        if value < 0:
            raise ValueError("Capacity parameter must be non-negative integer.")
        self.__capacity = value

    def __eq__(self, other: 'Staduim') -> bool:
        if self.area() == other.area and self.capacity == other.capacity:
            return True
        return False

    def __ne__(self, other: 'Staduim') -> bool:
        if not self == other:
            return True
        return False

    def __str__(self) -> str:
        if self.common_name != "":
            return f'Boisko wybudowane w roku {self.year_built}, o długości {self.length} metrów ' \
                f'i szerokości {self.width} metrów. \n' \
                f'Pole powierzchni: {self.area()} mkw.\n' \
                f'Adres: {self.address}.\n' \
                f'Nazwa: {self.name}.\n' \
                f'Nazwa zwyczajowa: {self.common_name}.\n' \
                f'Pojemność stadionu: {self.capacity} osób.'
        else:
            return f'Boisko wybudowane w roku {self.year_built}, o długości {self.length} metrów ' \
                   f'i szerokości {self.width} metrów. \n' \
                   f'Pole powierzchni: {self.area()} mkw.\n' \
                   f'Adres: {self.address}.\n' \
                   f'Nazwa: {self.name}.\n' \
                   f'Pojemność stadionu: {self.capacity} osób.'

