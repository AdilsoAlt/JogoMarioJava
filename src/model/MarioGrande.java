package model;


import static model.EventoOcorrido.*;

public class MarioGrande implements MarioState {

    public static final String MARIO_GRANDE = "MARIO GRANDE";
    @Override
    public void pegarCogumelo(Mario mario) {
        mario.setPontos(1000);
        mario.estadoMario = this;
        mario.setEstadoAnterior(MARIO_GRANDE);
        mario.setEventoOcorrido(PEGAR_COGUMELO);
    }

    @Override
    public void pegarFlor(Mario mario) {
        mario.setEstadoAnterior(MARIO_GRANDE);
        mario.estadoMario = new MarioFogo();
        mario.setEventoOcorrido(PEGAR_FLOR);
    }

    @Override
    public void pegarPena(Mario mario) {
        mario.estadoMario = new MarioCapa();
        mario.setEstadoAnterior(MARIO_GRANDE);
        mario.setEventoOcorrido(PEGAR_PENA);
    }

    @Override
    public void levarDano(Mario mario) {
        mario.estadoMario = new MarioPequeno();
        mario.setEstadoAnterior(MARIO_GRANDE);
        mario.setEventoOcorrido(LEVAR_DANO);
    }

}
