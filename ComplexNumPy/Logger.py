from datetime import datetime as dt
log = open('log.txt', 'a+')

time = dt.now().strftime('%d/%m/%Y %H:%M')

class Logger():

    def Write(message):
        log.write(f"{time} {message}\n")

    def Read():
        print ([l for l in log])