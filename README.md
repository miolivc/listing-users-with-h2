# Instruções de Uso do Archetype:

1. Faça clone deste repositório:  
	git clone https://github.com/ads-ifpb-praticas/michelle-archetype  </br>
2. Entre dentro da pasta do projeto e execute:  
	mvn clean install  </br>
3. Vá para o diretório que deseja criar seu projeto e execute:  
	mvn archetype:generate -DarchetypeGroupId=br.edu.ifpb.praticas
    -DarchetypeArtifactId=michelle-archetype  
    -DarchetypeVersion=1.0-SNAPSHOT  
    -DgroupId=nome.do.group.id
    -DartifactId=your-project-name  
    -Dversion=1.0-SNAPSHOT  
    -Dpackage=br.com.your.domain  </br>
