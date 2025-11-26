class NumArray {
public:
    vector<int> prefixSum;   // stores prefix sums: prefixSum[i] = nums[0] + ... + nums[i]

    NumArray(vector<int>& nums) {
        int temp = 0;        // running sum
        for (int i : nums) { // iterate through each element in nums
            temp += i;       // add current element to running sum
            prefixSum.push_back(temp);  // store current prefix sum
        }
    }
    
    int sumRange(int left, int right) {
        // If left is not zero, subtract prefix sum up to left-1
        if (left != 0) {
            // sum(nums[left..right]) = prefixSum[right] - prefixSum[left - 1]
            return prefixSum[right] - prefixSum[left - 1];
        }
        // If left is zero, the sum is just prefixSum[right]
        else {
            return prefixSum[right];
        }
    }
};


/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray* obj = new NumArray(nums);
 * int param_1 = obj->sumRange(left,right);
 */