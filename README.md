# Geometria em Java

Projeto simples em **Java** para cálculo de áreas e representação gráfica (em ASCII) de figuras geométricas: **Retângulo, Quadrado, Círculo e Triângulo**.

## 📌 Estrutura do Projeto

geometria/
├── Circle.java
├── Rectangle.java
├── Square.java
├── Triangle.java
└── Main.java

- **Circle** → calcula a área do círculo e desenha com `*`.
- **Rectangle** → calcula a área e desenha um retângulo.
- **Square** → calcula a área e desenha um quadrado.
- **Triangle** → calcula a área e desenha um triângulo.
- **Main** → apresenta um menu para o usuário escolher a forma, informar as medidas, calcular a área e mostrar o desenho.

## Como executar

1. Compile os arquivos:
javac geometria/*.java

2. Execute o programa:
java geometria.Main

3. Escolha uma opção no menu:
=== MENU GEOMETRIA ===
1 - Retângulo
2 - Quadrado
3 - Círculo
4 - Triângulo
   
4. Depois informe as dimensões solicitadas.

📖 Exemplo de uso
Círculo (raio = 5)
Entrada: 3
Digite o raio do círculo: 5
Saída:
Área do círculo: 78.54
Desenho do círculo:


🛠 Tecnologias utilizadas
Java 17+ (funciona também em versões anteriores como 11 e 8)

✍️ Desenvolvido para prática de Programação Orientada a Objetos (POO) em Java. 
    Disciplina de Linguagens de programação II
