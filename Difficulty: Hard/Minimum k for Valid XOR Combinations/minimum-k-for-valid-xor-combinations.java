class Solution {

    static class TrieNode {
        TrieNode[] child = new TrieNode[2];
        int count = 0;
    }

    static class Trie {
        TrieNode root = new TrieNode();

        // Insert number into trie
        void insert(int num) {
            TrieNode node = root;

            for (int i = 31; i >= 0; i--) {

                int bit = (num >> i) & 1;

                if (node.child[bit] == null) {
                    node.child[bit] = new TrieNode();
                }

                node = node.child[bit];
                node.count++;
            }
        }

        // Count numbers such that (num XOR val) < k
        long query(int num, int k) {

            TrieNode node = root;
            long ans = 0;

            for (int i = 31; i >= 0; i--) {

                if (node == null)
                    break;

                int numBit = (num >> i) & 1;
                int kBit = (k >> i) & 1;

                if (kBit == 1) {

                    // take same bit branch
                    if (node.child[numBit] != null) {
                        ans += node.child[numBit].count;
                    }

                    node = node.child[1 - numBit];

                } else {

                    node = node.child[numBit];
                }
            }

            return ans;
        }
    }

    // Count subarrays having XOR <= k
    static long countSubarrays(int[] arr, int k) {

        Trie trie = new Trie();

        int prefixXor = 0;

        long count = 0;

        trie.insert(0);

        for (int num : arr) {

            prefixXor ^= num;

            // query for XOR < (k+1)
            count += trie.query(prefixXor, k + 1);

            trie.insert(prefixXor);
        }

        return count;
    }

    public static int minimizeKForXOR(int x, int[] arr) {

        int low = 0;
        int high = (1 << 30);

        int ans = high;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            long cnt = countSubarrays(arr, mid);

            if (cnt >= x) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }
}