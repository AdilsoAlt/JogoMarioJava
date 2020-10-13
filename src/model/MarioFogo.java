package model;

import static model.EventoOcorrido.*;

public class MarioFogo implements MarioState {

    public static final String MARIO_FOGO = "MARIO FOGO";
    @Override
    public void pegarCogumelo(Mario mario) {
        mario.setPontos(1000);
        mario.estadoMario = this;
        mario.setEstadoAnterior(MARIO_FOGO);
        mario.setEventoOcorrido(EventoOcorrido.PEGAR_COGUMELO);
    }

    @Override
    public void pegarFlor(Mario mario) {
        mario.setPontos(1000);
        mario.estadoMario = this;
        mario.setEstadoAnterior(MARIO_FOGO);
        mario.setEventoOcorrido(PEGAR_FLOR);
    }

    @Override
    public void pegarPena(Mario mario) {
        mario.estadoMario = this;
        mario.setEstadoAnterior(MARIO_FOGO);
        mario.setEventoOcorrido(PEGAR_PENA);
    }

    @Override
    public void levarDano(Mario mario) {
        mario.estadoMario = new MarioGrande();
        mario.setEstadoAnterior(MARIO_FOGO);
        mario.setEventoOcorrido(LEVAR_DANO);
    }
}
