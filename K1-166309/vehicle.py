class Vehicle:
    __reg: str
    __model: int
    __prod_year: int

    def __init__(self, reg: str = None, model: int = 0, prod_year: int = 2022) -> None:
        if model < 0:
            self.__model = 0
        else:
            self.__model = model

        if prod_year < 1900 or prod_year > 2022:
            self.__prod_year = 2022
        else:
            self.__prod_year = prod_year

        self.__reg = reg

    @property
    def reg(self) -> str:
        return self.__reg

    @property
    def model(self) -> int:
        return self.__model

    @property
    def prod_year(self) -> int:
        return self.__prod_year

    @reg.setter
    def reg(self, reg: str) -> None:
        self.__reg = reg

    @model.setter
    def model(self, model: int) -> None:
        if model < 0:
            print("Invalid value. Model cannot be lower than 0.")
        else:
            self.__model = model

    @prod_year.setter
    def prod_year(self, prod_year: int) -> None:
        if prod_year < 1900 or prod_year > 2022:
            print("Invalid value. Production year must be in range [1900; 2022].")
        else:
            self.__prod_year = prod_year

    def brake(self) -> str:  # W poleceniu nie było powiedziane, czy metoda ma być statyczna
        return 'Zatrzymuję się'

    def drive(self) -> str:
        return f'Jadę świetnym pojazdem z roku {self.prod_year}!'

    def __str__(self) -> str:
        if self.reg is None:
            return f'Pojazd wyprodukowany w roku: {self.prod_year}.\n' \
                f'Model: {self.model}.'
        return f'Pojazd wyprodukowany w roku: {self.prod_year}.\n' \
            f'Model: {self.model}.\n' \
            f'Rejestracja: {self.reg}.'

    def __eq__(self, other: 'Vehicle') -> bool:
        if self.model == other.__model and self.__prod_year == other.__prod_year:
            return True
        return False

    def __ne__(self, other: 'Vehicle') -> bool:
        if not self == other:
            return True
        return False
