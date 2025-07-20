class Solution {
    public boolean isPalindrome(int x) {
        if(x<0 || (x % 10 == 0 && x!=0)) return false;
        int reversedhalf=0;
        while(x>reversedhalf){

            int digit =x%10;

            reversedhalf=reversedhalf*10+digit;
            x=x/10;
        }

        return x==reversedhalf || x==reversedhalf/10;

    }


}