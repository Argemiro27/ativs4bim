	package atividadequartbim;

	public class Pessoa {
		private String nome;
		private String datanasc;
		private double altura;

		public Pessoa(String nome, String datanasc, double altura) { 
			this.nome = nome;
			this.datanasc = datanasc;
			this.altura = altura;
		}
		
		public void setNome(String nome) {
			this.nome = nome;
		}

		public void setDataNasc(String datanasc) {
			this.datanasc = datanasc;
		}

		public void setAltura(double altura) {
			this.altura = altura;
		}
		
		public String getNome() {
			return (this.nome);
		}

		public String getDataNasc() {
			return (this.datanasc);
		}
		
		public double getAltura() {
			return (this.altura);
		}
		
		public void imprimirDados() {
			System.out.println(this.nome);
			System.out.println(this.datanasc);
			System.out.println(this.altura);
		}	

		public void calcularIdade() {
			String aux = String.valueOf(StringDataNasc.charAt(6) +""+ 
			StringDataNasc.charAt(7) +""+ StringDataNasc.charAt(8) +""+ 
			StringDataNasc.charAt(9)); 
			int AnoNasc = Integer.parseInt(aux);
			int idade = 2022 - AnoNasc;
		}
	}

	public class Agenda {
		public void armazenaPessoa;
		public void removePessoa;
		public int buscaPessoa;
		public void imprimeAgenda;
		public void imprimePessoa;
		private static int total_pessoas;
		private String nome;
		private Int idade;
		private float altura;
		setnome.add(i, nome);

		public void quantpessoas(int qtdade) {
			total_pessoas = qtdade;
			nome = new char[qtdade];
		}

		public void armazenaPessoa(String nome, int idade, float altura){
			System.out.println(this.nome);
			nome = new Scanner(System.in);
			System.out.println(this.idade));
			idade = new Scanner(System.in);
			System.out.println(this.altura));
			altura = new Scanner(System.in);
		}
		
		public void removePessoa(String nome){
			removePessoa.remove(this.nome);
			return System.out.println("Pessoa removida com sucesso!");
		}
		
		public int buscaPessoa(String nome){
			int posicao = -1;
			for (int i = 0; i < total_pessoas; i++) {
				if (setNome.get(i).equals(nome)) {
					position = i;
				}
			}
			return posicao;
		}

		public void imprimeAgenda(){
			int posicao = -1;
			for (int i = 0; i < total_pessoas; i++) {
					System.out.println(this.nome);
					System.out.println(this.idade));
					System.out.println(this.altura));
				
			}
		}
		
		public void imprimePessoa(int index){
			int posicao = -1;
			for (int i = 0; i < total_pessoas; i++) {
				if (setnome.get(i)){
					System.out.println(this.nome + index);
					System.out.println(this.idade + index));
					System.out.println(this.altura + index));
				}
			}
		}
	}
