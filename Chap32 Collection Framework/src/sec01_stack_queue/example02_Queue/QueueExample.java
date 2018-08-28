package sec01_stack_queue.example02_Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		 //Message객체를 저장할 수 있는 즉, Queue인터페이스를 구현한 LinkedList를 생성함
		Queue<Message> messageQueue = new LinkedList<Message>();
		
		messageQueue.offer(new Message("sendMail","홍길동"));
		messageQueue.offer(new Message("sendSMS","신은혁"));
		messageQueue.offer(new Message("sendKakaotalk","Kim"));
		messageQueue.offer(new Message("sendFaceBook","Lee"));

		while(!messageQueue.isEmpty()) {
			//Queue에 저장되어 있는 message객체를 가져온다. (FIFO)
			Message message = messageQueue.poll();
			switch(message.getCommand()) {
			case "sendMail" :
				System.out.println(message.getTo() + "에게 메일을 보냅니다.");
				break;
			case "sendSMS" :
				System.out.println(message.getTo() + "에게 SMS을 보냅니다.");
				break;
			case "sendKakaotalk" :
				System.out.println(message.getTo() + "에게 Kakaotalk을 보냅니다.");
				break;
			case "sendFaceBook" :
				System.out.println(message.getTo() + "에게 facebook 메세지를 보냅니다.");
				break;
			}
		}
	}
}
