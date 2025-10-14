class Solution {
  public:
    int nodeSum(Node* root, int l, int r) {
        if(!root) return 0;
        
        int left = nodeSum(root->left, l, r);
        int right = nodeSum(root->right, l, r);
        
        if(root->data >= l && root->data <= r){
            return root->data + left + right;
        }
        
        return left + right;
        
    }
};
