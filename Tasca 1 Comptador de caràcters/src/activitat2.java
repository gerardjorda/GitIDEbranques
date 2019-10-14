import net.xaviersala.generador.Generador;
import java.util.*;
public class activitat2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Generador generador = new Generador();
		String[] llista2 = generador.getCaracters(10);
		
		//Convertim el array en una array list i creem una segona arraylist auxiliar.
		
		ArrayList<String> llista  = new ArrayList<String>(Arrays.asList(llista2));
		ArrayList<String> clean = new ArrayList<String>();
		
		
		//Utilitem el arraylist hashSet perque no pot tindre guardats valors repetits.
		Set<String> hashSet = new HashSet<String>(llista);
       
		//Pasem els valors no repetits a la arraylist auxiliar.
        clean.addAll(hashSet);
       
        //Crem una array on hi guardarem el total de repeticions dels valors de l'array auxiliar.
        int [] count = new int[clean.size()];
        
        
		
		System.out.println("----------");
		
		//Contem quantes vegades surt cada valor.
		for(int i=0;i<clean.size();i++ )
		{
			for(int j=0;j<llista.size();j++)
			{
				if(clean.get(i)==llista.get(j))
				{
					count[i]++;
				}
			}
		}
		
		//Creem un arraylist auxiliar de l'array on tenim el numero de repeticions.
		int [] ordenada = new int[clean.size()];
		
		ordenada = count;
		
		//Pasem els valors de l'array count a la auxiliar de aquesta i ordenem els seus valors de més gran a més petit.
		for(int i=0;i<(ordenada.length-1);i++){
            for(int j=i+1;j<ordenada.length;j++){
                if(ordenada[i]<ordenada[j]){
                    int variableauxiliar=ordenada[i];
                    ordenada[i]=ordenada[j];
                    ordenada[j]=variableauxiliar;
 
                }
            }	
		}
		
		//Treim per pantalla els 4 valors que surten primers en l'array ordenada. Per saber quina lletra es de cada valor, comparem els numeros i les posicions de
		//aquestes amb les altres arrays.
		for(int i=0; i<4;i++)
		{
			for(int j =0;j<clean.size();j++)
			{
				if(ordenada[i]==count[j])
				{
					System.out.println((i+1) + ". Posició la lletra "+ clean.get(j) + " amb un total de: " + ordenada[i]);
				}
			}
		}
		
		
		
	}

}
