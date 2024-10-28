class Solution 
{
    public List<List<Integer>> threeSum(int[] nums) 
    {
        //to store the triplets
        HashSet<List <Integer>> result=new HashSet<>();

        //sort nums to make life easier
        Arrays.sort(nums);

        //iterate through nums
        for(int i=0;i<nums.length-2;i++)
        {
            //two pointer for the other two numbers from nums
            int front=i+1;
            int rear=nums.length-1;
            //look for the numbers that sum to 0
            while(front<rear)
            {
                int sam=nums[i]+nums[front]+nums[rear];
               // System.out.println("*"+i+""+s+""+l+" sm"+sm);
                if(sam==0)
                {
                    //add triplet to result hashset
                    result.add(Arrays.asList(nums[i],nums[front],nums[rear]));
                    front++;
                    rear--;
                }
                else if(sam<0)
                front++;
                else
                rear--; 
            }
        }     
        return new ArrayList<>(result);
    }
}
