public class BeerSong{
	public static void main(String[] args){
		int beerNum = 99 ;
		String fs,fs1,word,beer;
	while(beerNum>0){
		if(beerNum==1){word="1 bottle"; beer="no more";} else {word=beerNum+" bottles" beer=String.valueOf(beerNum-1);}
		fs=String.format("%s of beer on the wall, %s of beer.",word, word);
		fs1=String.format("Take one down and pass it around, %s bottles of beer on the wall.",beer);
		System.out.println(fs);
		System.out.println(fs1);
		System.out.println();
		System.out.println();
		beerNum=beerNum-1;
	}
	System.out.println("No more bottles of beer on the wall, no more bottles of beer. ");
	System.out.println("Go to the store and buy some more, 99 bottles of beer on the wall.");
	}
}