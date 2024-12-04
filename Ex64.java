package bookExercises;

import javax.swing.JOptionPane;

public class Ex64 {

	public static void main(String[] args) {

		String userAnswer;

		int sum = 0, arithmeticMean, lines = 8, columns = 4, discrepancy, squared;

		int[][] basketball = new int[lines][columns];

		do {

			for (int i = 0; i < lines; i++) {

				for (int j = 0; j <= 0; j++) {

					basketball[i][j] = (i + 1);

				}
			}

			for (int i = 0; i < lines; i++) {

				for (int j = 1; j < 2; j++) {

					basketball[i][j] = Integer
							.parseInt(JOptionPane.showInputDialog(null, "Insert the converted shots"));

					sum += basketball[i][j];
				}

			}

			arithmeticMean = sum / lines;

			JOptionPane.showMessageDialog(null, "Arithmetic Mean: " + arithmeticMean);

			for (int i = 0; i < lines; i++) {

				for (int j = 2; j < 3; j++) {

					if (arithmeticMean > basketball[i][j - 1]) {

						discrepancy = arithmeticMean - basketball[i][j - 1];
					}

					else {

						discrepancy = basketball[i][j - 1] - arithmeticMean;

					}

					basketball[i][2] = discrepancy;

				}
			}

			for (int i = 0; i < lines; i++) {

				for (int j = 3; j < 4; j++) {

					squared = basketball[i][j - 1] * basketball[i][j - 1];

					basketball[i][3] = squared;

					System.out.println("Player ID: " + basketball[i][0] + " |  ConvertedShots: " + basketball[i][1]
							+ " |  Discrepancy: " + basketball[i][2] + " |  Squared: " + basketball[i][3]);

				}

			}
			userAnswer = JOptionPane.showInputDialog(null, "Do You Want To Continue: (yes/no)");

			userAnswer = userAnswer.trim();

		} while (userAnswer.equalsIgnoreCase("yes"));

		JOptionPane.showMessageDialog(null, "END OF APPLICATION!!");

	}

}
