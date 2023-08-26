import plgAlumnos.Alumno;
import plgAlumnos.Curso;

public class Main {
    public static void main(String[] args) {
        Alumno alumno1=new Alumno("001","Juan Perez","4444","5 calle 8-14");
        Curso cur=new Curso("555","Programacion",500);
        alumno1.agregarCurso(cur);
        alumno1.agregarCurso(new Curso ("12","Derecho",1));
        System.out.println("Nombre del alumno: "+alumno1.getNombre());
        System.out.println("Carnet: "+alumno1.getCarnet());
        //iteracion
        for (Curso curso: alumno1.getCursos()){
            System.out.println("Curso "+curso.getNombre()+" Valor: "+curso.getCosto());
        }

        Alumno alumno01=new Alumno("0012","Polnaref","2001","7 calle 9-5");
        Alumno alumno02=new Alumno("0023","Jolyne","1832","1 calle 10-1");
        Alumno alumno03=new Alumno("0054","Giorno","2512","6 calle 12-7");
        alumno01.agregarCurso(new Curso ("4","Fisica",500));
        alumno01.agregarCurso(new Curso ("2","Calculo",500));

        alumno02.agregarCurso(new Curso ("11","Estadistica",200));
        alumno02.agregarCurso(new Curso ("1","Contabilidad",300));

        alumno03.agregarCurso(new Curso ("8","Manejo",100));
        alumno03.agregarCurso(new Curso ("5","Desarrollo",100));
        System.out.println("-------------------------------------");
        System.out.println("Nombre del alumno: "+alumno01.getNombre());
        System.out.println("Carnet: "+alumno01.getCarnet());
        int suma=0;
        int suma2=0;
        int suma3=0;
        double to=0;
        double gt=0;
        for (Curso curso: alumno01.getCursos()){
            to=to+ curso.getCosto();
            System.out.println("Curso "+curso.getNombre()+" Valor: "+curso.getCosto());
        }
        gt=gt+to;
        System.out.println("Total de suma: "+to);

        System.out.println("-------------------------------------");
        System.out.println("Nombre del alumno: "+alumno02.getNombre());
        System.out.println("Carnet: "+alumno02.getCarnet());

        to=0;
        for (Curso curso: alumno02.getCursos()){
            to=to+ curso.getCosto();
            System.out.println("Curso "+curso.getNombre()+" Valor: "+curso.getCosto());
        }
        gt=gt+to;
        System.out.println("Total de suma: "+to);

        System.out.println("-------------------------------------");
        System.out.println("Nombre del alumno: "+alumno03.getNombre());
        System.out.println("Carnet: "+alumno03.getCarnet());
        for (Curso curso: alumno03.getCursos()){
            System.out.println("Curso "+curso.getNombre()+" Valor: "+curso.getCosto());
            suma3= (int) (curso.getCosto()+curso.getCosto());
        }
        System.out.println("Suma por los dos cursos: "+suma3);
    }
}