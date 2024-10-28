class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        int rear = numbers.length - 1;

        int front = 0;
        int[] result = new int[2];

        if(numbers[rear] + numbers[front] == target){
            result[0] = front + 1;
            result[1] = rear + 1;
        }

        while(numbers[rear] + numbers[front] != target && front < rear){
            if(numbers[rear] + numbers[front] < target){
                front++;
            }
            else if(numbers[rear] + numbers[front] > target){
                rear--;
            }
            if(numbers[rear] + numbers[front] == target){
                result[1] = rear + 1;
                result[0] = front + 1;
            }
        }

        return result;

    }
}
