package model;

import static model.EventoOcorrido.*;

public class MarioPequeno implements MarioState {

    public static final String MARIO_PEQUENO = "MARIO PEQUENO";
    @Override
    public void pegarCogumelo(Mario mario) {
        mario.setEstadoAnterior(MARIO_PEQUENO);
        mario.estadoMario = new MarioGrande();
        mario.setEventoOcorrido(EventoOcorrido.PEGAR_COGUMELO);
    }

    @Override
    public void pegarFlor(Mario mario) {
        mario.estadoMario = new MarioFogo();
        mario.setEstadoAnterior(MARIO_PEQUENO);
        mario.setEventoOcorrido(PEGAR_FLOR);
    }

    @Override
    public void pegarPena(Mario mario) {
        mario.estadoMario = new MarioCapa();
        mario.setEstadoAnterior(MARIO_PEQUENO);
        mario.setEventoOcorrido(PEGAR_PENA);
    }

    @Override
    public void levarDano(Mario mario) {
        mario.estadoMario = new MarioMorto();
        mario.setEstadoAnterior(MARIO_PEQUENO);
        mario.setEventoOcorrido(LEVAR_DANO);
    }
}
