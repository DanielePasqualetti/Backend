-- mi creo le tabelle

CREATE TABLE clienti (
	numero_cliente SERIAL PRIMARY KEY,
	nome VARCHAR NOT NULL,
	cognome VARCHAR NOT NULL,
	data_nascita DATE,
	regione_residenza VARCHAR NOT NULL
);

CREATE TABLE fornitori (
	numero_fornitore SERIAL PRIMARY KEY,
	denominazione VARCHAR NOT NULL,
	regione_residenza VARCHAR NOT NULL
);

CREATE TABLE fatture (
	numero_fattura SERIAL PRIMARY KEY,
	tipologia VARCHAR NOT NULL,
	importo DECIMAL NOT NULL,
	iva DECIMAL NOT NULL,
	id_cliente INT NOT NULL,
	data_fattura DATE NOT NULL,
	numero_fornitore INT NOT NULL,
	FOREIGN KEY (id_cliente) REFERENCES clienti(numero_cliente),
	FOREIGN KEY (numero_fornitore) REFERENCES fornitori(numero_fornitore)
);

CREATE TABLE prodotti (
	id_prodotto SERIAL PRIMARY KEY,
	descrizione VARCHAR NOT NULL,
	in_produzione BOOLEAN NOT NULL,
	in_commercio BOOLEAN NOT NULL,
	data_attivazione DATE NOT NULL,
	data_disattivazione DATE
);

-- creo gli oggetti da inserire nelle rispettive tabelle
-- clienti
INSERT INTO clienti (nome, cognome, data_nascita, regione_residenza) VALUES ('Mario', 'Rossi', '1994-05-12', 'Lazio');
INSERT INTO clienti (nome, cognome, data_nascita, regione_residenza) VALUES ('Valerio', 'Bianchi', '1982-12-10', 'Lombardia');
INSERT INTO clienti (nome, cognome, data_nascita, regione_residenza) VALUES ('Carlo', 'Verdi', '1982-3-28', 'Veneto');
INSERT INTO clienti (nome, cognome, data_nascita, regione_residenza) VALUES ('Pietro', 'Azzurri', '1960-01-22', 'Molise');
INSERT INTO clienti (nome, cognome, data_nascita, regione_residenza) VALUES ('Alberto', 'Aranci', '1994-11-23', 'Marche');
INSERT INTO clienti (nome, cognome, data_nascita, regione_residenza) VALUES ('Vincenzo', 'Bluini', '1984-07-18', 'Campania');
INSERT INTO clienti (nome, cognome, data_nascita, regione_residenza) VALUES ('Marco', 'Violi', '1974-06-17', 'Lombardia');

-- fornitori
INSERT INTO fornitori (denominazione, regione_residenza) VALUES ('Ma', 'Lombardia');
INSERT INTO fornitori (denominazione, regione_residenza) VALUES ('COOP', 'Lazio');
INSERT INTO fornitori (denominazione, regione_residenza) VALUES ('Tigre', 'Toscana');
INSERT INTO fornitori (denominazione, regione_residenza) VALUES ('Panorama', 'Campania');
INSERT INTO fornitori (denominazione, regione_residenza) VALUES ('Conad', 'Puglia');

-- prodotti
INSERT INTO prodotti (descrizione, in_produzione, in_commercio, data_attivazione, data_disattivazione) VALUES ('Prosciutto cotto', true, true, '1998-01-01', NULL);
INSERT INTO prodotti (descrizione, in_produzione, in_commercio, data_attivazione, data_disattivazione) VALUES ('Salame', true, true, '2017-01-01', NULL);
INSERT INTO prodotti (descrizione, in_produzione, in_commercio, data_attivazione, data_disattivazione) VALUES ('Mortadella', true, false, '1998-01-01', '2001-12-31');
INSERT INTO prodotti (descrizione, in_produzione, in_commercio, data_attivazione, data_disattivazione) VALUES ('Coppa', true, true, '2017-01-01', NULL);
INSERT INTO prodotti (descrizione, in_produzione, in_commercio, data_attivazione, data_disattivazione) VALUES ('Prosciutto crudo', true, true, '2005-01-01', NULL);
INSERT INTO prodotti (descrizione, in_produzione, in_commercio, data_attivazione, data_disattivazione) VALUES ('Lonza', true, false, '1980-01-01', '1999-12-31');

-- fatture
INSERT INTO fatture (tipologia, importo, iva, id_cliente, data_fattura, numero_fornitore) VALUES ('B', 100.00, 22.00, 1, '2022-01-10', 1);
INSERT INTO fatture (tipologia, importo, iva, id_cliente, data_fattura, numero_fornitore) VALUES ('A', 250.00, 10.00, 2, '2021-02-15', 4);
INSERT INTO fatture (tipologia, importo, iva, id_cliente, data_fattura, numero_fornitore) VALUES ('A', 19.90, 22.00, 3, '2022-03-20', 4);
INSERT INTO fatture (tipologia, importo, iva, id_cliente, data_fattura, numero_fornitore) VALUES ('B', 153.56, 20.00, 5, '2023-04-25', 5);
INSERT INTO fatture (tipologia, importo, iva, id_cliente, data_fattura, numero_fornitore) VALUES ('A', 741.32, 20.00, 6, '2021-05-01', 2);
INSERT INTO fatture (tipologia, importo, iva, id_cliente, data_fattura, numero_fornitore) VALUES ('B', 9.90, 24.00, 4, '2020-06-05', 3);
INSERT INTO fatture (tipologia, importo, iva, id_cliente, data_fattura, numero_fornitore) VALUES ('A', 5532.54, 10.00, 3, '2020-07-10', 3);
INSERT INTO fatture (tipologia, importo, iva, id_cliente, data_fattura, numero_fornitore) VALUES ('B', 2000.00, 20.00, 5, '2023-08-15', 5);

-- query
SELECT nome, cognome FROM clienti WHERE EXTRACT (YEAR FROM data_nascita) = 1982;
SELECT numero_fattura FROM fatture WHERE iva = 20.00;
SELECT EXTRACT (YEAR FROM data_fattura) AS anno_fatturazione, COUNT(numero_fattura) AS numero_fatture, SUM(importo) AS somma_importi FROM fatture GROUP BY EXTRACT(YEAR FROM data_fattura);
SELECT * FROM prodotti WHERE data_attivazione >= '2017-01-01' AND data_attivazione <= '2017-12-31' AND (in_produzione = TRUE OR in_commercio = TRUE);



