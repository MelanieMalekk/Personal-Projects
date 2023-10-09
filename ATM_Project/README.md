[![Open in Codespaces](https://classroom.github.com/assets/launch-codespace-f4981d0f882b2a3f0472912d15f9806d57e124e0fc890972558857b51b24a6f9.svg)](https://classroom.github.com/open-in-codespaces?assignment_repo_id=9651969)
# Examen - partie 1 : tâche authentique

Ce répertoire est celui pour votre projet final en programmation orientée objet.

SVP placer tous fichiers liés à votre projet dans ce répertoire incluant :

* fichiers texte de planification (pseudocode de l'application)
* fichiers pour les diagrammes UML
* code source
* bytecode (fichiers .class)

## Objectif

Écrire un programme qui respecte les bases d'un projet orienté objet, notamment :

* l'encapsulation
* l'héritage de classes parents et/ou l'implémentation d'interfaces
* le polymorphisme

## Livrables

Pour compléter ce projet, les élèves doivent rendre :

- [ ] Une collection de **code source qui définit des objets et/ou des interfaces** du projet orienté objet
    * plusieurs fichiers .java pour les différentes classes (et interfaces)
- [ ] Un **diagramme UML** montrant les relations entre les différentes classes (et interfaces)
- [ ] Un **programme pour tester les objets** de façon banale
    * le nom du fichier est `Test*.java` où vous remplacerez l'`*` avec le nom de votre objet
    * inclut une méthode main
    * inclut des tests unitaires (appel de chaque méthode pour chaque objet avec des valeurs testant chacune des conditions dans les méthodes)
- [ ] Un **programme principal** qui fait quelque chose d'intéressant
    * le nom du fichier représente ce que le programme fait ou a un nom générique comme Jeu.java ou App.java
    * déclare et initialise des instances de vos classes
    * fournit une interface avec l'utilisateur (invites de commandes, affichage de résultats) en français
- [ ] Un **script .ps1** à la racine du dossier qui inclut les deux commandes (`javac` et `java`) pour compiler et lancer votre programme principal

## Critères d'évaluation

Compétence | Critère | Note et commentaire
-- | -- | --
HP | <p>Algorithmes logiques et bien documentés</p><p>Projet encapsulé avec héritage* cohérent</p> | 
CO | <p>Clair et facile à suivre (interface utilisateur, identifiants, style/indentation)</p><p>Le diagramme UML respecte les conventions</p><p>En-têtes javadoc dans chaque fichier de code source</p> | 
MA | <p>Travail complet et fait selon les consignes</p><p>Le programme se compile et se lance à partir de votre script .ps1 sans erreurs</p> | 

>*héritage inclut l'implémentation d'interfaces, une manière valable d'inclure cet élément dans votre projet, en plus de l'héritage explicite des classes parent et enfants

## Notes

* Le projet n'a pas besoin d'être emballé dans un package, mais s'il l'est, tous les éléments techniques en lien avec les packages feront aussi partie de l'évaluation de la cohérence du projet et de sa capacité à être compilé et lancé
* Pour l'aspect héritage et polymorphisme du projet, au moins 3 implémentations distinctes de la surclasse ou de l'interface sont attendues
* Le programme principal n'a pas besoin d'être super élaboré car l'emphase est sur votre compréhension des interactions entre les classes (et interfaces) dans un projet orienté objet. Le programme principal doit au minimum montrer le début de la grande idée que vous aviez pour vos objets et être fonctionnel même si c'est :
    1. une version complète mais (très) simplifiée
    1. une version avec seulement une ou quelques fonctionnalités implémentées
* Le projet doit être original et représenter une idée que vous avez pour une vraie application, même si le projet ne réalise pas entièrement cette idée.
