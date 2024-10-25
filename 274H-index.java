class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);

        int index = 0;
        int count = 0;

        for(int i=citations.length-1;i>-1;i--){
            if(citations[i]>index){
                count = count + 1;
            }
            index = index + 1;
        }

        return count;
    }
}
