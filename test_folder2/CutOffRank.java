import java.util.*;

public class CutOffRank{
public static void main(String[] args){
	int cutOffRank = 3;
	int[] scores = {100,50,50,25};
	// {7,6,4,4,4,4} cut off 3 op 6
	Arrays.sort(scores);
	int rank=1;
	int position = 1;
	
	PriorityQueue<Integer> q = new PriorityQueue<>(Comparator.reverseOrder());
	for(int i=scores.length-1;i>0;i--){
		if(scores[i]!=scores[i+1]){
			position++;
		}
		else{
			rank =rank+temp+1;
			temp = 0;
		}
		
	}
}
}