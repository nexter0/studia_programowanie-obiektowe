from stadium import *


def main():
    court_1 = Court(68, 150, "Słoneczna 10, 10-100 Olsztyn", 1999)
    print(court_1)
    print("==========================")
    court_2 = Court(500, 500, "Słoneczna 10, 10-100 Olsztyn", 1999)
    print(court_2)
    print("==========================")
    court_3 = Court(50, 100, "Słoneczna 10, 10-100 Olsztyn", 1999)
    print(court_3)
    print("==========================")
    print(court_1.length)
    print("==========================")
    court_1.year_built = 1990
    print(court_1)
    print("==========================")
    print(court_1.area())
    print("==========================")
    court_1.year_built = 2030
    print(court_1)
    print("==========================")
    Court.validate(court_1)
    print(court_1)
    print("==========================")
    stadium_1 = Staduim(68, 150, "Słoneczna 10, 10-100 Olsztyn", 1999, "Słoneczny stadion", 10000, "Słoneczko")
    print(stadium_1)
    print("==========================")
    stadium_2 = Staduim(68, 150, "Słoneczna 10, 10-100 Olsztyn", 1999, "Słoneczny stadion", 10000)
    print(stadium_2)
    print("==========================")
    stadium_1.year_built = 2030
    print(stadium_1)
    print("==========================")
    Staduim.validate(stadium_1)
    print(stadium_1)
    print("==========================")
    print(stadium_1 == stadium_2)
    print("==========================")
    print(stadium_1 != stadium_2)
    print("==========================")
    stadium_1.capacity = 500
    print(stadium_1 == stadium_2)
if __name__ == "__main__":
    main()
