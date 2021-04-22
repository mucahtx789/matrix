import java.util.Scanner;

public class MD2019123078Matris {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		//matris olusturma
		System.out.print("Matris satır sayısını girin:");
		int satir=input.nextInt();
		System.out.print("Matris sütun sayısını girin:");
		int sutun=input.nextInt();
		
		
		int[][] matris=new int[satir][sutun];
		
		//matris'e deger girme
		for (int i = 0; i < satir; i++) {
			for (int j = 0; j < sutun; j++) {
				System.out.print(+i+" satır "+j+" sütuna değer girin:");
				matris[i][j]=input.nextInt();
			}
		}
		
		
		//matris yazdırma
			for (int a = 0; a < satir; a++) {
				for (int b = 0; b < sutun; b++) {
					System.out.print(matris[a][b]+" ");
					
				}	
				System.out.println("");
		}
			
			int determinat;
			//2x2 matris determinat hesaplama
		if (satir==2 && sutun==2) {
			determinat=(matris[0][0]*matris[1][1])-(matris[0][1]*matris[1][0]);
			System.out.println("2x2 Determinat:"+determinat);
		}
		//3x3 matris determinat hesaplama
		if (satir==3 && sutun==3) {
		int	sonuc1=matris[0][0]*((matris[1][1]*matris[2][2])-(matris[1][2]*matris[2][1]));
		int	sonuc2=-(matris[0][1])*((matris[1][0]*matris[2][2])-(matris[1][2]*matris[2][0]));
		int	sonuc3=matris[0][2]*((matris[1][0]*matris[2][1])-(matris[1][1]*matris[2][0]));
		determinat=sonuc1+sonuc2+sonuc3;
		System.out.println("3x3 Determinat=("+sonuc1+")+("+sonuc2+")+("+sonuc3+")="+determinat);
		}	
			
			
			
			
			
	}// main sonu

	
		
	}//class sonu
	

