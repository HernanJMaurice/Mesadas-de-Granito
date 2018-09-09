package mesadaspackage;

import java.util.Arrays;

public class Constructora {

		public int resolver(Mesada mesadas[]) {
			int [] apilableEnOtras= new int[mesadas.length];
			int cantidad=0;
			int i=0;
			
			for(i=0; i< mesadas.length; i++) {
				for(int j=0; j<mesadas.length; j++) {
					if(i!=j) {
						if(mesadas[i].apilableEn(mesadas[j])) {
							cantidad++;
						}
					}
				}
				apilableEnOtras[i]=cantidad;
				cantidad=0;
			}
			
			Arrays.sort(apilableEnOtras);

			int menor = apilableEnOtras[0];
			int cantidadConI=0;
			int filas=0;
			i=0;
			
			while(i<apilableEnOtras.length) {
				while( i<apilableEnOtras.length && menor == apilableEnOtras[i]) {
					cantidadConI++;
					i++;
				}
				if(menor!=0) {
					filas += cantidadConI/(menor+1);
				}else {
					filas=cantidadConI;
				}
				if(i<apilableEnOtras.length) {
					menor=apilableEnOtras[i];
				}
				cantidadConI=0;
			}
 
			return filas;
		}		
		
}
