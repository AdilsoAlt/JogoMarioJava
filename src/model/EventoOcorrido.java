package model;

public enum EventoOcorrido {
    PEGAR_PENA("PEGAR PENA"),
    LEVAR_DANO("LEVAR DANO"),
    PEGAR_COGUMELO("PEGAR COGUMELO"),
    PEGAR_FLOR("PEGAR FLOR");

    private String frase;

    EventoOcorrido(String frase) {
        this.frase = frase;
    }

    @Override
    public String toString() {
        return frase;
    }
}
