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

        static TreeNode buildTree(char[] inorder, char[] preorder) {
            return buildTree(inorder, preorder, 0, inorder.length - 1, 0);
        }

        static TreeNode buildTree(char[] inorder, char[] preorder, int inStart, int inEnd, int preStart) {
            if (inStart > inEnd || preStart > preorder.length - 1) {
                return null;
            }

            TreeNode rootNode = new TreeNode(preorder[preStart]);

            int inIndex = -1;
            for (int i = inStart; i <= inEnd; i++) {
                if (inorder[i] == rootNode.value) inIndex = i;
            }

            rootNode.left = buildTree(inorder, preorder, inStart, inIndex - 1, preStart + 1);
            rootNode.right = buildTree(inorder, preorder, inIndex + 1, inEnd, preStart + (inIndex - inStart) + 1);

            return rootNode;
        }

        static void printPostOrder(TreeNode tree) {
            if (tree.left != null) printPostOrder(tree.left);
            if (tree.right != null) printPostOrder(tree.right);
            System.out.print(tree.value);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char[] inorder = scan.next().toCharArray();
        char[] preorder = scan.next().toCharArray();
        scan.close();
        TreeNode tree = TreeNode.buildTree(inorder, preorder);
        TreeNode.printPostOrder(tree);
    }
}
