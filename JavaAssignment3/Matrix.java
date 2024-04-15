package java_assignment_3;

public class Matrix {
	    private int rows;
	    private int columns;
	    private int[][] elements;

	 
	    public Matrix(int rows, int columns) {
	        this.rows = rows;
	        this.columns = columns;
	        this.elements = new int[rows][columns];
	    }

	    
	    public int getRows() {
	        return rows;
	    }

	  
	    public int getColumns() {
	        return columns;
	    }

	    
	    public void setElement(int i, int j, int value) {
	        if (i >= 0 && i < rows && j >= 0 && j < columns) {
	            elements[i][j] = value;
	        } else {
	            System.out.println("Invalid position");
	        }
	    }

	   
	    public static Matrix add(Matrix matrix1, Matrix matrix2) {
	        if (matrix1.rows != matrix2.rows || matrix1.columns != matrix2.columns) {
	            System.out.println("Matrices cannot be added");
	            return null;
	        }

	        Matrix result = new Matrix(matrix1.rows, matrix1.columns);

	        for (int i = 0; i < matrix1.rows; i++) {
	            for (int j = 0; j < matrix1.columns; j++) {
	                result.elements[i][j] = matrix1.elements[i][j] + matrix2.elements[i][j];
	            }
	        }

	        return result;
	    }

	    public static void main(String[] args) {
	      
	        Matrix matrix1 = new Matrix(2, 2);
	        matrix1.setElement(0, 0, 1);
	        matrix1.setElement(0, 1, 2);
	        matrix1.setElement(1, 0, 3);
	        matrix1.setElement(1, 1, 4);

	        Matrix matrix2 = new Matrix(2, 2);
	        matrix2.setElement(0, 0, 5);
	        matrix2.setElement(0, 1, 6);
	        matrix2.setElement(1, 0, 7);
	        matrix2.setElement(1, 1, 8);

	        Matrix sum = Matrix.add(matrix1, matrix2);

	        if (sum != null) {
	            System.out.println("Resultant matrix after addition:");
	            for (int i = 0; i < sum.getRows(); i++) {
	                for (int j = 0; j < sum.getColumns(); j++) {
	                    System.out.print(sum.elements[i][j] + " ");
	                }
	                System.out.println();
	            }
	        }
	    }
	}


