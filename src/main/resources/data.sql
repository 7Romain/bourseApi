DROP TABLE IF EXISTS personnes;

CREATE TABLE personnes (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  prenom VARCHAR(250) NOT NULL,
  nom VARCHAR(250) NOT NULL,
  telephone VARCHAR(250) NOT NULL,
  commune VARCHAR(250) NOT NULL,
  dateinscription DATE
);

INSERT INTO personnes (prenom, nom, telephone, commune, dateInscription) VALUES
  ('Laurent', 'GINA', '0102030405', 'Limons', '2022-09-10'),
  ('Sophie', 'FONCEK', '0601010101', 'Paslieres', '2022-09-10'),
  ('Agathe', 'FEELING', '0785150806', 'Maringues', '2022-09-10');