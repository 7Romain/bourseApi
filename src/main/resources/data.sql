DROP TABLE IF EXISTS personnes;

CREATE TABLE personnes (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  prenom VARCHAR(250) NOT NULL,
  nom VARCHAR(250) NOT NULL,
  telephone VARCHAR(250) NOT NULL,
  commune VARCHAR(250) NOT NULL,
  dateinscription DATE,
  email VARCHAR(250)
);

INSERT INTO personnes (prenom, nom, telephone, commune, dateInscription, email) VALUES
  ('Laurent', 'GINA', '0102030405', 'Limons', '2022-09-10', 'l.gina@gmail.com'),
  ('Sophie', 'FONCEK', '0601010101', 'Paslieres', '2022-09-10', 'soso@gmail.com'),
  ('Agathe', 'FEELING', '0785150806', 'Maringues', '2022-09-10', 'missfi@yahoo.fr');

DROP TABLE IF EXISTS articles;

CREATE TABLE articles (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  categorie VARCHAR(250) NOT NULL,
  type VARCHAR(250),
  taille VARCHAR(250) ,
  couleurs VARCHAR(250) NOT NULL,
  annotations VARCHAR(250),
  reference INT AUTO_INCREMENT,
  prixvendeur INT,
  prixvente INT,
  idvendeur INT
);

INSERT INTO personnes (prenom, nom, telephone, commune, dateInscription, email) VALUES
  ('Laurent', 'GINA', '0102030405', 'Limons', '2022-09-10', 'l.gina@gmail.com'),
  ('Sophie', 'FONCEK', '0601010101', 'Paslieres', '2022-09-10', 'soso@gmail.com'),
  ('Agathe', 'FEELING', '0785150806', 'Maringues', '2022-09-10', 'missfi@yahoo.fr');