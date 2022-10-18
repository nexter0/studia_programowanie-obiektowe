from __future__ import annotations
import math


class Point(object):
    x: float
    y: float

    def __init__(self, x: float, y: float) -> None:
        self.x = x
        self.y = y

    def __str__(self) -> str:
        return f'<{self.x}, {self.y}>'

    def move(self, delta_x: float, delta_y: float) -> None:
        self.x += delta_x
        self.y += delta_y

    @staticmethod
    def distance(a: Point, b: Point) -> float:
        return math.sqrt((a.x - b.x) ** 2 - (a.y - b.y) ** 2)
