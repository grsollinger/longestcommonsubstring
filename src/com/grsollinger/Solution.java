package com.sollinger;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Solution {

	public Map<Integer, String> findCommonSubstring(String str1, String str2) {
		char[] c1 = str1.toCharArray();
		char[] c2 = str2.toCharArray();
		int [] [] resp = new int [c1.length] [c2.length];
		List<String> lista = new ArrayList<>();
		
		int max = 0;
		for (int i = 0; i < c1.length; i++) {
			for (int j = 0; j < c2.length; j++) {
				if (c1[i] == c2[j]) {
					if (i == 0 || j == 0) {
						resp [i] [j] = 1;
						lista.add(Character.toString(c1[i]));
						if (max == 0)
							max = 1;
					} else {
						resp [i] [j] = resp [i-1] [j -1] + 1;
						if (resp [i] [j] > max)
							max = resp [i] [j];
					}
				} 
			}
		}
		System.out.println(max);
		return null;
	}

}
