import java.util.List;
import java.util.LinkedList;

public class BiTree
{
    private static List<Node> nodeList = null;

	public static void createBiTree()
	{
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		nodeList = new LinkedList<>();
		
		//����������ת��Ϊ�������
		for(int i =0; i <array.length; i++)
		{
			nodeList.add(new Node(array[i]));
		}
		//ʵ��LChild��RChildָ���ӽ��

		//n�����ֻ��ǰ(n/2-1)�������������ӽ��
		for(int j =0; j < (array.length)/2 -1; j++)
		{
			nodeList.get(j).LChild = nodeList.get(2*j + 1);
			nodeList.get(j).RChild = nodeList.get(2*j + 2);
		}
		
		//���һ�������һ�������㣬��һ�����ҽ��
		int lastParentNode = (array.length)/2 -1;
		nodeList.get(lastParentNode).LChild = nodeList.get(2*lastParentNode + 1);

		//������Ϊ����ʱ�������ҽ��
		if(array.length % 2 == 1)
		{
			nodeList.get(lastParentNode).RChild = nodeList.get(2*lastParentNode + 2);
		}
	}
	
	//ͳ�ƶ�������Ҷ�ӽ��ĸ���
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

	//�����������
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

	//�ݹ����
	//�������
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
	
	//�������
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

	//�������
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

		System.out.println("�������:");
		PreOrderTraverse(nodeList.get(0));
		System.out.println();

		System.out.println("�������:");
		InOrderTraverse(nodeList.get(0));
		System.out.println();

		System.out.println("�������:");
		PostOrderTraverse(nodeList.get(0));
		System.out.println();

		System.out.println("��������Ҷ�ӽ��ĸ���:" + countLeaf(nodeList.get(0)));
	
		System.out.println("�����������:" + BiTreeDepth(nodeList.get(0)));
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
