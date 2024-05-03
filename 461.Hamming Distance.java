class Solution {
    public int hammingDistance(int x, int y) {
        ArrayList<Integer> binaryx=new ArrayList<>();
        ArrayList<Integer> binaryy=new ArrayList<>();

        while (x > 0) {
            // Get the least significant bit
            int bit = x % 2;
            // Prepend it to the binary representation
            binaryx.add(bit);
            // Shift the number to the right by 1 bit
            x = x / 2;
        }
        while(y>0){
            int bit=y%2;
            binaryy.add(bit);
            y=y/2;
        }
        
        if(binaryx.size()<binaryy.size()){
            for(int i=binaryx.size();i<binaryy.size();i++){
                binaryx.add(0);
            }
        }
        else{
            for(int i=binaryy.size();i<binaryx.size();i++){
                binaryy.add(0);
            }
        }
        System.out.println(binaryx);
        System.out.println(binaryy);
        int count=0;

        for(int i=0;i<binaryx.size();i++){
            if(binaryx.get(i)!=binaryy.get(i)){
                count=count+1;
            }
        }
        return count;
    }
}
