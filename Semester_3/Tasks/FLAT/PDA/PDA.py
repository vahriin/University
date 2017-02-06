def error (x,y) :
    if y != '(' and y != ')' and y != '0' and y != '1' and y != '*':
        print ("Недопустимый символ", y)
    elif x == 0 and y == '(':
        print ("Ожидался символ (")
    elif x == 1 and y == ')' :
        print ("Количество единиц не удовлетворяет условию. Ожидался символ 1")
    elif x == 1 :
        print ("Ожидался символ )")
    elif x == 4 and y == '1':
        print ("Количество единиц не удовлетворяет условию! Ожидался конец строки.")
    elif x == 4 and y == '1':
        print ("Количество единиц не удовлетворяет условию! Ожидался символ 1")
    elif x == 5 and y == '*':
        print ("Количество единиц не удовлетворяет условию! Ожидался символ 1")
    elif x == 4 and y != '*' :
        print ("Ожидался конец строки")
    elif x == 5 and y != '*':
        print ("Ожидался конец строки")


stack = []
step = 0 #состояние
iterator = 0

string = input('Введите строку: ')
string += '*'; #маркер конца строки

for symbol in string:
    iterator += 1 #для обозначения места первого несоответствия
    if step == 0 and symbol == '(' and len(stack) == 0 :
        step = 0
        stack.append(symbol)
    
    elif step == 0 and symbol == '0' and len(stack) != 0 and stack[len(stack) - 1] == '(':
        step = 0
        stack.append(symbol)
        stack.append(symbol)
    
    elif step == 0 and symbol == ')' and len(stack) != 0 and stack[len(stack) - 1] == '(':
        step = 4
        stack.pop()
        
    elif step == 0 and symbol == '0' and len(stack) != 0 and stack[len(stack) - 1] == '0':
        step = 0
        stack.append(symbol)
        stack.append(symbol)
        
    elif step == 0 and symbol == '1' and len(stack) != 0 and stack[len(stack) - 1] == '0':
        step = 1
        stack.pop()
        
    elif step == 1 and symbol == '1' and len(stack) != 0 and stack[len(stack) - 1] == '0':
        step = 1
        stack.pop()
        
    elif step == 1 and symbol == ')' and len(stack) != 0 and stack[len(stack) - 1] == '(' :
        step = 4
        stack.pop()
        
    elif step == 4 and symbol == '*' and len(stack) == 0 :
        step = 3
        print('Входная цепочка принадлежит данному языку.')
        
    elif step == 4 and symbol == '0' and len(stack) == 0 :
        step = 4
        stack.append(symbol)
         
    elif step == 4 and symbol == '0' and len(stack) != 0 and stack[len(stack) - 1] == '0' :
        step = 4
        stack.append(symbol)
        
    elif step == 4 and symbol == '1' and len(stack) > 1 and stack[len(stack) - 1] == '0' :
        step = 5
        stack.pop()
        stack.pop()
        
    elif step == 5 and symbol == '1' and len(stack) > 1 and stack[len(stack) - 1] == '0' :
        step = 5
        stack.pop()
        stack.pop()
        
    elif step == 5 and symbol == '*' and len(stack) == 0 :
        step = 3
        print('Входная цепочка принадлежит данному языку.')
        
    else :
        print('Входная цепочка не принадлежит данному языку.')
        print('Первое несоответствие цепочки языку имеет позицию ', iterator)
        print('Это символ', symbol)
        error(step, symbol)
        break;
