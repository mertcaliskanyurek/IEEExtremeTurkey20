money = int(input())

count = 0;
banknotes = [100,20,10,5,1]

for banknote in banknotes:
    if money == 0:
        break
    if money/banknote > 0:
        count += int(money/banknote)
        money = money%banknote
    
print(count)