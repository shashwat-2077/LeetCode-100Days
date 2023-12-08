/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    string tree2str(TreeNode* root) {
        return dfs(root);
    }
private:
  string dfs(TreeNode* t) {
    if (t == nullptr)
      return "";

    const string& rootStr = to_string(t->val);
    if (t->right)
        return rootStr + "(" + dfs(t->left) + ")(" + dfs(t->right) + ")";
    if (t->left)
        return rootStr + "(" + dfs(t->left) + ")";
      
    return rootStr + "";
  }
};