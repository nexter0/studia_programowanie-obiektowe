class Car:
    fuel_efficiency: float
    fuel_tank_volume: float
    fuel_level: float

    def __init__(self, fuel_efficiency, fuel_tank_volume):
        self.fuel_efficiency = fuel_efficiency
        self.fuel_tank_volume = fuel_tank_volume
        self.fuel_level = 0

    def add_fuel(self, fuel) -> None:
        if self.fuel_level + fuel > self.fuel_tank_volume:
            self.fuel_level = self.fuel_tank_volume
        else:
            self.fuel_level += fuel

    def get_fuel_level(self):
        return self.fuel_level

    def drive(self, metres):
        self.fuel_level -= (metres / 1000) / self.fuel_efficiency

