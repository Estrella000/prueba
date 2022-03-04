//añado comentarios

package fechas;

public class Fecha {

    private int dia;
    private int mes;
    private int anio;

    public Fecha(int d, int m, int a) {
        this.dia = d;
        this.mes = m;
        this.anio = a;
    }

    public boolean valida() {
        if (dia < 1 || dia > 31) {
            return false;
        }
        if (mes < 1 || mes > 12) {
            return false;
        }
       
        return (dia <= diasMes());
    }

    public int diasMes() {
        // determinamos la cantidad de días del mes:
        int diasMes = 0;
        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                diasMes = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                diasMes = 30;
                break;
            case 2: // verificación de año bisiesto
                if (esBisiesto()) {
                    diasMes = 29;
                } else {
                    diasMes = 28;
                }
                break;
        }
        return diasMes;
    }

    public boolean esBisiesto() {
        return (anio % 400 == 0)
                || ((anio % 4 == 0) && (anio % 100 != 0));
    }

    public static void main(String[] args) {
        Fecha hoy = new Fecha(29, 2, 2022);
        System.out.println("la fecha " + hoy.dia + " de " + hoy.mes + " de " + hoy.anio);
        if (hoy.valida()) {
            System.out.println(" es valida");
        } else {
            System.out.println(" no es valida");
        }
    }
}
