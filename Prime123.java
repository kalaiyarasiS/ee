public class Prime123{
public static void main(String[] args) {	
int input1=366;
	int a[]={11,13,17,19,23,29,31,37,41,43,47,51,53,59,61,67,71,73,79,83,87,89,91,97};
	for(int j=0;j<a.length;j++){
		if(input1==a[j]){
			System.out.println("1");
		}
      }	
	if(input1<22){
			System.out.println("-1");
		}
			for(int j=0;j<a.length;j++){
				for(int k=0;k<a.length;k++){
					int c=a[j]+a[k];
				if(c==input1){
				System.out.println("2");
								}
				}
			}
		for(int j=0;j<a.length;j++){
			for(int k=0;k<a.length;k++){
				for(int l=0;l<a.length;l++){
					int c=a[j]+a[k]+a[l];
					if(c==input1){
						System.out.println("3");
			
					}
				}
			}
		}for(int j=0;j<a.length;j++){
			for(int k=0;k<a.length;k++){
				for(int l=0;l<a.length;l++){
					for(int m=0;m<a.length;m++){
					int c=a[j]+a[k]+a[l]+a[m];
					if(c==input1){
						System.out.println("4");
								}
					}
				}
	}
}for(int j=0;j<a.length;j++){
	for(int k=0;k<a.length;k++){
		for(int l=0;l<a.length;l++){
			for(int m=0;m<a.length;m++){
               for(int o=0;o<a.length;o++){
				int c=a[j]+a[k]+a[l]+a[m]+a[o];
			if(c==input1){
				System.out.println("5");
			
	             }
               }
			}
		}
	}
}System.out.println("0");
}
}
