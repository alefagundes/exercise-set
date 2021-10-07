package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.Access;

public class Program {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String path = "D:\\temp\\teste.txt";
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			Set<Access> set = new HashSet<>();
			String line = br.readLine();
			while(line!=null) {
				String[] filds = line.split(" ");
				String name = filds[0];
				Date instante = Date.from(Instant.parse(filds[1]));
				set.add(new Access(name, instante));
				line = br.readLine();
			}
			System.out.println("Total Users: " + set.size());
			
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
