import math


class SodaCan:
    height: float
    radius: float

    def __init__(self, height, radius):
        self.height = height
        self.radius = radius

    def get_surface_area(self) -> float:
        return self.radius * self.height + 2 * math.pi * self.radius ** 2

    def get_volume(self) -> float:
        return math.pi * self.radius * self.height
