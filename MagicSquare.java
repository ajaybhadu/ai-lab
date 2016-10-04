public class MagicSquare {


public void doublyEven(int[][] magicsqr){
	int N = magicsqr.length;
	
	int miniSqrNum = N/4; //size of boxes
	int cnt = 1; 	      //counter 1 to N*N
	int invCnt = N*N;     //counter N*N to 1
	for(int i=0;i<N;i++){

		for(int j=0;j<N;j++){

		   if(j>=miniSqrNum && j<N-miniSqrNum){
			if(i>=miniSqrNum && i<N-miniSqrNum)
				magicsqr[i][j] = cnt;    //central box
			else 
				magicsqr[i][j] = invCnt; // up & down boxes

		   }
		   else if(i<miniSqrNum || i>=N-miniSqrNum){
			 magicsqr[i][j]=cnt;	         // 4 corners
		   }
		   else
                      magicsqr[i][j] = invCnt;  	// left & right boxes

		   cnt++;
		   invCnt--;
		}

	}
	
}

public void showMagicSqr(int[][] magicsqr){
	int N = magicsqr.length;
	 for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) 
                  System.out.print(magicsqr [i][j] + " ");
            
            System.out.println();
        }
}
public boolean isMagicSqr(int[][] magicsqr){
	int N = magicsqr.length;
	int magicConst = (N*N*N+N)/2;

	int rowsum = 0;
	int colsum = 0;
	int diag1 = 0;
	int diag2 = 0;
	for(int i=0;i<N;i++){
		for(int j=0;j<N;j++){
			rowsum += magicsqr[i][j];
			colsum += magicsqr[j][i];
		}
		diag1 += magicsqr[i][i];
		diag2 += magicsqr[i][N-i-1];
		if(rowsum!=magicConst){ return false; }
		if(colsum!=magicConst){ return false; }
		rowsum=0; colsum=0;
	}
	if(diag1!= magicConst || diag2 != magicConst) 
	return false;

	return true;
}
public static void main(String[] args) { 


        int N = Integer.parseInt(args[0]);
	int[][] matrix = new int[N][N];
        MagicSquare ms = new MagicSquare();

	   if(N<=2) throw new RuntimeException("A size of matrix must be bigger than 2");
        
	   if (N % 2==1) 
	        System.out.println("magicsquar not possible ");  
	   else if(N%4 ==0)
	   {
		ms.doublyEven(matrix);
		ms.showMagicSqr(matrix);
		}	   
           else 
		System.out.println("magicsquar not possible "); 

	
		//ms.showMagicSqr(matrix);
		if(ms.isMagicSqr(matrix)) 
			System.out.println("isMagicSquare? - YES"); 
		else  
			System.out.println("isMagicSquare? - NO"); 

    }
}
