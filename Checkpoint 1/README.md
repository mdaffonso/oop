# Checkpoint 1 da disciplina de Programação Orientada a Objetos

Primeiro checkpoint da disciplina de Programação Orientada a Objetos. Os requisitos para o projeto eram os seguintes:

## Requisitos

A escola técnica Direct School solicitou para a nossa Fábrica de Softwares criar um sistema para gestão de alunos e matrículas para seus cursos de inglês, informática e administração.

+ Os cursos são realizados em salas presenciais, nos turnos MANHA, TARDE e NOITE.
+ O valor do curso de inglês é de R$ 700,00 mensais, informática R$ 800,00 mensais e administração R$ 850,00 mensais.
+ A escola necessita de dados pessoais dos alunos como: Nome, Cpf, Telefone, Sexo, Email, Endereço (logradouro, numero, complemento, bairro, cep, cidade, estado)
+ Quanto aos professores, a empresa solicita que além de dados pessoais seja informado o seu valor hora e formação (SUPERIOR/POS-GRADUACAO/ESPECIALIZACAO/MESTRADO/ DOUTORADO).

Após o cadastro dos cursos oferecidos, os respectivos alunos e professores será montado uma estrutura de Curso com: Nome da Sala, turno, professor e os alunos.

Na formação da sala é importante que cada aluno de uma sala tenha o seu número de matricula de forma sequencial: 01,02,03 e etc.

## Documentação

A subpasta UML contém os diagramas de UML criados para a resolução do problema apresentado, com uma versão em PDF, uma em HTML e uma modificável no Draw.IO.
**Todos os valores foram criados em int de forma deliberada.** Isso foi feito para evitar problemas de precisão decorrentes da incapacidade de 
sistemas de informática de adequadamente calcular ponto flutuante na conversão de base 2 para base 10. Os valores monetários devem ser inseridos 
em centavos. A exibição para o usuário final deve ser feita na view.

A implementação está dividida em 3 pacotes:

+ com.matheus - contém somente a classe Main
+ cursos - contém todas as informações referentes ao curso
+ pessoas - contém todas as informações referentes às pessoas (alunos e professores)