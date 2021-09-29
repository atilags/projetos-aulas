package set.programa;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

import set.entidades.Turmas;


public class Programa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		String turma1 = "C:\\eclipse-jee-2020-12-R-win32-x86_64\\ws-java\\Projetos_Atila\\src\\Turma 1.txt";
		String turma2 = "C:\\eclipse-jee-2020-12-R-win32-x86_64\\ws-java\\Projetos_Atila\\src\\Turma 2.txt";
		String turma3 = "C:\\eclipse-jee-2020-12-R-win32-x86_64\\ws-java\\Projetos_Atila\\src\\Turma 3.txt";
		
		Set<Turmas> t1 = new HashSet<Turmas>();
		Set<Turmas> t2 = new HashSet<>();
		Set<Turmas> t3 = new HashSet<>();
		
		File caminhoPasta = new File(turma1);

		String caminho = caminhoPasta.getParent();

		new File(caminho + "\\Saida").mkdir(); // Boolean criacao = new File(caminho + "\\Saida").mkdir();

		// TURMA 1
		try (BufferedReader br = new BufferedReader(new FileReader(turma1))) {

			String linha = br.readLine();

			while (linha != null) {

				String[] split = linha.split(", ");
				t1.add(new Turmas(Integer.parseInt(split[0]), split[1]));
				linha = br.readLine();
			}

		} catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		} catch (RuntimeException e) {
			System.out.println("Um erro inesperado ocorreu.");
		}

		// TURMA 2
		try (BufferedReader br = new BufferedReader(new FileReader(turma2))) {

			String linha = br.readLine();

			while (linha != null) {

				String[] split = linha.split(", ");
				t2.add(new Turmas(Integer.parseInt(split[0]), split[1]));
				linha = br.readLine();
			}

		} catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		} catch (RuntimeException e) {
			System.out.println("Um erro inesperado ocorreu.");
		}

		// TURMA 3
		try (BufferedReader br = new BufferedReader(new FileReader(turma3))) {

			String linha = br.readLine();

			while (linha != null) {

				String[] split = linha.split(", ");
				t3.add(new Turmas(Integer.parseInt(split[0]), split[1]));
				linha = br.readLine();
			}

		} catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		} catch (RuntimeException e) {
			System.out.println("Um erro inesperado ocorreu.");
		}

		// CRIAÇÃO ARQUIVO
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(caminho + "\\Saida\\Alunos.txt"))) {

			Set<Turmas> alunos = new HashSet<Turmas>();
			alunos.addAll(t1); // Sem elementos repetidos.
			alunos.addAll(t2);
			alunos.addAll(t3);
			
			int i = 1;
			for(Turmas t: alunos) {
				System.out.println(t);
				System.out.println();
				
				bw.write(t.getId() + ", " + t.getNome());
				
				if(i < alunos.size()) {
					bw.newLine();
					i++;
				}
				
			}
		} catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		} catch (RuntimeException e) {
			System.out.println("Um erro inesperado ocorreu.");
		}

	}
}
