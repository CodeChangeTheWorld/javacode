import java.util.Arrays;

public class test{
	public static void main(String[] args) {
	   int[] ints= {1,1,1,1,1,1};
	   smoosh(ints);
	   System.out.println(Arrays.toString(ints));
	}
	
	public static void smoosh(int[] ints) {
    int index = 0;
    int i;
    for(i=0;i<ints.length;i++){
        for(int j=i+1;j<ints.length;j++){
          if(ints[i]!=ints[j]){
            ints[index++]= ints[i];
            i=j-1;
            break;
          }
        }
        if(i==ints.length-1){ints[index++]= ints[i];}
    }

	while(index<ints.length){
		ints[index++]= -1;
	}   
  }
}