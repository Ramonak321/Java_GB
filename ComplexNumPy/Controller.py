from ControllerService import ControllerService as cs
from View import View
from Logger import Logger
from Func import Func

class Controller:

    def getNum():
        first = cs.getNum()
        second = cs.getNum()
        selfFunc = View.getFunc()
        Logger.Write("first num = " + first + "function: " + cs.symbol(selfFunc) + " second num = " + second)
        return first, second, selfFunc
    
    def getLog():
        Logger.Read()
    
    Logger.Write(View.getUser())
    result = Func.result(getNum())
    Logger.Write("result = " + result)
    

    


