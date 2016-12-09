import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<>();
		System.out.print("随机生成50个小于100的数，分别为：");
		for(int i=0;i<50;i++){
			list.add(Integer.valueOf((int)(Math.random()*100)));
			System.out.print(list.get(i));
			if(i<49)System.out.print(",");
			else System.out.println();
		}
		Map<Integer,List<Integer>> map = new HashMap<>();
		for(int i=0;i<list.size();i++){
			int key = list.get(i)/10;
			if(map.containsKey(key)){
				map.get(key).add(list.get(i));
			}else{
				List<Integer> list1 = new ArrayList<Integer>();
				list1.add(list.get(i));
				map.put(key, list1);
			}
		}
		System.out.print("Map中的数据为：{");
		for(Integer key:map.keySet()){
			if(key!=0)System.out.print(",");
			System.out.print(key+"=>[");
			for(int i=0;i<map.get(key).size();i++){
				System.out.print(map.get(key).get(i));
				if(i<map.get(key).size()-1)System.out.print(",");
			}
			System.out.print("]");
		}
		System.out.println("}");
		//排序后
		System.out.print("排序后的Map为：{");
		for(Integer key:map.keySet()){
			if(key!=0)System.out.print(",");
			System.out.print(key+"=>[");
			map.get(key).sort(null);
			for(int i=0;i<map.get(key).size();i++){
				System.out.print(map.get(key).get(i));
				if(i<map.get(key).size()-1)System.out.print(",");
			}
			System.out.print("]");
		}
		System.out.println("}");
	}

}
