# GatherGrid

## Documentation de Configuration du Projet

### Auteure: Asmae ELKHIRAOUI


### Résumé :

Ce document décrit la configuration du projet GatherGrid, une application web Java EE utilisant JEE, JSP, Hibernate, Servlet, et d'autres technologies. Il fournit une liste des dépendances utilisées et leurs versions.


### Environnement de Développement :

IDE : IntelliJ

Serveur d'Application : Apache Tomcat 10.1.14

Base de Données : MySQL


### Dépendances :

Servlet API : jakarta.servlet:jakarta.servlet-api:6.0.0

Hibernate ORM : org.hibernate.orm:hibernate-core:6.2.7.Final

MySQL Connector/J : com.mysql:mysql-connector-j:8.1.0


### persistence.xml

Configuration Hibernate

hibernate.dialect=hibernate.hbm2ddl.auto

hibernate.connection.url=jdbc:mysql://localhost:3306/gathergrid

hibernate.connection.username=root

hibernate.connection.password=(pas de password)


### Instructions pour le Déploiement :

 * Clonez le projet depuis le référentiel Git.
 * Importez le projet dans votre IDE.
 * Configurez votre serveur d'application (Tomcat) dans l'IDE.
 * Créez la base de données MySQL et configurez les informations de connexion dans le fichier persistence.xml
 * Exécutez le projet sur le serveur d'application.