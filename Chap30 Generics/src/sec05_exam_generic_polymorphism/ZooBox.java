package sec05_exam_generic_polymorphism;

//Box를 상속받고 ZooBox에 추가할 객체를 Animal 하위클래스로 제한함. 
public class ZooBox <T extends Animal> extends Box<T> {

}
