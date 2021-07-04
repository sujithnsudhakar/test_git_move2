class Solution {
    public String breakPalindrome(String palindrome) {
        String result ="";
        if(palindrome==null && palindrome.length()==0) return result;
        if(palindrome.length()==1) return result;
        int count=0;
        for(int i=0;i<palindrome.length()/2;i++){
            if(palindrome.charAt(i) != 'a'){
                result = palindrome.substring(0,i)+"a"+palindrome.substring(i+1);
                return result;
            }
        }
        int len = palindrome.length();
        if(count==0)
           result = palindrome.substring(0,len-1)+"b";
        return result;
    }
}