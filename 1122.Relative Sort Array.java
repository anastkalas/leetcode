class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] result=new int[arr1.length+1];
        int pointer=0;
        
        for(int i=0;i<arr2.length;i++){

            for(int j=0;j<arr1.length;j++){

                if(arr1[j]==arr2[i]){
                    int temp=arr1[j];
                    arr1[j]=arr1[pointer];
                    arr1[pointer]=temp;
                    if(pointer<arr1.length-1){
                        pointer=pointer+1;
                    }
                }
            }
        }
        int min=1;
        int minp=0;
        for(int i=pointer;i<arr1.length;i++){
            for(int j=i;j<arr1.length;j++){
                if(j==i){
                    min=arr1[j];
                    minp=j;
                }
                else{
                    if(min>arr1[j]){
                        min=arr1[j];
                        minp=j;
                    }
                }
            }
            int temp=arr1[i];
            arr1[i]=min;
            arr1[minp]=temp;
        }
        System.out.println(pointer);
        return arr1;
    }
}
