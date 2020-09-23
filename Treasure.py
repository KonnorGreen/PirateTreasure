
n = int(input("Enter number of pirates: ")) 
temp = n
total_sums = [0]*n # creates a list of zeros of size n


t = [] 
order_taken = []  
numOfElm = int(input("Enter Treasure length: ")) 
print("Enter Treasure values: ")
for i in range(numOfElm):
    elm = int(input())
    t.append(elm)

for i in range(numOfElm):
    if (n == temp):
        n = 0
    if (t[0] > t[len(t)-1]):
        order_taken.append(t[0])
        t.pop(0)

    elif (t[0] < t[len(t)-1]):
        order_taken.append(t[len(t)-1])
        t.pop(len(t)-1)


    elif (t[0] == t[len(t)-1]):
        order_taken.append(t[len(t)-1])
        t.pop(len(t)-1)
    
    total_sums[n] += order_taken[i]
    n = n + 1
print(" ".join(map(str,total_sums))) # removes the commas and brackets from list 