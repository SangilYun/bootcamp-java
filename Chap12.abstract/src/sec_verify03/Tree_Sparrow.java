package sec_verify03;

public class Tree_Sparrow extends Animal{

	public Tree_Sparrow() {
		this.kind = "조류";
	}
	
	@Override
	public void sound() {
		System.out.println(this.kind + "인 참새가 소리를 냅니다. 짹짹!");
	}
}
