class Solution {
    public int removeDuplicates(int[] nums) {
       if (nums.length ==1){
           return nums.length;
       } 
        
       int currentUniqueElement =0; 
       int posofNewUniqueElement=0; 
        
       //loop through the array
       for (int i =0 ; i < nums.length ;i++){
           if (nums [currentUniqueElement] != nums[i]){
               posofNewUniqueElement++;
               //update the nums array with the value of the new unique element
               nums[posofNewUniqueElement] = nums[i];
               //the rest of the loop is compared with the new unique element
               currentUniqueElement = i;
           }       
       }

       System.out.println(posofNewUniqueElement++);
       return (posofNewUniqueElement++);      
    }
    
    
}