class Solution {
    public static String commonPrefix(String s1 ,String s2){
        String result="";
        int l1 = s1.length();
        int l2 = s2.length();
        for(int i=0,j=0;i<l1&&j<l2;i++,j++){
            if(s1.charAt(i)!=s2.charAt(i)){
                break;
            }
            result+=s1.charAt(i);
        }
        return result;
    }
    public String longestCommonPrefix(String[] strs) {
        String prefix=strs[0];
        for(int i=1;i<strs.length;i++){
            prefix=commonPrefix(prefix,strs[i]);
        }
        return prefix;
        
    }
}