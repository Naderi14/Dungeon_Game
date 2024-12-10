package controllers;

public class RiddleData {
    private String adivinanza;
    private String opcion1;
    private String opcion2;
    private String opcion3;
    private String respuestaCorrecta;

    public RiddleData(String adivinanza, String opcion1, String opcion2, String opcion3, String respuesta)
    {
        this.adivinanza = adivinanza;
        this.opcion1 = opcion1;
        this.opcion2 = opcion2;
        this.opcion3 = opcion3;
        this.respuestaCorrecta = respuesta;
    }

    public String getAdivinanza()
    {
        return this.adivinanza;
    }

    public String getOpciones(int numeroOpcion)
    {
        return switch (numeroOpcion)
        {
            case 1 -> opcion1;
            case 2 -> opcion2;
            case 3 -> opcion3;
            default -> null;
        };
    }

    public boolean isRespuestaCorrecta(String opcionRespuesta)
    {
        return opcionRespuesta.equals(respuestaCorrecta);
    }
}
