//package JavaProblems.Advanced.JavaVisitorPattern;
//
//import java.util.ArrayList;
//
//enum Color {
//    RED, GREEN
//}
//
//abstract class Tree {
//
//    private int value;
//    private Color color;
//    private int depth;
//
//    public Tree(int value, Color color, int depth) {
//        this.value = value;
//        this.color = color;
//        this.depth = depth;
//    }
//
//    public int getValue() {
//        return value;
//    }
//
//    public Color getColor() {
//        return color;
//    }
//
//    public int getDepth() {
//        return depth;
//    }
//
//    public abstract void accept(TreeVis visitor);
//}
//
//class TreeNode extends Tree {
//
//    private ArrayList<Tree> children = new ArrayList<>();
//
//    public TreeNode(int value, Color color, int depth) {
//        super(value, color, depth);
//    }
//
//    public void accept(TreeVis visitor) {
//        visitor.visitNode(this);
//
//        for (Tree child : children) {
//            child.accept(visitor);
//        }
//    }
//
//    public void addChild(Tree child) {
//        children.add(child);
//    }
//}
//
//class TreeLeaf extends Tree {
//
//    public TreeLeaf(int value, Color color, int depth) {
//        super(value, color, depth);
//    }
//
//    public void accept(TreeVis visitor) {
//        visitor.visitLeaf(this);
//    }
//}
//
//abstract class TreeVis {
//    public abstract int getResult();
//
//    public abstract void visitNode(TreeNode node);
//
//    public abstract void visitLeaf(TreeLeaf leaf);
//
//}
//
//class SumInLeavesVisitor extends TreeVis {
//    public int getResult() {
//        // return the sum of the values in the tree's leaves only.
//        for (int temp:)
//            return 0;
//    }
//
//    public void visitNode(TreeNode node) {
//        //implement this
//    }
//
//    public void visitLeaf(TreeLeaf leaf) {
//        //implement this
//    }
//}
//
//class ProductOfRedNodesVisitor extends TreeVis {
//    public int getResult() {
//        //return the product of values stored in all red nodes, including leaves, computed modulo 10^9 + 7 .
//        // Note that the product of zero values is equal to 1.
//        return 1;
//    }
//
//    public void visitNode(TreeNode node) {
//        //implement this
//    }
//
//    public void visitLeaf(TreeLeaf leaf) {
//        //implement this
//    }
//}
//
//class FancyVisitor extends TreeVis {
//    public int getResult() {
//        //return the absolute difference between the sum of values stored in the tree's non-leaf nodes at
//        // even depth and the sum of values stored in the tree's green leaf nodes. Recall that zero is an even number.
//        return 0;
//    }
//
//    public void visitNode(TreeNode node) {
//        //implement this
//    }
//
//    public void visitLeaf(TreeLeaf leaf) {
//        //implement this
//    }
//}
//
//public class Solution {
//
//    public static Tree solve() {
//        //read the tree from STDIN and return its root as a return value of this function
//    }
//