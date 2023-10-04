class Solution {
    public List<String> letterCombinations(String digits) {
          List<String> ret = padret("",digits);
        return ret;
    }
    static List<String> padret(String pro, String up)
    {
         if(up.isEmpty()){
            List<String> list = new ArrayList<>();
            if(!pro.isEmpty()){
            list.add(pro);
            return list;
            }
            else{
                return list;
            }
        }

        int dig = up.charAt(0) - '0';

        List<String> list = new ArrayList<>();
        if(dig>=2 && dig<=6) {
            for (int i = (dig - 2) * 3; i < (dig-1) * 3; i++) {
                char ch = (char) ('a' + i);
               list.addAll(padret(pro + ch, up.substring(1)));
            }
        }
        if(dig==7){
            for(int i = (dig-2)*3 ; i<=(dig-1)*3 ; i++){
                char ch = (char)('a' + i);
                list.addAll(padret(pro + ch, up.substring(1)));
            }
        }
        if(dig==8){
            for(int i = ((dig-2)*3)+1 ; i<=(dig-1)*3 ; i++){
                char ch = (char)('a' + i);
                list.addAll(padret(pro + ch, up.substring(1)));
            }
        }
        if(dig==9){
            for(int i = ((dig-2)*3)+1 ; i<=((dig-1)*3)+1 ; i++){
                char ch = (char)('a' + i);
                list.addAll(padret(pro + ch, up.substring(1)));
            }
        }
        return list;
    }
}