package sec_verify05;

import java.util.ArrayList;

public class FruitBasket {

	
	static ArrayList<Fruit<String,Integer>> fruitArr = new ArrayList<>();
	
	public static<K, V> Fruit<K, V> basketing(K k, V v){
		Fruit<K, V> f= new Fruit<>(k,v);
		if(fruitArr.isEmpty())
			System.out.println("과일이 담겼네요");
		else
			System.out.println("또 과일이 담겼네요");
		fruitArr.add((Fruit<String, Integer>) f);
		return f;
	}
}
