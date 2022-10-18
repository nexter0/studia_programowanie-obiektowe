class Address:
    house_num: int
    street_name: str
    flat_num: int
    city: str
    post_code: str

    def __init__(self, post_code, city, street_name, house_num, flat_num=None):
        self.post_code = post_code
        self.city = city
        self.street_name = street_name
        self.house_num = house_num
        self.flat_num = flat_num

    def show(self) -> None:
        if self.flat_num is not None:
            print(f'{self.street_name}, {self.house_num} {self.flat_num}')
            print(f'{self.post_code}, {self.city}')
        else:
            print(f'{self.street_name}, {self.house_num}')
            print(f'{self.post_code}, {self.city}')

    def comes_before(self, other) -> bool:
        for i in range(len(self.post_code)):
            if not self.post_code[i].isdigit():
                continue
            if int(self.post_code[i]) == int(other.post_code[i]):
                continue
            if int(self.post_code[i]) > int(other.post_code[i]):
                return False
        return True
