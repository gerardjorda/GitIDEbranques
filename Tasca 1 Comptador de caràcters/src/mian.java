import net.xaviersala.generador.Generador;

public class mian {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Generador generador = new Generador();
		String[] llista = generador.getCaracters();
		
		int [] count = new int[3];
		
		//Canvis el IDE
		for(int i=0; i<llista.length; i++)
		{
			if(llista[i]=="X")
			{
				count[0]++;
			}
			if(llista[i]=="O")
			{
				count[1]++;
			}
			if(llista[i]=="H")
			{
				count[2]++;
			}
		}
		
		System.out.println("-------------------");
		System.out.println("x: " + count[0] + " o: " + count[1] + " h:" + count[2]);
		System.out.println("-------------------");
		
		//Guardem els numeros i els relacionem en acada lletra.
		
		int x = count[0];
		int h = count[2];
		int o = count[1];
		
		//Ordanem l'array on hem contant cada lletra de més gran a més petit.
		
		for(int i=0;i<(count.length-1);i++){
            for(int j=i+1;j<count.length;j++){
                if(count[i]<count[j]){
                    int variableauxiliar=count[i];
                    count[i]=count[j];
                    count[j]=variableauxiliar;
 
                }
            }	
		}
		 
		//Treiem els 2 primers numeros. Comparem els numeros que han sortit amb els numeros de cada lletra aixi sabem quina lletre ha sortit.
		
		for(int i=0;i<2;i++)
		{
			if(count[i]==x)
			{
				System.out.println("La x esta en la posició " + (i+1));
			}
			if(count[i]==h)
			{
				System.out.println("La h esta en la posició " + (i+1));
			}
			if(count[i]==o)
			{
				System.out.println("La o esta en la posició " + (i+1));
			}
			
		}
		

}
}
