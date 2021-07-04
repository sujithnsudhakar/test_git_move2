public class AmazonPlay{
public static void main(String[] args){
	int[] songs = {30, 20, 150, 100, 40};
	System.out.println(calculatePairs(songs));
	// output is 3 Pairs- (1,3) (0,2) (1,4)
}
private static int calculatePairs(int[] songs){
	int count = 0;
	// Corner cases
	if(songs == null || songs.length == 0) return count;
	//Bruteforce approach
	for(int i=0;i<songs.length;i++){
		for(int j=i;j<songs.length;j++){
			if(i != j && (songs[i]+songs[j]) % 60 == 0){
				count++;
			}
		}
	}
return count;
}
}
[1,2,3]
[4,5,1]
[2,4,6]
Paths = 
1,2,3,1,6
1,4,2,4,6
1,2,5,4,6
1,4,5,1,6
1,2,5,1,6

Min of all - 1,4,4,1,1
Max - 4
DP:
1 val [0][0] => same



