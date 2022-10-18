class Student:
    name: str
    surname: str
    score: int
    quiz_num: int

    def __init__(self, name, surname):
        self.name = name
        self.surname = surname
        self.score = 0
        self.quiz_num = 0

    def get_name(self) -> tuple[str, str]:
        return self.name, self.surname

    def get_total_score(self) -> int:
        return self.score

    def add_quiz(self, score):
        self.score += score
        self.quiz_num += 1

    def get_average_score(self) -> float:
        return self.score / self.quiz_num
