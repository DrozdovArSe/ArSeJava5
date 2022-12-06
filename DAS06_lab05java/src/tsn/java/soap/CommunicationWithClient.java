package tsn.java.soap;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

// Указываем специальные аннотации, что класс будет работать в web-технологии SOAP
@WebService
@SOAPBinding(style = Style.RPC)

public class CommunicationWithClient implements ICommunicationWithClient {

    // Решение квадратного уровнения
    @Override
    public AnswerQE quadraticEquation(double a, double b, double x) {
        double y;
        try {
            System.out.println("Значения переменных:\na = " + a + "\nb = " + b + "\nx = " + x);
            if (x > 6) {
                    y = (6*x*x-a*b)/(2*x*x);
                } else {
                    y = 4*(x+a*a+b*b);
                }
            System.out.print("Ответ: Y = " + y);
            if ((Double.isNaN(y)) || (Double.isInfinite(y))) {
                throw new Exception();
            }
            AnswerQE otvet = new AnswerQE(y);
            return otvet;
        } catch (Exception e) {
            return null;
        }
    }

}
