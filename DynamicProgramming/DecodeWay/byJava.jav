class Solution {
    public int numDecodings(String s) {
        if(s.length() == 0){
            return 1;
        }
        if(s.charAt(0) =='0'){
            return 0;
        }
        if(s.length() ==1){
            return 1;
        }
        int single = numDecodings(s.substring(1));
        int db = 0;
        if (s.length()>=2){
            String sub = s.substring(0,2);
            int k = Integer.parseInt(sub);
            if(k<=26){
                db = numDecodings(s.substring(2));
            }
        }
        return single+db;
        
    }
}