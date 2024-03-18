package week03.day02;

import java.util.Scanner;

public class 美国血统 {
    static class TreeNode {
        char value;
        TreeNode left;
        TreeNode right;

        TreeNode(char value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }

        public static TreeNode buildTree(char[] inorder, char[] preorder) {
            return buildTree(inorder, preorder, 0, 0, inorder.length - 1);
        }

        static TreeNode buildTree(char[] inorder, char[] preorder, int preStart, int inStart, int inEnd) {
            if (preStart > preorder.length - 1 || inStart > inEnd) {
                return null;
            }

            TreeNode rootNode = new TreeNode(preorder[preStart]);

            int inIndex = -1;
            for (int i = inStart; i <= inEnd; i++) {
                if (inorder[i] == rootNode.value) {
                    inIndex = i;
                }
            }

            // 递归构建左子树，左子树的范围是中序遍历序列中根节点左边的部分
            rootNode.left = buildTree(preorder, inorder, preStart + 1, inStart, inIndex - 1);
            // 递归构建右子树，右子树的范围是中序遍历序列中根节点右边的部分
            rootNode.right = buildTree(preorder, inorder, preStart + 1 + inIndex - inStart, inIndex + 1, inEnd);
            return rootNode;
        }

        static void printPostOrder(TreeNode tree) {
            if (tree.left != null) {
                printPostOrder(tree.left);
            }
            if (tree.right != null) {
                printPostOrder(tree.right);
            }
            System.out.print(tree.value);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String inorderString = scan.next();
        String preorderString = scan.next();
        scan.close();
        char[] inorder = inorderString.toCharArray();
        char[] preorder = preorderString.toCharArray();
        TreeNode tree = TreeNode.buildTree(inorder, preorder);
        if (tree != null) {
            TreeNode.printPostOrder(tree);
        }
    }
}
