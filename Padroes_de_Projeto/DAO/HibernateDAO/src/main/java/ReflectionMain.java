

import example.hibernate.model.Veiculo;
import java.lang.reflect.Field;
import java.lang.reflect.Method;


public class ReflectionMain {

    public static void main(String[] args) {
        Veiculo n = new Veiculo();
        Class<Veiculo> classe = (Class<Veiculo>) n.getClass();
        Field field[] = classe.getDeclaredFields();
        for (int i = 0; i < field.length; i++) {
            System.out.println("Field :" + field[i]);
        }
        Method metodos[] = classe.getMethods();
        for (int i = 0; i < metodos.length; i++) {
            System.out.println("método:" + metodos[i]);
        }
    }

}
