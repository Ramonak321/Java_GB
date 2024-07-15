from Controller import Controller
from View import View


class ControllerService:

    def getNum():
        num = View.getNum()
        return num

    def symbol(s = Controller.getNum(2)):
        if s == 1:
            return "+"
        elif s == 2:
            return "-"
        else:
            return "*"