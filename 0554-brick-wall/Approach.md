## The `leastBricks` method is designed to find the minimum number of bricks that need to be crossed to reach from one side of a given wall to the other. The wall is represented as a 2D list where each row consists of integers representing the widths of bricks. Bricks are stacked one on top of the other, and the goal is to find the least number of bricks to cross such that you can start from the leftmost edge and reach the rightmost edge.

### Here's a detailed explanation of the approach used in the `leastBricks` method:

1. Initialize variables:
   - `maxFreq`: This variable keeps track of the maximum frequency of a prefix sum encountered while iterating through the rows of the wall. It will help determine the minimum number of bricks to cross.
   - `count`: This is a HashMap that stores the frequency of each prefix sum encountered.

2. Iterate through each row of the wall:
   - `for (List<Integer> row : wall)`: This loop iterates through each row of the wall.

3. Calculate prefix sums:
   - `int prefix = 0;`: Initialize a `prefix` variable to keep track of the prefix sum as you iterate through the elements of the current row.

4. Iterate through the bricks in the current row:
   - `for (int i = 0; i < row.size() - 1; ++i)`: This loop iterates through the bricks in the current row, excluding the last brick (since the last brick's edge does not contribute to the prefix sum).

5. Update the prefix sum:
   - `prefix += row.get(i);`: Add the width of the current brick to the `prefix` to calculate the prefix sum at this point.

6. Update the frequency count:
   - `maxFreq = Math.max(maxFreq, count.merge(prefix, 1, Integer::sum));`: This line updates `maxFreq` by comparing it to the maximum frequency of the current `prefix` encountered so far. The `merge` method of the `count` HashMap is used to update the frequency of `prefix`. If `prefix` already exists in the `count` map, it increments the count by 1; otherwise, it initializes the count to 1.

7. Calculate the result:
   - `return wall.size() - maxFreq;`: The method returns the difference between the total number of rows in the wall and `maxFreq`. This difference represents the minimum number of bricks that need to be crossed to reach from one side of the wall to the other, as you can align your path with the most common prefix sum to minimize the number of crossings.

## In summary, this algorithm efficiently finds the least number of bricks that need to be crossed to traverse the wall by calculating and analyzing the prefix sums of each row and keeping track of their frequencies.
