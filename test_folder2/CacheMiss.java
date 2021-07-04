import java.util.*;
public class CacheMiss{
public static void main(String[] args){
	int[] pages = {1,2,3,3,1,2,2,1,3};
	int capacity = 3;
	System.out.println(findCacheMiss(pages,capacity));
}
public static int findCacheMiss(int[] pages,int capacity){
	if(pages == null || pages.length==0) return 0;
	int count = 0;
	Queue<Integer> queue = new LinkedList<>();
	Queue<Integer> temp = new LinkedList<>();
	for(int i=0;i<pages.length;i++){
		if(queue.contains(pages[i]))
		{
			while(queue.size()!=0){
				int current = queue.remove();
				if(pages[i] != current){
					temp.add(current);
				}
			}
			while(!temp.isEmpty()){
				queue.add(temp.remove());
			}
			queue.add(pages[i]);
		}
		else{
			queue.add(pages[i]);
			count++;
		}
		if(queue.size() > capacity) queue.remove();
		System.out.println(queue);
	}
	return count;
}
public static int lruCacheMisses(List<Integer> pages, int maxCacheSize) {
	Map<Integer, Integer> cache = new LinkedHashMap<>();
	int misses = 0;
	for (int page : pages) {
		if (!cache.containsKey(page)) {
			misses++;
		}
		// We are simply using only keySet as doubly linked list using Linked HashMap
		// Remove and add at end again if it is present or does nothing
		cache.remove(page);
		cache.put(page, 0);
		if (cache.size() > maxCacheSize) {
			// Remove first value in the map
			cache.remove(new ArrayList<>(cache.keySet()).get(0));
		}
	}
	return misses;
}
}