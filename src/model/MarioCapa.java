package model;

import static model.EventoOcorrido.*;

public class MarioCapa implements MarioState {
    public static final String MARIO_CAPA = "MARIO CAPA";

    @Override
    public void pegarCogumelo(Mario mario) {
        mario.setPontos(1000);
        mario.estadoMario = this;
        mario.setEstadoAnterior(MARIO_CAPA);
        mario.setEventoOcorrido(PEGAR_COGUMELO);
    }

    @Override
    public void pegarFlor(Mario mario) {
        mario.estadoMario = new MarioFogo();
        mario.setEstadoAnterior(MARIO_CAPA);
        mario.setEventoOcorrido(PEGAR_FLOR);
    }

    @Override
    public void pegarPena(Mario mario) {
        mario.setPontos(1000);
        mario.estadoMario = this;
        mario.setEstadoAnterior(MARIO_CAPA);
        mario.setEventoOcorrido(PEGAR_PENA);
    }

    @Override
    public void levarDano(Mario mario) {
        mario.estadoMario = new MarioGrande();
        mario.setEstadoAnterior(MARIO_CAPA);
    }
}
