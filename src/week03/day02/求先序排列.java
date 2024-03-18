package week03.day02;

import java.util.Scanner;

public class 求先序排列 {
    static class TreeNode {
        char value;
        TreeNode left;
        TreeNode right;

        TreeNode(char value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }

        static TreeNode buildTree(char[] inorder, char[] postorder) {
            return buildTree(inorder, postorder, 0, inorder.length - 1, postorder.length - 1);
        }

        static TreeNode buildTree(char[] inorder, char[] postorder, int inStart, int inEnd, int postEnd) {
            if (inStart > inEnd || postEnd < 0) {
                return null;
            }

            TreeNode rootNode = new TreeNode(postorder[postEnd]);

            int inIndex = -1;
            for (int i = inStart; i <= inEnd; i++) {
                if (inorder[i] == rootNode.value) inIndex = i;
            }

            rootNode.left = buildTree(inorder, postorder, inStart, inIndex - 1, postEnd - (inEnd - inIndex) - 1);
            rootNode.right = buildTree(inorder, postorder, inIndex + 1, inEnd, postEnd - 1);

            return rootNode;
        }

        static void printPreorder(TreeNode tree) {
            System.out.print(tree.value);
            if (tree.left != null) printPreorder(tree.left);
            if (tree.right != null) printPreorder(tree.right);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] inorder = scanner.next().toCharArray();
        char[] postorder =  scanner.next().toCharArray();
        scanner.close();

        TreeNode tree = TreeNode.buildTree(inorder, postorder);
        TreeNode.printPreorder(tree);
    }
}
