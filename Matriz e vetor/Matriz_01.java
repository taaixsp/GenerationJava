package br.com.generation;

public class Matriz_01 {

	public static void main(String[] args) {
					
				double[][] notasAlunos = new double[3][4];
				
				notasAlunos[0][0] = 9.8;
				notasAlunos[0][1] = 7.9;
				notasAlunos[0][2] = 6.5;
				notasAlunos[0][3] = 8.5;
				
				notasAlunos[1][0] = 9.9;
				notasAlunos[1][1] = 9.7;
				notasAlunos[1][2] = 5.6;
				notasAlunos[1][3] = 5.8;
				
				notasAlunos[2][0] = 9.9;
				notasAlunos[2][1] = 9.7;
				notasAlunos[2][2] = 5.6;
				notasAlunos[2][3] = 5.8;
				
				
				
				for(int linha = 0; linha < notasAlunos.length; linha++) {
													
					for(int coluna = 0; coluna < notasAlunos[linha].length; coluna++) {
						System.out.print(notasAlunos[linha][coluna] + " | ");
					}
					System.out.println();
				}
				
			}

		}