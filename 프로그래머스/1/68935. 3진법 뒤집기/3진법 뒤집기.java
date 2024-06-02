class Solution {
    public int solution(int n) {
        String threeJin = Integer.toUnsignedString(n,3);
        String  sb = new StringBuilder(threeJin).reverse().toString();
        
        return Integer.parseInt(sb,3);
    }
}