## Was ist Git und warum sollte es verwendet werden?

**Git** ist ein verteiltes Versionskontrollsystem, das hilft, Änderungen an Dateien zu verfolgen.  
Es wird vor allem für Softwareprojekte verwendet, eignet sich aber für jede Art von Dokumenten oder Projekten, bei denen mehrere Personen zusammenarbeiten.

### Vorteile von Git:

- **Versionskontrolle:** Jede Änderung wird gespeichert, sodass man zu früheren Versionen zurückkehren kann.
- **Teamarbeit:** Mehrere Personen können gleichzeitig am gleichen Projekt arbeiten, ohne dass die Arbeit der anderen verloren geht.
- **Branches:** Neue Funktionen oder Änderungen können in separaten Zweigen (Branches) entwickelt werden, ohne den Hauptprojektstand zu beeinflussen.
- **Sicheres Backup:** Durch das Pushen in ein Remote Repository (z. B. GitHub) ist die Arbeit gesichert und von überall zugänglich.

### Beispiel:
Ein Team arbeitet an einem Dokument. Mit Git können sie:

1. Änderungen lokal speichern (committen)
2. Änderungen mit dem Team teilen (pushen)
3. Konflikte erkennen und lösen, wenn mehrere Leute gleichzeitig Änderungen machen

Git hilft also, Ordnung zu behalten und Fehler rückgängig zu machen, was besonders in Teamprojekten sehr wichtig ist.

## Grundlegende Git-Befehle

Hier werden die wichtigsten Git-Befehle für den Einstieg erklärt.

### 1. git init
Initialisiert ein neues Git-Repository im aktuellen Ordner.



...


## Branches und Merge-Konflikte

### Was ist ein Branch?
Ein **Branch** ist ein paralleler Entwicklungszweig in Git.  
Man kann damit neue Funktionen oder Änderungen entwickeln, **ohne den Hauptzweig (main) zu verändern**.

> Beispiel: Du arbeitest an einer neuen Funktion, während andere Teammitglieder am Hauptprojekt weiterarbeiten.

---

### Branch erstellen und wechseln

# Neuen Branch erstellen
git branch neuer-branch

# Zum Branch wechseln
git checkout neuer-branch
# Branch zusammenführen (Merge)
git checkout main
git merge neuer-branch
# Merge-Konflikte lösen)
<<<<<<< HEAD
Text von main
=======
Text vom Branch
>>>>>>> neuer-branch
Gewünschte Version auswählen oder zusammenführen
Datei als gelöst markieren:
git add README.md
git commit -m "Merge-Konflikt gelöst"


## Git in IntelliJ/PyCharm verwenden

IntelliJ und PyCharm haben eine **integrierte Git-Unterstützung**, die viele Befehle über die Benutzeroberfläche ausführt.

---

### 1. Repository klonen
1. Öffne IntelliJ/PyCharm → **Get from Version Control**  
2. Repository-URL eingeben (z. B. `https://github.com/deinname/git-handout.git`)  
3. Zielordner auswählen → **Clone**

> Tipp: Alternativ kann man das Repository vorher lokal klonen und dann als Projekt öffnen.

---

### 2. Änderungen committen
1. Dateien im Projekt ändern  
2. Menüleiste → **Git → Commit**  
3. Commit-Nachricht schreiben  
4. **Commit** oder **Commit and Push** auswählen

---

### 3. Push ins Remote Repository
- Wenn nur committen: lokal gespeichert  
- Mit **Push** werden die Änderungen auf GitHub/GitLab hochgeladen  
  Menüleiste → **Git → Push**  

---

### 4. Branches verwalten
1. Menüleiste → **Git → Branches**  
2. Neuer Branch: **New Branch** → Name eingeben  
3. Wechseln: auf Branch klicken → **Checkout**  
4. Merge oder Pull Request: Über **Git → Merge Changes** bzw. auf GitHub erstellen

---

### Vorteile der IDE-Integration
- Visualisierung von Änderungen  
- Einfacher Zugriff auf Branches, Commits, Push/Pull  
- Merge-Konflikte werden direkt hervorgehoben

### Nützliche Git-Tools und Plattformen
  GitHub / GitLab / Bitbucket
  Sourcetree / GitKraken
  VSCode
  IntelliJ / PyCharm
  
---

## Dokumentation der Zusammenarbeit

| Teammitglied | Beitrag                                                         |
|----------|-----------------------------------------------------------------|
| Maximilian Jahrmärker| Erstellen des Git-Repositories und Anlegen der `README.md`-Datei. |
| Norma Roth | Ausformulierung und Beschreibung der Inhalte in der `README.md`. |

> Hinweis: Jeder hat mindestens 2–3 Commits im eigenen Branch erstellt und die Pull Requests überprüft, bevor die finalen Inhalte in den Haupt-Branch gemerged wurden.
