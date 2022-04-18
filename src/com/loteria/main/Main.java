package com.loteria.main;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
	
	public void jogar(int numJogos, String path, int num, int total) throws IOException {
		FileWriter write = new FileWriter(path + "Jogo Gerado.txt");
		
		for (int a = 0; a < numJogos; a++) {
			Integer[] numeros = new Integer[total];
			
			for (Integer i = 0; i < total; i++) {
				numeros[i] = i + 1;
			}
			
			List<Integer> numList = Arrays.asList(numeros);
			
			Collections.shuffle(numList);
			
			List<Integer> jogo = new ArrayList<Integer>();
			
			for (int i = 0; i < num; i++)
				jogo.add(numList.get(i));
			
			Collections.sort(jogo);

			write.write(jogo.toString() + "\n");

		}
			write.close();
	}
	
//	@Deprecated
//	public void jogar2(int numJogos) {
//		Set<Integer> jogo = new LinkedHashSet<Integer>();
//		Random rdm = new Random();
//		
//		int count = 0;
//		
//		while (count < 15) {
//			int num = rdm.nextInt(26 - 1) + 1;
//			
//			jogo.add(num);
//			
//			count++;
//		}
//		
//		count = 0;
//		
//		List<Integer> sort = jogo.stream().collect(Collectors.toList());
//		
//		Collections.sort(sort);
//		
//		System.out.println(sort);
//		System.out.println(sort.size());
//	}
//	
//	@Deprecated
//	public void jogar(int qtdJogos, String path, int h) {
//		Set<Integer> jogo = new LinkedHashSet<Integer>();
//		Random rdm = new Random();				
//		
//		for (int a = 0; a < qtdJogos; a++) {
//			for (int b = 0; b < 25; b++) {
//				Integer nGerado = rdm.nextInt(26 - 1) + 1;
//				
//				jogo.add(nGerado);
//			}
//			
//			List<Integer> sort = jogo.stream().collect(Collectors.toList());
//			
//			Collections.sort(sort);
//			
//			//list.add(sort);
//			System.out.println(sort);
//			
//			for (int i = 0; i < 25; i++) {
//				/*try {
//					BufferedWriter write = new BufferedWriter(new FileWriter(path));
//					
//					write.write(sort.toString());
//					
//					write.flush();
//				} catch (IOException e) {
//					e.printStackTrace();
//				}*/
//			}
//			
//			jogo.clear();
//			sort.clear();
//		}}
}
