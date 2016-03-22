class DogTestDrive{
	public static void main(String[] args) {
	Dog[] dogs= new Dog[3];
	dogs[1]= new Dog();
	dogs[2]= new Dog();
	dogs[0]= new Dog();
	dogs[1].size =1;
	dogs[2].size =1;
	dogs[0].size =1;
	Dog[] dogs2=dogs.clone();
	dogs2[2].size= 80;
	for(int i=0;i<3;i++)
		dogs[i].bark();
	}
}