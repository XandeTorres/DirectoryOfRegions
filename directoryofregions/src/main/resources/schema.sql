DROP TABLE IF EXISTS Regions;

CREATE TABLE Regions (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  Name VARCHAR(250) NOT NULL,
  ShortName VARCHAR(250) NOT NULL
);