package model;

public class Mario  {


    protected MarioState estadoMario; // variável de controle para saber em qual estado se encontra nosso amigo MarioBros;
    private EventoOcorrido eventoOcorrido ;
    private String estadoAnterior = "";
    private Integer pontos = 0;


    public MarioState getEstadoMario() {
        return estadoMario;
    }

    public Mario() {
        estadoMario = new MarioPequeno();
    }

    public void  pegarCogumelo (){
        estadoMario.pegarCogumelo(this);
    }
    public void  pegarFlor (){
        estadoMario.pegarFlor(this);
    }
    public void  pegarPena (){
        estadoMario.pegarPena(this);
    }
    public void  levarDano (){
        estadoMario.levarDano(this);
    }

    @Override
    public String toString() {
        return "Mario{" +
                "estadoMario=" + estadoMario +
                ", eventoOcorrido='" + eventoOcorrido + '\'' +
                ", estadoAnterior='" + estadoAnterior + '\'' +
                ", pontos=" + pontos +
                '}';
    }

    public void setEstadoMario(MarioState estadoMario) {
        this.estadoMario = estadoMario;
    }

    public EventoOcorrido getEventoOcorrido() {
        return eventoOcorrido;
    }

    public void setEventoOcorrido(EventoOcorrido eventoOcorrido) {
        this.eventoOcorrido = eventoOcorrido;
    }

    public String getEstadoAnterior() {
        return estadoAnterior;
    }

    public void setEstadoAnterior(String estadoAnterior) {
        this.estadoAnterior = estadoAnterior;
    }

    public Integer getPontos() {
        return pontos;
    }

    public void setPontos(Integer pontos) {
        this.pontos += pontos;
    }


}