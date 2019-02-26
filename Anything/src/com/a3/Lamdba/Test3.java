package com.a3.Lamdba;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.*;

public class Test3 {
	public static void main(String[] args) {
		List<Map<String,Object>> list=new ArrayList<>();
		for(int i=0;i<5;i++) {
			Map<String,Object>map=new HashMap<>() ;
			map.put("account",	"a"+i);
			map.put("userId", "00"+i);
			list.add(map);
		}
		
		System.out.println(list);
		
		list.stream().collect(l->Collectors.toMap(l.get("account"), l.get("userId")));
	
	}
}
