import java.util.*;
public class DiskSpaceAnalysis{
public static void main(String[] args){
	//int[] disks = {8,2,4};
	int[] disks = {8,2,5,3,1,8,6,9};
	int capacity = 2;
	int left = 0;
	System.out.println(findSpace(disks,capacity));
}
public static int findSpace(int[] disks,int capacity){
	for(int right=0;right<disks.length;right++){
			
	}		
}
public static int findMin(Queue<Integer> q){
	if(q.size() == 0 || q == null) return 0;
	int min = Integer.MAX_VALUE; 
	for(int num:q){
		if(num < min){
			min = num;
		}
	}
	return min;
}
}