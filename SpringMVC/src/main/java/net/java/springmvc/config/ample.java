package net.java.springmvc.config;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import org.hibernate.loader.custom.Return;

import com.mysql.fabric.xmlrpc.base.Array;

public class ample {
	
	public static void main(String arrgs[]) {
		data(8);
	
	
	}
	
	public static void data(int value) {
		
		for(int i=0;i<value;i++) {
			for(int j=value-i;j>1;j--) {
				System.out.print(" ");
			}
			for(int k=0;k<i;k++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
		
		
	}

}
