## This Java code defines a class `FindTwoNonOverlappingSubArraysEachWithTargetSum` that contains a method `minSumOfLengths`. This method takes an integer array `arr` and an integer `target` as input and aims to find the minimum sum of lengths of two non-overlapping subarrays within `arr` such that the sum of elements in each subarray is equal to the given `target`. 

### Here's a detailed explanation of the code:

1. Initialize `ans` to `Integer.MAX_VALUE`: This variable will store the minimum sum of lengths of two non-overlapping subarrays with the target sum. It is initialized to a very large value to ensure any valid result will be smaller.

2. Initialize `leftLength` to `Integer.MAX_VALUE`: This variable will store the length of the left subarray in the minimum sum of lengths. It is also initialized to a very large value.

3. Initialize `prefix` to 0: This variable will be used to keep track of the cumulative sum of elements in the array.

4. Create a `HashMap` called `prefixToIndex`: This map will store the cumulative sum `prefix` as keys and their corresponding index in the array as values. It is initialized with a single entry where key 0 is mapped to -1 (indicating that the cumulative sum 0 is found at index -1).

5. First Loop (Prefix Sum Calculation):
   - Iterate through the elements of the input array `arr` using a for loop.
   - Update the `prefix` by adding the current element `arr[i]` to it.
   - Store the current index `i` as the value corresponding to the current `prefix` in the `prefixToIndex` map.

6. Reset `prefix` to 0: This is done to start the second loop with a fresh calculation of the prefix sum.

7. Second Loop (Finding Subarrays with Target Sum):
   - Iterate through the elements of the input array `arr` again.
   - Update the `prefix` by adding the current element `arr[i]` to it.
   - Check if `prefix - target` exists as a key in the `prefixToIndex` map. If it does, this means that there exists a subarray on the left side of the current index `i` with a sum equal to `target`.
   - If such a subarray is found, calculate its length as `i - prefixToIndex.get(prefix - target)` and update `leftLength` to store the minimum length encountered so far.
   - Check if `leftLength` is not equal to `Integer.MAX_VALUE`, which means a valid left subarray has been found.
   - If `prefix + target` exists as a key in the `prefixToIndex` map, this means that there exists a subarray on the right side of the current index `i` with a sum equal to `target`.
   - Calculate the length of this right subarray as `prefixToIndex.get(prefix + target) - i` and add it to `leftLength`. Update `ans` with the minimum of `ans` and this sum of lengths.

8. Return the result: If a valid pair of non-overlapping subarrays with the target sum is found, return `ans`. If no such pair is found, return -1.

## The code efficiently uses a prefix sum approach along with a HashMap to keep track of cumulative sums and their corresponding indices. It ensures that the subarrays found are non-overlapping and calculates their lengths correctly to find the minimum sum of lengths satisfying the target sum condition.
