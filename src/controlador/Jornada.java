package controlador;

public class Jornada {

    public String[] grupos;

    public void gruposMateria(int cantidadGrupos) {
        switch (cantidadGrupos) {
            case 1:
                grupos = new String[1];
                grupos[0] = "GT I";
                break;
            case 2:
                grupos = new String[2];
                grupos[0] = "GT I";
                grupos[1] = "GT II";
                break;
            case 3:
                grupos = new String[3];
                grupos[0] = "GT I";
                grupos[1] = "GT II";
                grupos[2] = "GT III";
                break;
            case 4:
                grupos = new String[4];
                grupos[0] = "GT I";
                grupos[1] = "GT II";
                grupos[2] = "GT III";
                grupos[3] = "GT IV";
                break;
            case 5:
                grupos = new String[5];
                grupos[0] = "GT I";
                grupos[1] = "GT II";
                grupos[2] = "GT III";
                grupos[3] = "GT IV";
                grupos[4] = "GT V";
                break;
            case 6:
                grupos = new String[6];
                grupos[0] = "GT I";
                grupos[1] = "GT II";
                grupos[2] = "GT III";
                grupos[3] = "GT IV";
                grupos[4] = "GT V";
                grupos[5] = "GT VI";
                break;
            case 7:
                grupos = new String[7];
                grupos[0] = "GT I";
                grupos[1] = "GT II";
                grupos[2] = "GT III";
                grupos[3] = "GT IV";
                grupos[4] = "GT V";
                grupos[5] = "GT VI";
                grupos[6] = "GT VII";
                break;
            case 8:
                grupos = new String[8];
                grupos[0] = "GT I";
                grupos[1] = "GT II";
                grupos[2] = "GT III";
                grupos[3] = "GT IV";
                grupos[4] = "GT V";
                grupos[5] = "GT VI";
                grupos[6] = "GT VII";
                grupos[7] = "GT VIII";
                break;
            case 9:
                grupos = new String[9];
                grupos[0] = "GT I";
                grupos[1] = "GT II";
                grupos[2] = "GT III";
                grupos[3] = "GT IV";
                grupos[4] = "GT V";
                grupos[5] = "GT VI";
                grupos[6] = "GT VII";
                grupos[7] = "GT VIII";
                grupos[8] = "GT IX";
                break;
            case 10:
                grupos = new String[10];
                grupos[0] = "GT I";
                grupos[1] = "GT II";
                grupos[2] = "GT III";
                grupos[3] = "GT IV";
                grupos[4] = "GT V";
                grupos[5] = "GT VI";
                grupos[6] = "GT VII";
                grupos[7] = "GT VIII";
                grupos[8] = "GT IX";
                grupos[9] = "GT X";
                break;
            case 11:
                grupos = new String[11];
                grupos[0] = "GT I";
                grupos[1] = "GT II";
                grupos[2] = "GT III";
                grupos[3] = "GT IV";
                grupos[4] = "GT V";
                grupos[5] = "GT VI";
                grupos[6] = "GT VII";
                grupos[7] = "GT VIII";
                grupos[8] = "GT IX";
                grupos[9] = "GT X";
                grupos[10] = "GT XI";
                break;
            case 12:
                grupos = new String[12];
                grupos[0] = "GT I";
                grupos[1] = "GT II";
                grupos[2] = "GT III";
                grupos[3] = "GT IV";
                grupos[4] = "GT V";
                grupos[5] = "GT VI";
                grupos[6] = "GT VII";
                grupos[7] = "GT VIII";
                grupos[8] = "GT IX";
                grupos[9] = "GT X";
                grupos[10] = "GT XI";
                grupos[11] = "GT XII";
                break;
            case 13:
                grupos = new String[13];
                grupos[0] = "GT I";
                grupos[1] = "GT II";
                grupos[2] = "GT III";
                grupos[3] = "GT IV";
                grupos[4] = "GT V";
                grupos[5] = "GT VI";
                grupos[6] = "GT VII";
                grupos[7] = "GT VIII";
                grupos[8] = "GT IX";
                grupos[9] = "GT X";
                grupos[10] = "GT XI";
                grupos[11] = "GT XII";
                grupos[12] = "GT XIII";
                break;
            case 14:
                grupos = new String[14];
                grupos[0] = "GT I";
                grupos[1] = "GT II";
                grupos[2] = "GT III";
                grupos[3] = "GT IV";
                grupos[4] = "GT V";
                grupos[5] = "GT VI";
                grupos[6] = "GT VII";
                grupos[7] = "GT VIII";
                grupos[8] = "GT IX";
                grupos[9] = "GT X";
                grupos[10] = "GT XI";
                grupos[11] = "GT XII";
                grupos[12] = "GT XIII";
                grupos[13] = "GT IX";
                break;
            case 15:
                grupos = new String[15];
                grupos[0] = "GT I";
                grupos[1] = "GT II";
                grupos[2] = "GT III";
                grupos[3] = "GT IV";
                grupos[4] = "GT V";
                grupos[5] = "GT VI";
                grupos[6] = "GT VII";
                grupos[7] = "GT VIII";
                grupos[8] = "GT IX";
                grupos[9] = "GT X";
                grupos[10] = "GT XI";
                grupos[11] = "GT XII";
                grupos[12] = "GT XIII";
                grupos[13] = "GT XIV";
                grupos[14] = "GT XV";
                break;
            default:
                break;
        }
    }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public String timecatjor;
    public String hora;
    public String dia;

