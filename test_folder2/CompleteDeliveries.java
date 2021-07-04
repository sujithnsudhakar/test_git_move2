import java.util.*;
class CompleteDeliveries{
public static void main(String[] args){
	int numBuilding = 2;
	int[] openTime = {8,10};
	int[] offloadTime = {2,2,3,1,8,7,4,5}; // sorted {8,7,5,4,3,2,2,1}
	//int[] offloadTime = {2,2,3,1,8,7,4,5,13,5,4,2};
	System.out.println(findEarliestTime(numBuilding,openTime,offloadTime));
}
public static int findEarliestTime(int numBuilding,int[] openTime,int[] offloadTime){
	Arrays.sort(openTime);
	// To sort in descending order, first sort in ascending the swap elements
	Arrays.sort(offloadTime);
	
	// Swap first and last elements and proceed
	for (int i = 0, j = offloadTime.length - 1, tmp; i < j; i++, j--) {
            tmp = offloadTime[i];
            offloadTime[i] = offloadTime[j];
            offloadTime[j] = tmp;
        }
	
	int max = Integer.MIN_VALUE;
	for(int i=0;i<numBuilding;i++)
		max = Math.max(openTime[i]+offloadTime[i*4],max);
	return max;
}
}