package filetasks.task03;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadMatrix {
	
	public static void doWork() {
		int[][] matrix = getMatrix("matrix.txt");
		if (matrix == null) {
			return;
		}
		
		int largestSum = ReadMatrix.findLargestSum(matrix);
	
		ReadMatrix.writeLargestSum("matrix-sum.txt", largestSum);
	}

	private static void writeLargestSum(String filename, int largestSum) {		
		FileWriter writer = null;
				
		try {
			writer = new FileWriter(filename);
			writer.write(Integer.toString(largestSum));
		}
		catch (IOException e) {
			System.out.println(e.getMessage());
			return;
		}
		finally {
			try {
				if (writer != null) {
					writer.close();
				}
			} catch (IOException e) {
				System.out.println(e.getMessage());
				return;
			}
		}
	}

	private static int findLargestSum(int[][] matrix) {
		int largestSum = 0;
		
		for (int i = 0; i < matrix.length - 1; i++) {
			for (int j = 0; j < matrix[i].length - 1; j++) {
				int sum = matrix[i][j] + matrix[i+1][j] + matrix[i][j+1] + matrix[i+1][j+1];
				if (sum > largestSum) {
					largestSum = sum;
				}
			}
		}
		
		return largestSum;
	}

	private static int[][] getMatrix(String filename) {
		
		int[][] matrix = null;
		FileReader fr = null;
		BufferedReader bf = null;
		
		try {
			fr = new FileReader(filename);
			bf = new BufferedReader(fr);
			int matrixSize = Integer.parseInt(bf.readLine());
			matrix = new int[matrixSize][matrixSize];
			String c;
			int i = 0;
			while ((c = bf.readLine()) != null) {				
				String[] nums = c.split(" ");
				
				for (int j = 0; j < nums.length; j++) {
					matrix[i][j] = Integer.parseInt(nums[j]);
				}
				
				i++;
			}			
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			return matrix;
		} catch (NumberFormatException e) {
			System.out.println(e.getMessage());
			return matrix;
		} catch (IOException e) {
			System.out.println(e.getMessage());
			return matrix;
		}
		finally {
			try {
				if (bf != null) {
					bf.close();
				}
			} catch (IOException e) {
				System.out.println(e.getMessage());
				return matrix;
			}
		}
		
		return matrix;
	}
}