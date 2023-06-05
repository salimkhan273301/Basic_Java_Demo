package com.filehandling.filehandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FilehandlingGoodQuestion {

	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\ulla ulla\\Documents\\StringNote.txt");
		Map<String, Integer> map = new HashMap<>();
		BufferedReader br = new BufferedReader(new FileReader(file));

		String s = null;

		while ((s = br.readLine()) != null) {

			String str[] = s.split("\\s");
			for (String w : str) {
				if (!w.isBlank()) {
					if (map.containsKey(w))
						map.put(w, map.get(w) + 1);
					else
						map.put(w, 1);
				}
			}
		}
		map.forEach((k, v) -> {
			System.out.println(k + ":" + v);
		});
	}

}
