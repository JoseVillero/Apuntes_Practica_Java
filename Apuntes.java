//
//import java.util.*;
//
//public class Apuntes {
//    public static void main(String[] args) {
//      //~~~~~~~~~~~~~~~~~~~~~~~~~ Datos primitivos ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
//      byte //Representa un tipo de dato de 8 bits con signo. De tal manera que puede almacenar los valores numéricos de -128 a 127 (ambos inclusive).
//
//      short //Representa un tipo de dato de 16 bits con signo. De esta manera almacena valores numéricos de -32.768 a 32.767.
//
//      int //Es un tipo de dato de 32 bits con signo para almacenar valores numéricos. Cuyo valor mínimo es -2^31 y el valor máximo 2^31-1.
//
//      long //Es un tipo de dato de 64 bits con signo que almacena valores numéricos entre -2^63 a 2^63-1
//
//      float  //Es un tipo dato para almacenar números en coma flotante con precisión simple de 32 bits.
//
//      double //Es un tipo de dato para almacenar números en coma flotante con doble precisión de 64 bits.
//
//      boolean  //Sirve para definir tipos de datos booleanos. Es decir, aquellos que tienen un valor de true o false. Ocupa 1 bit de información.
//
//      char  //Es un tipo de datos que representa a un carácter Unicode sencillo de 16 bits.
//
//        //~~~~~~~~~~~~~~~~~~~~~~~~  Datos clase wrapper y arreglos dinamicos  ~~~~~~~~~~~~~~~~~~~~~~~~~~
//        // Estos tipos de clases manejas datos  clase wrapper Interger, Double, String   // Permitiendo 'envolver' los datos primitivos y trabajarlos como si fueran obejetos, con metodos.
//        // La clase Number es la superclase de las clase wrappers: Byte, Short, Double, Long, Interger, Float.
//        // para valores booleanos su clase es Boolean y para char la clase es Character
//        // Por buenas practicas hay que referirse siempre a la interface (List) no a la clases ArrayList, LinkedList o Vector etc.
//        // al no especificar con <> se asume que es de cualquier tipo de objetos.
//        // Vector es la mas antigua, y se accede de manera sincronizada (Hilo por hilo) la cual reduce el rendimiento
//        // ArrayList: Es la implementación más utilizada ya que no obliga a sincronizar el acceso.
//        // LinkedList: Es una implementación a través de una lista doblemente enlazada lo cual nos permite un mayor
//        // rendimiento cuando insertamos o eliminamos elementos en medio de la lista.
//
//
//        // El constructor solo recibe de parametros, uno vacio, o un entero para la capacidad o un objeto tipo coleccion
//        List vc = new ArrayList();      // instanciamos una lista vc de tipo ArrayList. con el parametro new
//        // Este ArrayList admite todo tipo de datos al no estar especificado (<wrapper class>)
//        vc.add(50);  // con el metodo add agregamos un objeto de la clase Interger a la lista ArrayList vc
//        vc.add(89);
//        // Importante
//        System.out.println((int) vc.get(0) + (int) vc.get(1)); // al ser dos objetos para sumarlos hay que hacer un cast
//        // por medio de la sintaxis (int) object;
//
//        // La clase Iterator permite iterar sobre las colecciones como un bucle.
//
//
//        //~~~~~~~~~~~~~~~~~~~~~  Arrarys simples y multidimensionales MATRICES ~~~~~~~~~~~~~~~~~~~~~~~~
//        // Declaracion de un array simple de enteros con limite de 5 elementos
//        // Estos array manejas datos primitivos
//        // se puede asignar o remover elementos solo con sintaxis de [indice]
//        // para mas metodos y funciones es requerido invocar la clase Arrays la cual permite la manipulacion de arrays
//        // la Clase Arrays esta ubicada en java.util
//        // Esta clase proporciona múltiples métodos para manipular Arrays sobre múltiples tipos de datos T: primitivos
//        int arr[] = new int[5];
//        arr[5] = 56;
//        System.out.println(arr.length);
//        int intArray[] = {1, 2, 3, 4, 5};      // Array inicializado y declarado en la misma linea
//
//        int fgh[] = new int[5];
//        Arrays.fill(fgh, 56);   // Llena el array con el valor indicado: todos los elementos iguales.
//        System.out.println(Arrays.toString(fgh));   // Genera una cadena para impresión.
//        // tambien hay metodos para ordenar o copiar el array
//
//        double matrix[][] = new double[5][2]; // Declaracion de una matriz con 5 filas y dos columnas
//        int matirx2[][] = {{12, 3}, {15, 2}, {56, 89}};   // declaracion de una matriz de 3 filas por 2 columnas
//
//
//        // ~~~~~~~~~~~~~~~~~~~~~~ CASTING y PARSE  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
//        // Para hacer un cast o parse de String a double o float utilizamos
//        //De String a int:
//        String cadena1 = "123";
//        int entero = Integer.parseInt(cadena1);
//        //De String a float:
//        String cadena2 = "1.23";
//        float flotante = Float.parseFloat(cadena2);
//        //De String a double:
//        String cadena3 = "12.3";
//        double decimal = Double.parseDouble(cadena3);
//        // numero a cadena
//        //Convertir número en cadena con método toString()
//        int numero1 = 720;
//        String cadena1 = Integer.toString(numero1);
//        //Convertir número en cadena con método valueOf()
//        int numero2 = 728;
//        String cadena2 = String.valueOf(numero2);
//        // De objeto a dato primario
//        System.out.println((int) vc.get(0) + (int) vc.get(1)); // al ser dos objetos para sumarlos hay que hacer un cast
//        // por medio de la sintaxis (int) object;
//
//        //~~~~~~~~~~~~~~~~~~~~~~~~~  Conjuntos o SET ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
//        // Los conjuntos pertenecen ala interfaz set. la cual esta asociada a la interfaz collection
//        // Las clase HashSet se usa para iterar conjuntos sin orden especifico bajo una estructura hash
//        // la clase LinkedHashSet es otro tipo de conjuntos
//        // y la clase TreeSet es usada para crear conjuntos con ordenamiento para facilitar la busqueda pertence a
//        // SORTEDSET bajo una estructura arbol
//
//        String[] lista = {"HOLA", "AMIGOS", "COMO", "ESTAN", "USTEDES", "USTEDES", "HOLA"}; // Array de String
//
//        List nuevaLista = Arrays.asList(lista);     // convertimos un array en lista. No se puede convertir un array a conjunto
//
//        Set conjunto = new TreeSet(nuevaLista);     // convertimos una lista en conjunto ordenado
//        // El constructor solo recibe de parametros, uno vacio, o un entero para la capacidad o un objeto tipo coleccion
//        System.out.println(conjunto);
//
//        // la interfaz set hereda todos lo metodos de collection sin agregar uno mas. por lo que los metodos addAll,
//        // retainAll, removeAll se pueden identificar como union, interseccion, y diferencia respectivamente. La opercion
//        // contains equivale a permanencia de conjuntos. y la operaracion containsAll corresponde a subconjunto.
//        // Se usa hashCode para formar conjuntos del tipo
//        // Para conjuntos inmodificables podemos usar Set.of o Set.copyOf
//
//
//        // ~~~~~~~~~~~~~~~~~~~~~~~~~~   DICCIONARIOS O HASHMAP ~~~~~~~~~~~~~~~~~~~~~~~~~~~~
//        // Un HashMap en Java es una tabla hash basado en una implementación de la interfaz Map de Java, el cual será
//        //  una colección de Key-value (clave-valor). Un HashMap permite nulos y no se encuentra ordenada.
//        // El Hasmap pertenece a la interfaz Map, con sus metodos.
//
//        // El constructor solo recibe de parametros, uno vacio, o un entero para la capacidad o un objeto tipo coleccion
//        Map dic = new HashMap();        // Instancio un HashMap vacio para recibir cualquier tipo de dato
//        // ~~~~~~~~~~~~~~~~~~~~~~~METODOS HASHMAP  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~`
//        dic.put("HOLA", "MAMA");     //Con put vamos a obtener un valor por su key y sobreescribir encima su valor. En el caso en el que esa key no exista, se creará la key con su valor
//        // asocia el valor a la clave . devuelve el valor que estaba asociado anteriormente, o NULL si no había nada para esa clave.
//        System.out.println(dic.get("HOLA"));    // devuelve el valor asociado a la clave indicada
//
//        // keySet() devuelve el conjunto de claves
//        //  remove(Object clave) elimina la clave y el valor asociado; devuelve el valor que estaba asociado anteriormente, o NULL si no había nada para esa clave
//        // size() número de asociaciones { clave, valor }
//        // values() devuelve una estructura de datos iterable sobre los valores asociados
//        // Containskey() nos devuelve valor false o true si existe la clave.
//        // containsValue() Devuelve true si existe el valor
//        // Merge() nos va a permitir insertar una key/value específica en el hashmap sino esta presente. Merge -> unirse o fundirse
//        // compute(Key, BiFunction) nos permitirá la actualización de un valor dentro de un HashMap. Se actualizará un valor para una clave dada y su valor actual.
//        // El valor será null si la clave no se encuentra.
//
//        Object c = dic.put("HOLA", "PAPA");  // Usamos la clase Object para capturar objetos, en este caso el valor anterior que tenia la clave.
//        // par valores con nullpointer java 8 implementa getOrDefault() anadiendo un valor para cuando no exista la clave
//        // ejemplo para inicializar un contador
//
//
//        // ~~~~~~~~~~~~~~~~~~~~~~~~~~~  OPERADORES LOGICOS Y ARITMETICOS  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
//        // ==   igual que
//        // !=   distintos que
//        // <,<=,>,>=   menor, menor o igual que, mayor, mayor o igual que
//        // && operador and (Y)
//        // || operador or (O)
//        // ! operador not (NO)
//
//        // PRIORIDADES
//
//        //  ()      parentesis
//        // ^        potencia
//        // *, /     multiplicacion, division
//        // +, -     suma, resta
//        // %        modulo
//        // =,<>     operadores igual, menor, mayor, menor o igual, mayor o igual
//        // !        no se cumple que (NO)
//        // &&       y se cumple que (Y)
//        // ||       o se cumple que (O)
//
//        // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ BUCLES, CICLOS O LOOP ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
//        // WHILE
//        // Permite ejecutar un grupo de instrucciones mientras se cumpla una condición dada:
//        // while (expresion booleana){
//        // instrucciones
//        // }
//        //
//        // DO WHILE
//        // Similar al anterior, sólo que la condición se evalúa al final del ciclo y no al principio:
//        // do { instrucciones
//        // }while(expresion booleana);
//        //
//        // SWITCH
//        // Permite que el programa tome diferentes rutas de ejecucion de acuerdo al valor de una variable determinada
//        // al momento en el que se llega al inicio de la sentencia.
//        // la expresión puede ser tipos de datos primitivos byte, short, char e int.
//        // A partir de JDK7, también funciona con tipos enumerados (Enum en java), la clase String y las clases Wrapper
//        // La declaración break es opcional. Si se omite, la ejecución continuará en el siguiente case.
//        // La instrucción default es opcional, y debe aparecer al final del switch.
//        // Nos permite ahorrar código que con if tomarían muchos anidamientos
//        // switch (variable) {
//        //      case opcion 1:
//        //             sentencia1;
//        //             sentencia2;
//        //             break;
//        //             }
//        //
//        // FOR
//        // para ejecutar en forma repetida una serie de instrucciones
//        // for (declararar variable; condicion booleana; incremento ++){
//        // instrucciones
//        // }
//        //
//        // FOR EACH
//        // Se usa comúnmente para iterar sobre un array o una clase de colecciones (por ejemplo, ArrayList)
//        // En lugar de declarar e inicializar una variable contador del bucle, declara una variable que es del mismo
//        // tipo que del array.
//        // for (tipo variable : array) {
//        //      instrucciones;
//        // }
//        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ ITERAR SOBRE ARREGLOS ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
//        // Hay muchas maneras de iterar en arreglos con el fin de obtener la suma, el maximo, el minimo o promedio
//        // de este. La forma tradicional es usando el ciclo for tradicional o el ciclo for each, para recorrer el arreglo
//        // Otra manera es usar la INTERFAZ 'collection' esta es la interfaz raiz de todas las interfaces y clases
//        // relacionadas con colecciones de elementos. En esta interfaz se encuentra la clase 'collections' la cual permite
//        // realizar operaciones de iteracion con el arreglo.
//        // Metodo  con collections:
//        Integer arr[] = {1, 5, 68, 8, 9, 456, 3496, 489};         // el metodo asList no funciona con datos primarios
//        int maximo = Collections.max(Arrays.asList(arr));
//        System.out.println(maximo);
//        // Metodo con for each
//        int valorMaximo = Integer.MIN_VALUE;  // Estable un valor minimo para la clase entero 32bits (una constante )
//        for (int i : arr) {
//            valorMaximo = Math.max(valorMaximo, i);
//        }
//        System.out.println(valorMaximo);
//        //Metodo Stream
//        // Las nuevas versiones de java incorporan la clase stream la cual permite de manera facil iterar sobre colleciones
//        // con la filosfia de programacion funcional. la clase stream simplifica y ahorra mucho codigo pero hay que tener
//        // en cuenta que las versiones mas anteriores a java el codigo stream no funcionaria
//        valorMaximo = Arrays.stream(arr).max();  // como recibe de parametros una collecion con objetos de clase wrapper
//        // para trabajar con datos primarios hay que usar y llamar tambien al metodo
//        // getAsInt : valorMaximo = Arrays.stream(arr).max().getAsInt;
//        //
//        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ PROGRAMACIÓN ORIENTADA A OBJETOS ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
//        // En el paradigma de programación orientada a objetos, se basa en la anologia de que en nuestro mundo esta compuesto
//        // de objetos y estos a su vez pertenecen a una clase. Es decir los objetos son instancias de una clase y heredan
//        // de esta sus caracteristicas (Atributos) y sus acciones (Metodos). Las caracteristicas o atributos de una clase
//        // se pueden establecer como privadas (encapsular) de esta manera los atributos solo son accecibles desde la propia
//        // clase y no desde el programa principal. Para modificar dichos atributos privados se requiere crear un metodo que
//        // permita modificar o declarar los atributos y a su vez permite instanciarlo, este metodo es llamado contructor.
//        // el constructor establece que parametros va a recibir el objeto al ser creado, permitiendo declararlo e instanciarlo
//        // inmediatamente. Como los atributos estan privados y al utilizar un constructor declaramos sus valores, no hay manera
//        // de poder verificar sus valores fuera de la clase, por lo que es necesario crear un metodo para tener acceso de lectura
//        // de estos. Este metodo es llamado get. (getter) este metodo nos permite acceder a los valores de los atributos fuera de la
//        // clase (private). El metodo setter al contrario de getter permite la modificacion de los valores de los atributos
//        // bajo ciertas condiciones o logica que nosotros le indiquemos al metodo. De esta manera creamos objetos con sus
//        // respectivas clases a las que pertenecen.
//        // Si no declaramos un contructor java establece uno por defecto. El constructor es opcional
//        //
//        //
//        // Ejemplo:
//        public class persona {                    // CLASE PERSONA LA CUAL ES PUBLICA
//
//            ///   ATRIBUTOS DE LA CLASE PERSONA.
//            private String nombre, apellido;     ///    LOS ATRIBUTOS SON PRIVADOS, SOLO SON ACCECIBLES DENTRO DE LA CLASE
//            private int edad;
//
//            public persona(String nombre, String apellido) {        /// METODO CONSTRUCTOR DE LA CLASE PERSONA PARA INSTANCIAR LOS OBJETOS DE ESTA
//                this.nombre = nombre;           /// RECIBE DE PARAMETROS DOS VARIABLES DEL MISMO TIPO DEL ATRIBUTO QUE SE DESEA DECLARAR E INSTANCIAR
//                this.apellido = apellido;       /// SE UTILIZA EL PARAMETRO this PARA REFERIRSE A QUE ATRIBUTO DE CLASE  SE LE VA A ASIGNAR EL PARAMETRO INGRESADO
//                /// EL CONSTRUCTOR ES PUBLICO PORQUE SE REQUIERE ACCEDER A EL DESDE FUERA DE LA CLASE.
//            }                                   /// PARA SOBRECARGAR UN CONSTRUCTOR SOLO SE REPITE O SE ESCRIBE NUEVAMENTE EL CONSTRUCTOR CON LOS NUEVOS PARAMETROS A RECIBIR
//
//            public persona() {                   /// CONSTRUCTOR SOBRECARGADO. /// this SIRVE PARA LA SOBRECARGA DE CONSTRUCTORES, PARA EVITAR AMBIGUEDADES O PARA REFERIRSE A METODOS
//
//            }
//
//            public String getNombre() {          /// EL GETTER ES PUBLICO PORQUE SE REQUIERE ACCEDER A EL DESDE FUERA DE LA CLASE
//                return this.nombre;                  /// TIENE EL MISMO TIPO DEL ATRIBUTO A TRATAR. Y TIENE COMO RETORNO EL VALOR REFERIDO AL ATRIBUTO DE CLASE
//            }
//
//            public String getApellido() {        /// GETTER APELLIDO
//                return this.apellido;
//            }
//
//            int obtenerEdad() {                 /// UNA METODO ESTILO GETTER QUE RETORNA EL VALOR DE LA EDAD
//                return edad;
//            }
//
//            public void setEdad(int edad) {      /// LOS SETTER PERMITEN MODIFICAR LOS ATRIBUTOS DESDE FUERA DE LA CLASE BAJO CIERTAS CONDICIONES
//                if (edad > 0) {                  // QUE NOSOTROS LE INDIQUEMOS EN EL METODO. DEBEN SER PUBLICOS PARA SER ACCEDIDOS DESDE FUERA DE LA CLASE
//                    this.edad = edad;           // AL NO RETORNAR NADA SE ESTABLECEN COMO VOID. Y RECIBEN DE PARAMETROS, EL MISMO TIPO DE ATRIBUTO A MODIFICAR.
//                }
//            }
//
//            void saludar() {                                 // METODOS DE LA CLASE, EL CUAL SE LLAMA SALUDAR, E IMPRIME EN CONSOLA UN SALUDO
//                System.out.println("HOLA COMO ESTAS");      // EL METODO ES PUBLICO, YA QUE POR DEFECTO CUANDO NO SE ESTIPULA, EL VALOR QUE TOMA ES PUBLICO.
//            }
//
//            public void saludar(String apellido) {
//                System.out.println("HOLA COMO ESTAS" + "SOY " + apellido);    // PARA LA SOBRECARGA DE METODOS ES POSIBLE RERERISE A ELLOS MISMO TENIENDO CUIDADO DE NO INVOCARLOS RECURSIVAMENTE
//            }                                                               // CON EL FIN DE EVITAR UN LOOP STACKOVERFLOW ERROR
//
//            @Override
//            public String toString() {                                      // POR MEDIO DE OVERRIDE SOBRESCRIBIMOS EL METODO toString  CON EL EL PROPOSITO DE
//                return "persona{" +                                         // MOSTRAR LOS VALORES EN MEMORIA DEL OBJETO Y DE QUE EL NOMBRE DEL OBJETO NO APUENTE A LA REFERENCIA DE ESTE
//                        "nombre='" + nombre + '\'' +
//                        ", apellido='" + apellido + '\'' +
//                        ", edad=" + edad +
//                        '}';
//            }
//        }
//
//
//        persona hombre = new persona("JOSE", "VILLERO");   // OBJETO hombre INSTANCIADO DE LA CLASE PERSONA CON ATRIBUTOS DE NOMBRE Y APELLIDOS
//        hombre.setEdad(32);             // POR MEDIO DEL SETTER MODIFICAMOS EL ATRIBUTO EDAD
//        System.out.println(hombre.getNombre());  // POR MEDIO DEL GETTER ACCEDEMOS AL VALOR DEL ATRIBUTO NOMBRE
//        hombre.saludar();               // EL OBJETO HOMBRE POR MEDIO DEL METODO SALUDAR IMPRIME EN CONSOLA UN SALUDO
//
//        // LA HERENCIA NOS AYUDA A NO REPETIR CODIGO EN NUESTRO PROYECTO. UNA CLASE PUEDE SER UNA SUBCLASE DE OTRA (clase hija), HEREDANDO LOS METODOS Y ATRIBUTOS DE LA CLASE PADRE.
//        // LA SUBCLASE HEREDA LOS METODOS Y ATRIBUTOS PUBLICOS (PUBLIC) Y PROTEGIDOS (PROTECTED) DE LA CLASE PADRE MAS LOS METODOS DE LA CLASE OBJECT (LO NO PRIVADO).  TODAS LAS CLASES HEREDAN DE LA CLASE
//        // OBJECT SUS METODOS. LOS METODOS Y ATRIBUTOS HEREDADOS PUEDEN SER USADOS COMO SI FUERAN PROPIOS USANDO LA PALABRA CLAVE this, A MENOS QUE SE ESTEN SOBREESCRIBIENDO. DE ESTA FORMA SE
//        // PUEDE REDEFINIR LOS METODOS DE SU SUPERCLASE (CLASE PADRE). LOS CONSTRUCTORES DE LA SUPERCLASE NO SE HEREDAN PERO SE PUEDEN LLAMAR DESDE LOS CONSTRUCTORES DE LA SUBCLASE.
//        // JAVA IMPLEMENTA LA HERENCIA SIMPLE: SOLO PERMITE QUE UNA CLASE TENGA UNA SOLA CLASE PADRE. AL CONTRARIO QUE LA HERENCIA MULTIPLE (PYTHON) QUE PERMITE QUE UNA CLASE TENGA MAS DE UNA
//        // CLASE PADRE, QUE HEREDE DE MAS DE UNA SUPERCLASE.
//        // PARA INDICAR QUE UNA CLASE HEREDA DE OTRA, UTILIZAMOS LA PALABRA CLAVE extends.
//        // LOS CONSTRUCTORES DE LA CLASE PADRE NO SE HEREDAN.
//
//        public class extraterrestre extends persona{
//
//        }
//        // PARA SOBRESCRIBIR UN METODO EN LA CLASE HIJA USAMOS LA PALABRA CLAVE @Override, COLOCANDOLA ENCIMA DEL METODO QUE VAMOS A MODIFICAR
//        // TAMBIEN USAMOS LA PALABRA CLAVE super PARA ACCEDER AL METODO DE LA CLASE PADRE, PARECIDO COMO LO HACEMOS CON this PARA METODOS O ATRIBUTOS EN LA CLASE ACTUAL.
//
//    }
//}