#Magic Square
def MagicSquare():
    N = input("Enter the order of the Magic Square (odd):")
    MS=[[ 0 for row in range(N+1)]for col in range(N+1)]
    row = 1
    col = (N+1)/2
    for i in range(N*N):
         MS[row][col] =i+1
         row -=1
         col +=1
         trow = row
         tcol = col
         if row<=0: 
            row = N
         if col>N: 
            col = 1
         if MS[row][col] != 0: 
            if row == N:
                row = 0            
            if col == 1:
                col = N+1   
            row +=1
            col -=1
            row +=1   
         if row<=0: 
            row = N
         if col>N: 
            col = 1
    print "OUTPUT~~ MAGIC SQUARE:"
    for i in range (N):
        for j in range (N):
            print MS[i+1][j+1],'\t',
        print
MagicSquare()          


