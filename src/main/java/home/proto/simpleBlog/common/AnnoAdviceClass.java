package home.proto.simpleBlog.common;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

@Service // [@Service] :: Spring Container에 해당 클래스(AnnoAdviceClass) 빈 등록
@Aspect  // [@Aspect]  :: Spring Container야 Aspect로 인식하세요
public class AnnoAdviceClass {
	
	@Pointcut("execution(* home.proto.simpleBlog..*Impl.*(..))")
	public void refMethod() {
		// 포인트컷을 참조하기위한 참조용 메서드로 몸통만 존재하고 구현부가 없다.
	}
	
	@Before("refMethod()") // 참조할 포인트컷의 함수를 적어준다.
	public void aspectMethod(JoinPoint jp) {
		
		String methodName = jp.getSignature().getName();
		
		Object[] parameters = jp.getArgs();
		
		
		// 비즈니스 메서드를 호출 할 때 사용 될 메서드, 구현부를 작성한다.
		System.out.println("### [Annotation AOP] - before :: MethodName [" + methodName + "]");
		
		for(var ii = 0; ii < parameters.length; ii++) {
			System.out.println("### [Annotation AOP] - before :: parameter [" + ii + "] - :: " + parameters[ii]);
		}
	}
}
