class Solution {
    public boolean isPalindrome(String s) {
        int i = 0;
        int n = s.length() - 1;
        while(i<n){
            if(!Character.isLetterOrDigit(s.charAt(i))){
                i++;
                continue;}
                if (!Character.isLetterOrDigit(s.charAt(n))){
                 n--;
                 continue;
}
                if(Character.toLowerCase(s.charAt(n))!=
                    Character.toLowerCase(s.charAt(i))){
                    return false;}
                    else{i++;
                    n--;
                
            }

        }
    return true;
}
}