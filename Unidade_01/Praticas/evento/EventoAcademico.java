package evento;

public class EventoAcademico {
    private String nomeDoEvento;
    private String localDoEvento;
    private String numeroDeParticipantes;

    public EventoAcademico(String nomeDoEvento, String localDoEvento, String numeroDeParticipantes) {
        if(!nomeDoEvento.isEmpty()){
            this.nomeDoEvento = nomeDoEvento;
        } else {
            nomeDoEvento = "nome vazio";
        }
        this.localDoEvento = localDoEvento;
        this.numeroDeParticipantes = numeroDeParticipantes;
    }

    public void mostraEvento() {
        System.out.println("Nome: " + nomeDoEvento);
        System.out.println("Local: " + localDoEvento);
        System.out.println("Número de Participantes: " + numeroDeParticipantes);
    }
}
