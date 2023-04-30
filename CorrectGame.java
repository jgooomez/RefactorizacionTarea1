public class CorrectGame {
    CorrectPlayer p;

    //Mejora en las estructuras condicionales.
    public void movement(String m) {
        if (m.equalsIgnoreCase("Derecha")) {
            p.setX(p.getX() + 1);
        } else if (m.equalsIgnoreCase("Izquierda")) {
            p.setX(p.getX() - 1);
        } else if (m.equalsIgnoreCase("Arriba")) {
            p.setY(p.getY() - 1);
        } if (m.equalsIgnoreCase("Abajo")) {
            p.setY(p.getY() + 1);
        }
    }

    //Implementacion de 'Switch'.
    //Mejor legibilidad y menos lineas.
    public void movementSwitch (String m) {
        switch (m) {
            case "Derecha" -> p.setX(p.getX() + 1);
            case "Izquierda" -> p.setX(p.getX() - 1);
            case "Arriba" -> p.setY(p.getY() - 1);
            case "Abajo" -> p.setY(p.getY() + 1);
        }
    }
}
