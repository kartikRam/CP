package Arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class SetMatrixZeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix= {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
		Set<Integer>row=new HashSet<Integer>();
        Set<Integer>column=new HashSet<Integer>();
        for(int i=0; i<matrix.length;i++ ){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]==0){
                    row.add(j);
                    column.add(i);
                }
            }    
	}
       
        for(int  i:row) {
        	for(int k=0;k<3;k++) {
        		matrix[k][i]=0;
        	}
        }
        for(int  i:column) {
        	for(int k=0;k<4;k++) {
        		matrix[i][k]=0;
        	}
        }
        
        for(int i=0;i<3;i++) {
        	for(int j=0;j<4;j++) {
        		
        		System.out.print(matrix[i][j]+" ");
        	}
        	System.out.println();
        }

}
}
