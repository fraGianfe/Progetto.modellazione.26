package it.unicam.cs.mpgc.rpg125956;

public interface Ambiente {
    String getNome();
    TipoAmbiente getTipo();
    List<Risorsa> getRisorseDisponibili();
    List<Nemico> getNemiciPresenti();
    String getDescrizione()
}
