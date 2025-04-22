<details><summary><strong>Related Topics</strong></summary>数组 | 哈希表 | 前缀和</details><br>

<div>👍 206, 👎 0<span style='float: right;'><span style='color: gray;'><a href='https://github.com/labuladong/fucking-algorithm/discussions/939' target='_blank' style='color: lightgray;text-decoration: underline;'>bug 反馈</a> | <a href='https://labuladong.gitee.io/article/fname.html?fname=jb插件简介' target='_blank' style='color: lightgray;text-decoration: underline;'>使用指南</a> | <a href='https://labuladong.github.io/algo/images/others/%E5%85%A8%E5%AE%B6%E6%A1%B6.jpg' target='_blank' style='color: lightgray;text-decoration: underline;'>更多配套插件</a></span></span></div>

<div id="labuladong"><hr>

**通知：[数据结构精品课](https://aep.h5.xeknow.com/s/1XJHEO) 已更新到 V2.1，[手把手刷二叉树系列课程](https://aep.xet.tech/s/3YGcq3) 上线。**

<details><summary><strong>labuladong 思路</strong></summary>

## 基本思路

这道题就是标准的[前缀和技巧](https://labuladong.github.io/article/fname.html?fname=前缀和技巧) + 哈希表的组合，建议你先做一下 [525. 连续数组](/problems/contiguous-array) 和 [560. 和为 K 的子数组](/problems/subarray-sum-equals-k)，我在那两道题的思路写的比较详细。

本题让你寻找长度最长的和为 `k` 的子数组，翻译一下就是：

**寻找 `i, j` 使得 `preSum[i] - preSum[j] == k` 且 `i - j` 尽可能的大**。

另外，`preSum[i] - preSum[j] == k` 其实就是 `preSum[j] == preSum[i] - k`。

所以我们使用一个哈希表，记录 `preSum[i]` 的值以及这个前缀和第一次出现的索引，就可以迅速判断 `preSum[i]` 是否符合条件并计算最长子数组长度了。具体看代码吧。

**标签：前缀和，[数组](https://mp.weixin.qq.com/mp/appmsgalbum?__biz=MzAxODQxMDM0Mw==&action=getalbum&album_id=2120601117519675393)**

## 解法代码

```java
class Solution {
    public static int maxSubArrayLen(int[] nums, int k) {
        int n = nums.length;
        // preSum 中的值 -> 对应的最小索引
        // 比如 preSum = [2,4,1,3,4]，preSumToIndex[4] = 1
        HashMap<Integer, Integer> preSumToIndex = new HashMap<>();
        int maxLen = 0;
        // 前缀和数组（在这道题中可以优化为一个变量）
        int preSum = 0;
        // base case，这样索引相减的时候可以算出正确的子数组长度
        preSumToIndex.put(0, -1);
        for (int i = 0; i < n; i++) {
            // 计算前缀和，维护 preSum = sum(nums[0..i])
            preSum += nums[i];
            // 确保 preSumToIndex 中记录的索引是第一次出现的位置
            preSumToIndex.putIfAbsent(preSum, i);
            int need = preSum[i] - k;
            if (preSumToIndex.containsKey(need)) {
                int j = preSumToIndex.get(need);
                // nums[j..i] 是和为 k 的子数组
                maxLen = Math.max(maxLen, i - j);
            }
        }
        return maxLen;
    }
}
```

</details>
</div>



