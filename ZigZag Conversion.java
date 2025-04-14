class Solution {
    public String convert(String s, int numRows) {
        if(s.length() == 1 | numRows == 1){
            return s;
        }
        
        ArrayList<ArrayList<Character>> zigzag = new ArrayList<>();

        for(int i = 0;i<numRows;i++){
            ArrayList<Character> r = new ArrayList<>();
            zigzag.add(r);
        }

        int row = 0;
        int a = 1; // a == 1 move down(to the next row) a == -1 move up(to the previous row)

        for(int i = 0;i<s.length();i++){
            zigzag.get(row).add(s.charAt(i));

            if(row == 0){
                a = 1;
            }
            else if(row == numRows - 1){
                a = -1;
            }

            if(a == 1){
                row = row + 1;
            }
            else if(a == -1){
                row = row - 1;
            }
        }
        String res = "";
        for(int i = 0;i<zigzag.size();i++){
            for(int j = 0;j<zigzag.get(i).size();j++){
                res = res + (zigzag.get(i)).get(j);
            }
        }
        return res;
    }
}
