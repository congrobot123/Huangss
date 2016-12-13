import java.util.List;
import java.util.LinkedList;

public class BiTree
{
    private static List<Node> nodeList = null;

	public static void createBiTree()
	{
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		nodeList = new LinkedList<>();
		
		//将数组数据转化为结点数据
		for(int i =0; i <array.length; i++)
		{
			nodeList.add(new Node(array[i]));
		}
		//实现LChild和RChild指向子结点

		//n个结点只有前(n/2-1)个结点具有左右子结点
		for(int j =0; j < (array.length)/2 -1; j++)
		{
			nodeList.get(j).LChild = nodeList.get(2*j + 1);
			nodeList.get(j).RChild = nodeList.get(2*j + 2);
		}
		
		//最后一个父结点一定有左结点，不一定有右结点
		int lastParentNode = (array.length)/2 -1;
		nodeList.get(lastParentNode).LChild = nodeList.get(2*lastParentNode + 1);

		//结点个数为奇数时，才有右结点
		if(array.length % 2 == 1)
		{
			nodeList.get(lastParentNode).RChild = nodeList.get(2*lastParentNode + 2);
		}
	}
	
	//统计二叉树中叶子结点的个数
	public static int countLeaf(Node node)
	{
		int countLeft =0;
		int countRight =0;

		if(node ==null)
		{
			return 0;
		}

		if(node.LChild ==null && node.RChild == null)
		{
			return 1;
		}

		countLeft =countLeaf(node.LChild);
		countRight =countLeaf(node.RChild);

		return (countLeft + countRight);
	}

	//二叉树的深度
	public static int BiTreeDepth(Node node)
	{
		int depLeft =0;
		int depRight =0;

		if(node == null)
		{
			return 0;
		}
		else
		{
			depLeft =BiTreeDepth(node.LChild);
			depRight =BiTreeDepth(node.RChild);
		}

		if(depLeft >= depRight)
		{
			return depLeft + 1;
		}
		else
		{
			return depRight + 1;
		}
	}

	//递归遍历
	//先序遍历
	public static void PreOrderTraverse(Node node)
	{
		if(node == null)
		{
			return;
		}

		System.out.print(node.data + " ");
		PreOrderTraverse(node.LChild);
		PreOrderTraverse(node.RChild);
	}
	
	//中序遍历
	public static void InOrderTraverse(Node node)
	{
		if(node == null)
		{
			return;
		}

		PreOrderTraverse(node.LChild);
		System.out.print(node.data + " ");
		PreOrderTraverse(node.RChild);
	}

	//后序遍历
	public static void PostOrderTraverse(Node node)
	{
		if(node == null)
		{
			return;
		}

		PreOrderTraverse(node.LChild);
		PreOrderTraverse(node.RChild);
		System.out.print(node.data + " ");
	}

	public static void main(String[] args) 
	{
		createBiTree();

		System.out.println("先序遍历:");
		PreOrderTraverse(nodeList.get(0));
		System.out.println();

		System.out.println("中序遍历:");
		InOrderTraverse(nodeList.get(0));
		System.out.println();

		System.out.println("后序遍历:");
		PostOrderTraverse(nodeList.get(0));
		System.out.println();

		System.out.println("二叉树中叶子结点的个数:" + countLeaf(nodeList.get(0)));
	
		System.out.println("二叉树的深度:" + BiTreeDepth(nodeList.get(0)));
	}
}

class Node
{
	public int data =0;
	Node LChild =null;
	Node RChild =null;

	public Node(){}
	public Node(int data)
	{
		this.data =data;
	}
}
