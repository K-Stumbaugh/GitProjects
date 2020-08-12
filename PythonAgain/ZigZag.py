import time, sys
indent = 0 # how many sapces to indent
indentIncreasing = True # whether the indentation is increasing or not

try:
    while True: #the main program loop
        print(" " * indent, end = '')
        print('********')
        time.sleep(0.1)#pause for 1/10 a second

        if indentIncreasing:
        #Increase number of spaceds by 1
            indent = indent + 1
            if indent == 20:
                #Change Direction
                indentIncreasing = False

        else:
            indent = indent - 1
            if indent == 0:
                indentIncreasing = True

except KeyboardInterrupt:
    sys.exit()
