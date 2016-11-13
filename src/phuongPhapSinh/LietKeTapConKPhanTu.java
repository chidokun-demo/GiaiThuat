/**
 * 
 */
package phuongPhapSinh;

/**
 * @author Tuan
 *
 */
public class LietKeTapConKPhanTu {
	/**
	 * 
	 * @param n Giới hạn trên của tập cha [1,2,3,...,n]
	 * @param k Số phần tử tập con
	 */
	public static void LietKe(int n, int k) {
		//khởi tạo tập cha
		int[] tapCha = new int[n];
		for(int i = 0; i < n;i++)
			tapCha[i]=i+1;
		
		int i;
		do{
			//in ra tập con hiện tại
			for(int l = 0; l < k; l++)
				System.out.print(tapCha[l] + " ");
			System.out.println();
			
			//tìm phần tử chưa đạt giới hạn trên n-k+i
			i = k;
			while(i>=0 && tapCha[i] == n-k+i)
				i--;
			
			if (i >= 0)
			{
				tapCha[i]++;
				for(int j = i+1;j < k;j++)
					tapCha[j]=tapCha[j]+1;
			}
		}while(i>=0);
		
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LietKe(5, 3);
	}

}
