estructura-de-datos
Repositorio para almacenar los ejercicios realizados en clases de estructura

1. ¿Cómo escalar este sistema para 10.000 estudiantes?
lo normal es intentar conservar el codigo solo cambiando el tamaño, cosa que nos viablepor lo tanto la mejor opcion es
cambiar la estructura.

1. ¿Qué estructura usarías si el número de estudiantes cambia?
usar un ArrayList<Double> notas = new ArrayList<>();
al usar un punto .add incrementa su tamaño.

2. ¿Qué sucede si hay 1000 sensores?
va a funcionar, pero es un desperdicio de memoria.

2. ¿Qué estructura usarías en tiempo real?
usando un ArrayList<ArrayList<Integer>> sensores = new ArrayList<>();

