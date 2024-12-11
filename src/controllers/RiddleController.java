package controllers;
import java.util.HashMap;

public class RiddleController {
    public static HashMap<Integer, RiddleData> adivinanzas = new HashMap<>();

    public static void crearAdivinanzas()
    {
        adivinanzas.put(0, new RiddleData("Van dos y..", "Se cae el de la izquierda", "Se cae el de la derecha", "Se cae tu puta madre", "Se cae tu puta madre"));
        adivinanzas.put(1, new RiddleData("Soy alto cuando soy joven, y bajo cuando soy viejo. ¿Quién soy?", "Una vela", "Una montaña", "Una persona", "Una vela"));
        adivinanzas.put(2, new RiddleData("Cuanto más seco, más mojado. ¿Qué es?", "Una esponja", "Una toalla", "Un paraguas", "Una toalla"));
        adivinanzas.put(3, new RiddleData("¿Qué tiene ciudades pero no casas, montañas pero no árboles, y mares pero no agua?", "Un globo terráqueo", "Un mapa", "Un atlas", "Un mapa"));
        adivinanzas.put(4, new RiddleData("Tengo agujas pero no sirvo para coser. ¿Qué soy?", "Un reloj", "Un cactus", "Una brújula", "Un reloj"));
        adivinanzas.put(5, new RiddleData("¿Qué tiene un ojo pero no puede ver?", "Una aguja", "Una cerradura", "Un espejo", "Una aguja"));
        adivinanzas.put(6, new RiddleData("Si me nombras, desaparezco. ¿Qué soy?", "El silencio", "La sombra", "El aire", "El silencio"));
        adivinanzas.put(7, new RiddleData("Vuelo sin alas, lloro sin ojos. ¿Qué soy?", "El viento", "Una nube", "Un tornado", "Una nube"));
        adivinanzas.put(8, new RiddleData("Tengo dientes pero no puedo morder. ¿Qué soy?", "Un peine", "Un serrucho", "Una llave", "Un peine"));
        adivinanzas.put(9, new RiddleData("Camina sin pies, vuela sin alas, silba sin boca. ¿Qué es?", "El viento", "La sombra", "El río", "El viento"));
        adivinanzas.put(10, new RiddleData("Si te caes en mí, me mojarás. ¿Quién soy?", "Un río", "El agua", "La lluvia", "El agua"));
        adivinanzas.put(11, new RiddleData("Tengo manos pero no puedo aplaudir. ¿Qué soy?", "Un reloj", "Un muñeco", "Un árbol", "Un reloj"));
        adivinanzas.put(12, new RiddleData("Entre más quitas, más grande me hago. ¿Qué soy?", "Un hoyo", "Una sombra", "El aire", "Un hoyo"));
        adivinanzas.put(13, new RiddleData("Tengo cuello pero no cabeza. ¿Qué soy?", "Una botella", "Un jarrón", "Un cisne", "Una botella"));
        adivinanzas.put(14, new RiddleData("Vuelo todo el día, pero no salgo del sitio. ¿Qué soy?", "Una veleta", "Un colibrí", "Un mosquito", "Una veleta"));
        adivinanzas.put(15, new RiddleData("Siempre estoy en el medio del mar. ¿Qué soy?", "La letra A", "La letra M", "La letra R", "La letra A"));
        adivinanzas.put(16, new RiddleData("Subo y bajo, pero nunca me muevo. ¿Qué soy?", "Un termómetro", "Un ascensor", "Una montaña rusa", "Un termómetro"));
        adivinanzas.put(17, new RiddleData("Mientras más hay de mí, menos ves. ¿Qué soy?", "La oscuridad", "La niebla", "El humo", "La oscuridad"));
        adivinanzas.put(18, new RiddleData("Tiene llaves pero no cerraduras. ¿Qué soy?", "Un piano", "Una puerta", "Un candado", "Un piano"));
        adivinanzas.put(19, new RiddleData("Me puedes romper sin tocarme. ¿Qué soy?", "Una promesa", "Un vidrio", "Un silencio", "Una promesa"));
        adivinanzas.put(20, new RiddleData("Todos me pueden abrir, pero nadie me puede cerrar. ¿Qué soy?", "Un huevo", "Un libro", "Un sobre", "Un huevo"));
        adivinanzas.put(21, new RiddleData("Camina sobre mi espalda pero nunca deja huellas. ¿Qué soy?", "Un puente", "Una alfombra", "Un piso", "Un puente"));
        adivinanzas.put(22, new RiddleData("Vuelo sin motor, pero no soy pájaro. ¿Qué soy?", "Una cometa", "Un avión", "Una pluma", "Una cometa"));
        adivinanzas.put(23, new RiddleData("Llena la casa pero no ocupa espacio. ¿Qué soy?", "La luz", "El aire", "El humo", "La luz"));
        adivinanzas.put(24, new RiddleData("No tiene vida, pero crece. ¿Qué es?", "El fuego", "Un cristal", "Una sombra", "El fuego"));
        adivinanzas.put(25, new RiddleData("Tiene cuernos pero no es animal. ¿Qué es?", "Una luna", "Un caracol", "Un dilema", "Una luna"));
        adivinanzas.put(26, new RiddleData("Cuanto más quitas, más dejo atrás. ¿Qué soy?", "Las huellas", "Un camino", "Un túnel", "Las huellas"));
        adivinanzas.put(27, new RiddleData("Cuando me nombras, dejo de existir. ¿Qué soy?", "El silencio", "Un secreto", "Una sombra", "El silencio"));
        adivinanzas.put(28, new RiddleData("Tiene patas pero no camina. ¿Qué es?", "Una mesa", "Una cama", "Un banco", "Una mesa"));
        adivinanzas.put(29, new RiddleData("Tiene orejas pero no escucha. ¿Qué es?", "Una taza", "Una silla", "Un jarrón", "Una taza"));
        adivinanzas.put(30, new RiddleData("No puedo hablar, pero siempre respondo. ¿Qué soy?", "Un eco", "Un espejo", "Un robot", "Un eco"));
        adivinanzas.put(31, new RiddleData("Tengo una cola pero no soy animal. ¿Qué soy?", "Una cometa", "Un globo", "Una moneda", "Una cometa"));
        adivinanzas.put(32, new RiddleData("Tengo una cara pero no ojos. ¿Qué soy?", "Un reloj", "Una moneda", "Un dado", "Una moneda"));
        adivinanzas.put(33, new RiddleData("Siempre corro pero nunca me muevo. ¿Qué soy?", "Un río", "Un reloj", "Un carril", "Un río"));
        adivinanzas.put(34, new RiddleData("Soy más ligera que el aire, pero no puedes atraparme. ¿Qué soy?", "Una burbuja", "El humo", "El pensamiento", "Una burbuja"));
        adivinanzas.put(35, new RiddleData("Es tuyo pero lo usan más los demás. ¿Qué es?", "Tu nombre", "Tu tiempo", "Tu sombra", "Tu nombre"));
        adivinanzas.put(36, new RiddleData("Tengo orejas pero no escucho y duermo con zapatos. ¿Qué soy?", "Una cama", "Un zapato", "Una alfombra", "Una cama"));
        adivinanzas.put(37, new RiddleData("No tiene alas pero vuela. ¿Qué es?", "El tiempo", "El pensamiento", "El viento", "El tiempo"));
        adivinanzas.put(38, new RiddleData("Va subiendo, va bajando y no se mueve. ¿Qué es?", "Una escalera", "Un ascensor", "Una cuerda", "Una escalera"));
        adivinanzas.put(39, new RiddleData("Es más grande que un elefante, pero no pesa nada. ¿Qué es?", "Su sombra", "El aire", "Un pensamiento", "Su sombra"));
        adivinanzas.put(40, new RiddleData("Tiene ojos pero no ve, y una cola que mueve. ¿Qué es?", "Una aguja", "Un pez", "Una cometa", "Una aguja"));
        adivinanzas.put(41, new RiddleData("No se come pero sabe muy bien. ¿Qué es?", "Una broma", "El azúcar", "La miel", "Una broma"));
        adivinanzas.put(42, new RiddleData("Siempre va pero nunca llega. ¿Qué es?", "El mañana", "El horizonte", "El futuro", "El mañana"));
        adivinanzas.put(43, new RiddleData("Es redondo pero no rueda. ¿Qué es?", "Un plato", "Un reloj", "Una moneda", "Un plato"));
        adivinanzas.put(44, new RiddleData("Tiene una cola pero no es animal. ¿Qué es?", "Una moneda", "Un cometa", "Una cuerda", "Una moneda"));
        adivinanzas.put(45, new RiddleData("Se estira pero nunca se rompe. ¿Qué es?", "El chicle", "La piel", "El tiempo", "El tiempo"));
        adivinanzas.put(46, new RiddleData("Siempre te sigue pero nunca te alcanza. ¿Qué es?", "Tu sombra", "Tu reflejo", "Un sueño", "Tu sombra"));
        adivinanzas.put(47, new RiddleData("No es un ser vivo, pero tiene raíces. ¿Qué es?", "Un árbol", "Una sombra", "Un diente", "Un diente"));
        adivinanzas.put(48, new RiddleData("Tiene cuartos pero no habitaciones. ¿Qué es?", "Una casa", "Una moneda", "Un reloj", "Un reloj"));
        adivinanzas.put(49, new RiddleData("Siempre está delante de ti pero nunca lo alcanzas. ¿Qué es?", "El futuro", "Tu reflejo", "Tu sombra", "El futuro"));
    }
}
