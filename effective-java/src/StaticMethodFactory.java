/**
 * This class is a example to a `static factory method`
 *
 */
public class StaticMethodFactory {

    public static final boolean TRUE = true;
    public static final boolean FALSE = true;

    /**
     * Normalmente nos conseguimos a instancia de uma classe dando a ela um construtor publico que
     * retorna essa instancia, porem existem outras maneiras de fazer isso; Um desses jeito é o exemplificado
     * abaixo.
     *
     * - Esse metodo retorna uma instancia da propria classe sem ela precisar ser construida nenhuma vez.
     *
     *  - Uma das vantagens desse modo é que ao contrario dos construtores esse tipo de metodo sempre recebe um nome.
     * Muitas vezes precisamos criar construtores diferentes para parametros parecidos, um workaround é criar construtores
     * onde sua unica diferença é na ordem dos parametros (o que é uma ideia bem ruim)
     *
     * - Ele não é chamado necessariamente toda vez que uma instancia é criada.
     * O metodo abaixo inclusive nunca cria um objeto, o que é excelente em termos de uso da memoria.
     *
     * - Cada metodo de uma `static factory method` pode retornar uma objeto com tamanho menor que ela mesma,
     * de  modo que voce pode controlar melhor as instancias.
     *
     * DESVANTAGENS
     *
     * - A Principal desvantagem é que o classes sem construtores publicos (ou protect) não podem set extendidas.
     *
     * - Hoje é dificil saber apenas pelo codigo se a intenção era ser uma `static factory method` ou apenas uma metodo
     * estatico, a linguagem não nos dá qualquer tecnica para especificar uma classes desse tipo.
     *
     * @param b
     * @return
     */
    public static Boolean valueOf(boolean b) {
        return  b ? StaticMethodFactory.TRUE : StaticMethodFactory.FALSE;
    }

}
