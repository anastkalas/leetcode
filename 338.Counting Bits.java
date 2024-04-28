class Solution {
    public int[] countBits(int n) {
        int[] ones=new int[n+1];
        int number;
        for(int i=0;i<ones.length;i++){
            int count=0;
            number=i;
            while(number>0){
                int remainder=number % 2;
                if(remainder==1){
                    count=count+1;
                }
                number=number/2;
            }
            ones[i]=count;
        }
        return ones;
    }
}
