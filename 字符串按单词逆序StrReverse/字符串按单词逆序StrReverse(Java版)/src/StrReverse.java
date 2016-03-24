
public class StrReverse {

	
	private void ReverseWord(char[] a,int front,int end)
	{
		while(front<end){
			char temp=a[front];
			a[front]=a[end];
			a[end]=temp;
			front++;
			end--;
		}
	}
	
	private String Reverse(String s)
	{
		char[] a=s.toCharArray();
		int pre=0,current=0;
		
		while(current<a.length)
		{
			if(a[current]==' ')
			{
				ReverseWord(a,pre,current-1);
				current++;
				pre=current;
				
			}else{
				current++;
			}
		}
		ReverseWord(a,pre,current-1);
		ReverseWord(a,0,current-1);
		
		return new String(a);
	}
	
	
	public static void main(String[] args) {
		String str="how are you";
		System.out.println("ԭ�ַ���Ϊ:"+str);
		System.out.println("�������ַ���Ϊ:"+new StrReverse().Reverse(str));

	}

}