    public void matrizC(int fila, int columna) {
/////////////////////////////////////////////////////////////////06:45AM-07:35AM
        if (fila == 0 & columna == 1) {
            timecatjor = "L11";
            hora = "06:45-07:35";
            dia = "Lunes";
        } else if (fila == 0 & columna == 2) {
            timecatjor = "M12";
            hora = "06:45-07:35";
            dia = "Martes";
        } else if (fila == 0 & columna == 3) {
            timecatjor = "M13";
            hora = "06:45-07:35";
            dia = "Miercoles";
        } else if (fila == 0 & columna == 4) {
            timecatjor = "J14";
            hora = "06:45-07:35";
            dia = "Jueves";
        } else if (fila == 0 & columna == 5) {
            timecatjor = "V15";
            hora = "06:45-07:35";
            dia = "Viernes";
        }
///////////////////////////////////////////////////////////////////7:35AM-8:25AM
        if (fila == 1 & columna == 1) {
            timecatjor = "L21";
            hora = "07:35-08:25";
            dia = "Lunes";
        } else if (fila == 1 & columna == 2) {
            timecatjor = "M22";
            hora = "07:35-08:25";
            dia = "Martes";
        } else if (fila == 1 & columna == 3) {
            timecatjor = "M23";
            hora = "07:35-08:25";
            dia = "Miercoles";
        } else if (fila == 1 & columna == 4) {
            timecatjor = "J24";
            hora = "07:35-08:25";
            dia = "Jueves";
        } else if (fila == 1 & columna == 5) {
            timecatjor = "V25";
            hora = "07:35-08:25";
            dia = "Viernes";
        }
///////////////////////////////////////////////////////////////////8:25AM-9:15AM
        if (fila == 2 & columna == 1) {
            timecatjor = "L31";
            hora = "08:25-09:15";
            dia = "Lunes";
        } else if (fila == 2 & columna == 2) {
            timecatjor = "M32";
            hora = "08:25-09:15";
            dia = "Martes";
        } else if (fila == 2 & columna == 3) {
            timecatjor = "M33";
            hora = "08:25-09:15";
            dia = "Miercoles";
        } else if (fila == 2 & columna == 4) {
            timecatjor = "J34";
            hora = "08:25-09:15";
            dia = "Jueves";
        } else if (fila == 2 & columna == 5) {
            timecatjor = "V35";
            hora = "08:25-09:15";
            dia = "Viernes";
        }
//////////////////////////////////////////////////////////////////9:15AM-10:05AM
        if (fila == 3 & columna == 1) {
            timecatjor = "L41";
            hora = "09:15-10:05";
            dia = "Lunes";
        } else if (fila == 3 & columna == 2) {
            timecatjor = "M42";
            hora = "09:15-10:05";
            dia = "Martes";
        } else if (fila == 3 & columna == 3) {
            timecatjor = "M43";
            hora = "09:15-10:05";
            dia = "Miercoles";
        } else if (fila == 3 & columna == 4) {
            timecatjor = "J44";
            hora = "09:15-10:05";
            dia = "Jueves";
        } else if (fila == 3 & columna == 5) {
            timecatjor = "V45";
            hora = "09:15-10:05";
            dia = "Viernes";
        }
/////////////////////////////////////////////////////////////////10:05AM-10:55AM
        if (fila == 4 & columna == 1) {
            timecatjor = "L51";
            hora = "10:05-10:55";
            dia = "Lunes";
        } else if (fila == 4 & columna == 2) {
            timecatjor = "M52";
            hora = "10:05-10:55";
            dia = "Martes";
        } else if (fila == 4 & columna == 3) {
            timecatjor = "M53";
            hora = "10:05-10:55";
            dia = "Miercoles";
        } else if (fila == 4 & columna == 4) {
            timecatjor = "J54";
            hora = "10:05-10:55";
            dia = "Jueves";
        } else if (fila == 4 & columna == 5) {
            timecatjor = "V55";
            hora = "10:05-10:55";
            dia = "Viernes";
        }
/////////////////////////////////////////////////////////////////10:55AM/11:45AM
        if (fila == 5 & columna == 1) {
            timecatjor = "L61";
            hora = "10:55-11:45";
            dia = "Lunes";
        } else if (fila == 5 & columna == 2) {
            timecatjor = "M62";
            hora = "10:55-11:45";
            dia = "Martes";
        } else if (fila == 5 & columna == 3) {
            timecatjor = "M63";
            hora = "10:55-11:45";
            dia = "Miercoles";
        } else if (fila == 5 & columna == 4) {
            timecatjor = "J64";
            hora = "10:55-11:45";
            dia = "Jueves";
        } else if (fila == 5 & columna == 5) {
            timecatjor = "V65";
            hora = "10:55-11:45";
            dia = "Viernes";
        }
/////////////////////////////////////////////////////////////////11:45AM-12:35AM
        if (fila == 6 & columna == 1) {
            timecatjor = "L71";
            hora = "11:45-12:35";
            dia = "Lunes";
        } else if (fila == 6 & columna == 2) {
            timecatjor = "M72";
            hora = "11:45-12:35";
            dia = "Martes";
        } else if (fila == 6 & columna == 3) {
            timecatjor = "M73";
            hora = "11:45-12:35";
            dia = "Miercoles";
        } else if (fila == 6 & columna == 4) {
            timecatjor = "J74";
            hora = "11:45-12:35";
            dia = "Jueves";
        } else if (fila == 6 & columna == 5) {
            timecatjor = "V75";
            hora = "11:45-12:35";
            dia = "Viernes";
        }
/////////////////////////////////////////////////////////////////01:00PM-01:50PM
        if (fila == 7 & columna == 1) {
            timecatjor = "L81";
            hora = "13:00-13:50";
            dia = "Lunes";
        } else if (fila == 7 & columna == 2) {
            timecatjor = "M82";
            hora = "13:00-13:50";
            dia = "Martes";
        } else if (fila == 7 & columna == 3) {
            timecatjor = "M83";
            hora = "13:00-13:50";
            dia = "Miercoles";
        } else if (fila == 7 & columna == 4) {
            timecatjor = "J84";
            hora = "13:00-13:50";
            dia = "Jueves";
        } else if (fila == 7 & columna == 5) {
            timecatjor = "V85";
            hora = "13:00-13:50";
            dia = "Viernes";
        }
/////////////////////////////////////////////////////////////////01:50PM-02:40PM
        if (fila == 8 & columna == 1) {
            timecatjor = "L91";
            hora = "13:50-14:40";
            dia = "Lunes";
        } else if (fila == 8 & columna == 2) {
            timecatjor = "M92";
            hora = "13:50-14:40";
            dia = "Martes";
        } else if (fila == 8 & columna == 3) {
            timecatjor = "M93";
            hora = "13:50-14:40";
            dia = "Miercoles";
        } else if (fila == 8 & columna == 4) {
            timecatjor = "J94";
            hora = "13:50-14:40";
            dia = "Jueves";
        } else if (fila == 8 & columna == 5) {
            timecatjor = "V95";
            hora = "13:50-14:40";
            dia = "Viernes";
        }
/////////////////////////////////////////////////////////////////02:40PM-03:30PM
        if (fila == 9 & columna == 1) {
            timecatjor = "L101";
            hora = "14:40-15:30";
            dia = "Lunes";
        } else if (fila == 9 & columna == 2) {
            timecatjor = "M102";
            hora = "14:40-15:30";
            dia = "Martes";
        } else if (fila == 9 & columna == 3) {
            timecatjor = "M103";
            hora = "14:40-15:30";
            dia = "Miercoles";
        } else if (fila == 9 & columna == 4) {
            timecatjor = "J104";
            hora = "14:40-15:30";
            dia = "Jueves";
        } else if (fila == 9 & columna == 5) {
            timecatjor = "V105";
            hora = "14:40-15:30";
            dia = "Viernes";
        }
/////////////////////////////////////////////////////////////////03:30PM-04:20PM
        if (fila == 10 & columna == 1) {
            timecatjor = "L111";
            hora = "15:30-16:20";
            dia = "Lunes";
        } else if (fila == 10 & columna == 2) {
            timecatjor = "M112";
            hora = "15:30-16:20";
            dia = "Martes";
        } else if (fila == 10 & columna == 3) {
            timecatjor = "M113";
            hora = "15:30-16:20";
            dia = "Miercoles";
        } else if (fila == 10 & columna == 4) {
            timecatjor = "J114";
            hora = "15:30-16:20";
            dia = "Jueves";
        } else if (fila == 10 & columna == 5) {
            timecatjor = "V115";
            hora = "15:30-16:20";
            dia = "Viernes";
        }
/////////////////////////////////////////////////////////////////04:20PM-05:10PM
        if (fila == 11 & columna == 1) {
            timecatjor = "L121";
            hora = "16:20-17:10";
            dia = "Lunes";
        } else if (fila == 11 & columna == 2) {
            timecatjor = "M122";
            hora = "16:20-17:10";
            dia = "Martes";
        } else if (fila == 11 & columna == 3) {
            timecatjor = "M123";
            hora = "16:20-17:10";
            dia = "Miercoles";
        } else if (fila == 11 & columna == 4) {
            timecatjor = "J124";
            hora = "16:20-17:10";
            dia = "Jueves";
        } else if (fila == 11 & columna == 5) {
            timecatjor = "V125";
            hora = "16:20-17:10";
            dia = "Viernes";
        }
/////////////////////////////////////////////////////////////////05:10PM-06:00PM
        if (fila == 12 & columna == 1) {
            timecatjor = "L131";
            hora = "17:10-18:00";
            dia = "Lunes";
        } else if (fila == 12 & columna == 2) {
            timecatjor = "M132";
            hora = "17:10-18:00";
            dia = "Martes";
        } else if (fila == 12 & columna == 3) {
            timecatjor = "M133";
            hora = "17:10-18:00";
            dia = "Miercoles";
        } else if (fila == 12 & columna == 4) {
            timecatjor = "J134";
            hora = "17:10-18:00";
            dia = "Jueves";
        } else if (fila == 12 & columna == 5) {
            timecatjor = "V135";
            hora = "17:10-18:00";
            dia = "Viernes";
        }
/////////////////////////////////////////////////////////////////06:00PM-06:50PM
        if (fila == 13 & columna == 1) {
            timecatjor = "L141";
            hora = "18:00-18:50";
            dia = "Lunes";
        } else if (fila == 13 & columna == 2) {
            timecatjor = "M142";
            hora = "18:00-18:50";
            dia = "Martes";
        } else if (fila == 13 & columna == 3) {
            timecatjor = "M143";
            hora = "18:00-18:50";
            dia = "Miercoles";
        } else if (fila == 13 & columna == 4) {
            timecatjor = "J144";
            hora = "18:00-18:50";
            dia = "Jueves";
        } else if (fila == 13 & columna == 5) {
            timecatjor = "V145";
            hora = "18:00-18:50";
            dia = "Viernes";
        }
/////////////////////////////////////////////////////////////////06:50PM-07:40PM
        if (fila == 14 & columna == 1) {
            timecatjor = "L151";
            hora = "18:50-19:40";
            dia = "Lunes";
        } else if (fila == 14 & columna == 2) {
            timecatjor = "M152";
            hora = "18:50-19:40";
            dia = "Martes";
        } else if (fila == 14 & columna == 3) {
            timecatjor = "M153";
            hora = "18:50-19:40";
            dia = "Miercoles";
        } else if (fila == 14 & columna == 4) {
            timecatjor = "J154";
            hora = "18:50-19:40";
            dia = "Jueves";
        } else if (fila == 14 & columna == 5) {
            timecatjor = "V155";
            hora = "18:50-19:40";
            dia = "Viernes";
        }
/////////////////////////////////////////////////////////////////07:40PM-08:30PM
        if (fila == 15 & columna == 1) {
            timecatjor = "L161";
            hora = "19:40-20:30";
            dia = "Lunes";
        } else if (fila == 15 & columna == 2) {
            timecatjor = "M162";
            hora = "19:40-20:30";
            dia = "Martes";
        } else if (fila == 15 & columna == 3) {
            timecatjor = "M163";
            hora = "19:40-20:30";
            dia = "Miercoles";
        } else if (fila == 15 & columna == 4) {
            timecatjor = "J164";
            hora = "19:40-20:30";
            dia = "Jueves";
        } else if (fila == 15 & columna == 5) {
            timecatjor = "V165";
            hora = "19:40-20:30";
            dia = "Viernes";
        }
    }

}
