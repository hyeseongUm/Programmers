class Solution {
    public String solution(String phone_number) {
        int size = phone_number.length();
        return "*".repeat(size-4)+phone_number.substring(size-4,size);
    }
}