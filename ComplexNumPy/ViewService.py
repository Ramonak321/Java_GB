from numbers import Complex
from Service import Service


class ViewService:

    def sayHi(name):
        print("Hello ", name)

    def insertNum(real, imag):
        if Service.is_number(real) and Service.is_number(imag) :
            return Complex(float(real), float(imag))
        else:
            msg = "Wrong Complex Number"
            print(msg)
            return msg