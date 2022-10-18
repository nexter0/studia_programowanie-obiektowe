from punkt_alfa import Point
from named_point import NamedPoint
from adres import Address
from soda import SodaCan
from car import Car
from student import Student


def main():
    a = Point(3, 4)
    b = NamedPoint(6, 4, "P")
    print(f"Odległość pomiędzy {a} i {b} wynosi {Point.distance(a, b)}")

    ad1 = Address('12-345', 'Miasto', 'Ulica', 3, 4)
    ad2 = Address('12-596', 'Miasto2', 'Ulica2', 6)
    ad1.show()
    ad2.show()
    print(ad1.comes_before(ad2))
    print(ad2.comes_before(ad1))

    cola = SodaCan(14.5, 6.5)
    print(cola.get_surface_area())
    print(cola.get_volume())

    my_car = Car(20, 40)
    my_car.add_fuel(30)
    my_car.drive(100)
    print(my_car.get_fuel_level())

    adam = Student("Adam", "Adamowicz")
    print(adam.get_name())
    adam.add_quiz(3)
    adam.add_quiz(7)
    adam.add_quiz(12)
    adam.add_quiz(5)
    print(adam.get_total_score())
    print(adam.get_average_score())

if __name__ == "__main__":
    main()
