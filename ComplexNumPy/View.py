from Controller import Controller
from ViewService import ViewService

class View:
    
    def getUser():
        userName = input("Pls insert your name: ")
        ViewService.sayHi(userName)
        return userName
    
    def getNum():
        real = input("Insert REAL Number: ")
        imag = input("Insert REAL Number: ")
        a = ViewService.insertNum(real, imag)
        return a
    
    def getFunc():
        s = int(input("Select Function: \n 1)ADD\n 2)subtract\n 3)multiplication\n Insert: "))
        return s
    
    def getRepeat():
        Controller.getNum()

    def getResult(result):
        print("Result is " + result)
        ans = int(input("Insert number: \n 1)Repeat\n 2)View Log\n 3)Exit"))
        if ans == 1:
            return View.getRepeat()
        elif ans == 2:
            Controller.getLog()
            return View.getRepeat()
        elif ans == 3:
            pass


