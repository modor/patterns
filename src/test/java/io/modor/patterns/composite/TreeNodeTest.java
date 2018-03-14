package io.modor.patterns.composite;

import static org.junit.Assert.*;
import io.modor.patterns.composite.TreeNode;

import org.junit.Test;

public class TreeNodeTest {

	@Test
	public void test() {
		TreeNode root = new TreeNode();
		root.setName("root");
		TreeNode nodeA = new TreeNode();
		nodeA.setName("nodeA");
		TreeNode nodeB = new TreeNode();
		nodeB.setName("nodeB");
		root.addChild(nodeA);
		nodeA.addChild(nodeB);
		assertEquals("root", root.getName());
		assertEquals("nodeA", root.getChildren().nextElement().getName());
		assertEquals("nodeB", root.getChildren().nextElement().getChildren()
				.nextElement().getName());
	}

}
