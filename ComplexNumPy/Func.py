class Func:

    def result(first, second, action):
        if action == 1:
            return complex(first) + complex(second)
        elif action == 2:
            return complex(first) - complex(second)
        elif action == 3:
            return complex(first) * complex(second)