# Recursividade
Exemplos de Programas com Recursividade


### Como Compilar e Testar no Maven


Primeiro adicione a seguinte info na parte de **Plugins** do **pom.xml**

```xml
<plugin>
          <groupId>org.codehaus.mojo</groupId>
          <artifactId>exec-maven-plugin</artifactId>
          <version>1.2.1</version>
          <configuration>
              <mainClass>com.example.Main</mainClass>
          </configuration>
</plugin>
```

Utilize o seguinte comando para instalar o pacote colocado acima:

```shell
> mvn install
```

Compile o projeto:

```shell
> mvn compile
```

* Coloque na Área do **mainClass** do pom.xml o caminho para o .class, onde no meu
caso fica dentro do pacote _recursividade_ como abaixo:

```xml
<mainClass>recursividade.App</mainClass>
```

Rode o Programa com o seguinte comando

```shell
mvn exec:java
```

