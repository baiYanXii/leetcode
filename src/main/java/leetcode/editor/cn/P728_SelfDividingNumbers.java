/**
 * 自除数 是指可以被它包含的每一位数整除的数。
 * <p>
 * <p>
 * 例如，128 是一个 自除数 ，因为 128 % 1 == 0，128 % 2 == 0，128 % 8 == 0。
 * <p>
 * <p>
 * 自除数 不允许包含 0 。
 * <p>
 * 给定两个整数 left 和 right ，返回一个列表，列表的元素是范围 [left, right] 内所有的 自除数 。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * 输入：left = 1, right = 22
 * 输出：[1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22]
 * <p>
 * <p>
 * 示例 2:
 * <p>
 * <p>
 * 输入：left = 47, right = 85
 * 输出：[48,55,66,77]
 * <p>
 * <p>
 * <p>
 * <p>
 * 提示：
 * <p>
 * <p>
 * 1 <= left <= right <= 10⁴
 * <p>
 * Related Topics 数学 👍 190 👎 0
 */

package leetcode.editor.cn;

//自除数

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class P728_SelfDividingNumbers {
    public static void main(String[] args) {
        //测试代码
        Solution solution = new P728_SelfDividingNumbers().new Solution();
    }

    //力扣代码
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public List<Integer> selfDividingNumbers(int left, int right) {

            return new List<Integer>() {
                @Override
                public int size() {
                    return 0;
                }

                @Override
                public boolean isEmpty() {
                    return false;
                }

                @Override
                public boolean contains(Object o) {
                    return false;
                }

                @Override
                public Iterator<Integer> iterator() {
                    return null;
                }

                @Override
                public Object[] toArray() {
                    return new Object[0];
                }

                @Override
                public <T> T[] toArray(T[] a) {
                    return null;
                }

                @Override
                public boolean add(Integer integer) {
                    return false;
                }

                @Override
                public boolean remove(Object o) {
                    return false;
                }

                @Override
                public boolean containsAll(Collection<?> c) {
                    return false;
                }

                @Override
                public boolean addAll(Collection<? extends Integer> c) {
                    return false;
                }

                @Override
                public boolean addAll(int index, Collection<? extends Integer> c) {
                    return false;
                }

                @Override
                public boolean removeAll(Collection<?> c) {
                    return false;
                }

                @Override
                public boolean retainAll(Collection<?> c) {
                    return false;
                }

                @Override
                public void clear() {

                }

                @Override
                public Integer get(int index) {
                    return null;
                }

                @Override
                public Integer set(int index, Integer element) {
                    return null;
                }

                @Override
                public void add(int index, Integer element) {

                }

                @Override
                public Integer remove(int index) {
                    return null;
                }

                @Override
                public int indexOf(Object o) {
                    return 0;
                }

                @Override
                public int lastIndexOf(Object o) {
                    return 0;
                }

                @Override
                public ListIterator<Integer> listIterator() {
                    return null;
                }

                @Override
                public ListIterator<Integer> listIterator(int index) {
                    return null;
                }

                @Override
                public List<Integer> subList(int fromIndex, int toIndex) {
                    return null;
                }
            };
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}