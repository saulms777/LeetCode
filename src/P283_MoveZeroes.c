void moveZeroes(int* nums, int numsSize) {
    int i = 0;
    int z = 1;
    while (z < numsSize) {
        if (nums[i] == 0) {
            while (nums[z] == 0) {
                if (++z == numsSize) {
                    return;
                }
            }
            nums[i] = nums[z];
            nums[z] = 0;
        }
        i++;
        z++;
    }
}