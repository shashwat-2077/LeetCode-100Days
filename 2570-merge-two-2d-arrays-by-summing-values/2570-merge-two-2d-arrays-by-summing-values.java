class Solution {
  public int[][] mergeArrays(int[][] nums1, int[][] nums2) {

    final int maxIterate = 1000;
    List<int[]> outputArray = new ArrayList<>();
    int[] count = new int[maxIterate + 1];

    addSimiliarCount(nums1, count);
    addSimiliarCount(nums2, count);

    for (int i = 1; i <= maxIterate; ++i)
      if (count[i] > 0)
        outputArray.add(new int[] {i, count[i]});

    return outputArray.stream().toArray(int[][] ::new);
  }

  private void addSimiliarCount(int[][] nums, int[] count) {
    for (int[] idAndVal : nums) {
      final int id = idAndVal[0];
      final int val = idAndVal[1];
      count[id] += val;
    }
  }
}
