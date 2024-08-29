package arvores;

public class ABBInt {

//	Arvore de Busca Binaria
	
	private class ARVORE{
		int dado;
		ARVORE esq, dir;
	}
	
	public ARVORE root = null;
	
	public ARVORE inserir(ARVORE p, int info) {
		// insere elemento em uma ABB
		if (p == null) {
			p = new ARVORE();
			p.dado = info;
			p.esq = null;
			p.dir = null;
		}
		else if (info < p.dado) 
			p.esq= inserir (p.esq, info);
		     else
			p.dir=inserir(p.dir, info);	
		return p;
		}

	
	public void show(ARVORE p) {
		if(p!=null) {
			show(p.esq);
			System.out.println("\t" +p.dado);
			show(p.dir);
		}
		
	}


	public int contaNos(ARVORE p, int cont) {
		if(p!=null) {
			cont++;
			cont = contaNos(p.esq, cont);
			cont = contaNos(p.dir, cont);
			
		}
		
		
		
		return cont;
	}
	
	
	
}
