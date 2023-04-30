public class PersonaCorrecta {
    private int numTelefono; //Cambio tipo de variable de 'String' a 'int'

    public PersonaCorrecta(int numTelefono) {
        this.numTelefono = numTelefono;
    }

    public int getNumTelefono() {
        return numTelefono;
    }

    public void setNumTelefono(int numTelefono) {
        this.numTelefono = numTelefono;
    }

    @Override
    public String toString() {
        return "PersonaCorrecta{" +
                "numTelefono=" + numTelefono +
                '}';
    }
}
