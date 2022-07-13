package home.proto.simpleBlog.common;

import org.aspectj.lang.JoinPoint;

/** 메서드 로깅 어드바이스
 * 
 * 메서드가 호출되어 실행될 때의 메서드 이름을 콘솔에 출력합니다.
 * 
 * @author ato41
 */
public class MethodLogAdvice {
	
	public void beforePrintMethodInfo(JoinPoint joinPoint) {
		
		// org.aspectj.lang.JoinPoint
		System.out.println("### [메서드 호출] - 메서드 이름 :: " + joinPoint.getSignature().getName());
		System.out.println("### [메서드 호출] - 파라미터 :: " + joinPoint.getArgs());
	}
}
