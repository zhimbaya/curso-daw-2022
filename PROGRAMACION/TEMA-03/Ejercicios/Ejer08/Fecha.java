package Tema03;

public class Fecha {

    // Atributos
    private int d;
    private int m;
    private int a;

    // Constructores
    public Fecha() {
    }

    public Fecha(int d, int m, int a) {
        if (fechaCorrecta(d, m, a)) {
            this.d = d;
            this.m = m;
            this.a = a;
        }
    }

    public static boolean fechaCorrecta(int d, int m, int a) {
        if (m < 1 || m > 12) {
            return false;
        } else {
            switch (m) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    if (d < 1 || d > 31) {
                        return false;
                    }
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    if (d < 1 || d > 30) {
                        return false;
                    }
                    break;
                default:
                    if (esBisiesto(a) && (d < 1 || d > 29)) {
                        return false;
                    } else if (!esBisiesto(a) && (d < 1 || d > 28)) {
                        return false;
                    }

            }
            return true;
        }
    }

    public static boolean esBisiesto(int a) {
        return (a % 4 == 0 && !(a % 100 == 0 && a % 400 != 0));
    }

    public void diaSiguiente() {
        if (fechaCorrecta(d, m, a)) {
            if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) {
                if (d == 31 && m != 12) {
                    d = 1;
                    m++;
                } else if (d == 31 && m == 12) {
                    a++;
                    m = 1;
                    d = 1;
                } else {
                    d++;
                }
            } else if (m == 4 || m == 6 || m == 9 || m == 11) {
                if (d == 30) {
                    d = 1;
                    m++;
                } else {
                    d++;
                }
            } else if (m == 2) {
                if (esBisiesto(a)) {
                    if (d == 29) {
                        m++;
                        d = 1;
                    } else {
                        d++;
                    }
                } else {
                    if (d == 28) {
                        m++;
                        d = 1;
                    } else {
                        d++;
                    }
                }
            }
        }

    }

    public void diaSiguiente2() {
        int ultDia;
        switch (m) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                ultDia = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                ultDia = 30;
                break;
            default:
                if (esBisiesto(a)) {
                    ultDia = 29;
                } else {
                    ultDia = 28;
                }
        }

        if (d == ultDia && m != 12) {
            d = 1;
            m++;
        } else if (d == ultDia && m == 12) {
            a++;
            m = 1;
            d = 1;
        } else {
            d++;
        }
    }

    public int getD() {
        return d;
    }

    public void setD(int d) {
        if (fechaCorrecta(d, this.m, this.a)) {
            this.d = d;
        }
    }

    public int getM() {
        return m;
    }

    public void setM(int m) {
        if (fechaCorrecta(this.d, m, this.a)) {
            this.m = m;
        }
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        if (fechaCorrecta(this.d, this.m, a)) {
            this.a = a;
        }
    }

    @Override
    public String toString() {
        String dia, mes;
        if (d < 10) {
            dia = "0" + d;
        } else {
            dia = "" + d;
        }
        if (m < 10) {
            mes = "0" + m;
        } else {
            mes = "" + m;
        }
        return dia + "-" + mes + "-" + a;
    }

}
