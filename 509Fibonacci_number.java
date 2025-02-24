class Solution {
    public int fib(int n) {

        if(n == 0){
            return 0;
        }
        else if(n == 1){
            return 1;
        }

        int[] seq = new int[n + 1];
        seq[0] = 0;
        seq[1] = 1;
        int pointer = 1;
        while(pointer < n){
            pointer = pointer + 1;
            seq[pointer] = seq[pointer - 2] + seq[pointer - 1];
        }

        return seq[n];
    }
}
