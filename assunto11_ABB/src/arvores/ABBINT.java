package arvores;

public class ABBINT {

	private class ARVORE {
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
		} else if (info < p.dado)
			p.esq = inserir(p.esq, info);
		else
			p.dir = inserir(p.dir, info);
		return p;
	}
	public int contaNos(ARVORE p, int cont) {
		if (p!=null) {
			cont++;
			cont = contaNos(p.esq,cont);
			cont = contaNos(p.dir,cont);
		}
		return cont;
	}
	public void show(ARVORE p) {
		if (p!=null) {
			show(p.esq);
			System.out.print("\t" + p.dado);
			show(p.dir);
		}
	}
	public boolean consulta(ARVORE p, int valor) {
		if (p!=null) {
			if (valor == p.dado)
				return true;
			else if (valor < p.dado)
				return (consulta(p.esq,valor));
			else
				return (consulta(p.dir,valor));
		}
		return false;
	}
	
	public int contaConsulta(ARVORE p, int valor, int cont) {
		if(p!= null) {
			cont++;
			if(valor == p.dado) {
				return cont;
				
			}else if(valor< p.dado) {
				cont = contaConsulta(p.esq, valor, cont);
			}else {
				cont = contaConsulta(p.dir, valor, cont);
			}
		}
		return cont;
		
	}
	
	public int maximo() {
		ARVORE aux = root;
		while(aux.dir !=null) {
			aux = aux.dir;
		}
		
		return aux.dado;
	}
	
	
	public  ARVORE removeValor1(ARVORE p, int info) {
		if (p!=null){
		if(info == p.dado){
		if (p.esq == null && p.dir==null)   //nó a ser removido é nó folha
			return null;
		if (p.esq==null){ //se não há sub-árvore esquerda o ponteiro passa apontar para a sub-árvore direita      
			return  p.dir;
		}
		else{
			if (p.dir==null){   //se não há sub-árvore direita  o ponteiro passa apontar para a sub-árvore esquerda     
		return p.esq;      
			}
			else{  /*o nó a ser retirado possui sub-arvore esquerda e direita, então o nó que  
		           será retirado deve-se encontrar o menor valor na sub-árvore á direita */
		ARVORE aux, ref;
		ref = p.dir;
		aux = p.dir;
		while (aux.esq != null)
		    aux = aux.esq;
		aux.esq = p.esq;
		return ref;
		}
		}
		}
		else{   //procura dado a ser removido na ABB
		if(info<p.dado)
			p.esq = removeValor1(p.esq,info);
		else
			p.dir = removeValor1(p.dir,info);
		}
		}
		return p;
		}
	public  ARVORE removeValor (ARVORE p, int info) {
		if (p!=null){
		if(info == p.dado){
		if (p.esq == null && p.dir==null)   //nó a ser removido é nó folha
			return null;
		if (p.esq==null){ //se não há sub-árvore esquerda o ponteiro passa apontar para a sub-árvore direita      
			return  p.dir;
		}
		else{
			if (p.dir==null){   //se não há sub-árvore direita  o ponteiro passa apontar para a sub-árvore esquerda     
		return p.esq;      
			}
			else{  /*o nó a ser retirado possui sub-arvore esquerda e direita, então o nó que  
		           será retirado deve-se encontrar o menor valor na sub-árvore á direita */
		ARVORE aux, ref;
		ref = p.dir;
		aux = p.dir;
		while (aux.esq != null)
		    aux = aux.esq;
		aux.esq = p.esq;
		return ref;
		}
		}
		}
		else{   //procura dado a ser removido na ABB
		if(info<p.dado)
			p.esq = removeValor1(p.esq,info);
		else
			p.dir = removeValor1(p.dir,info);
		}
		}
		return p;
		}

	
	
	
	
	
}
