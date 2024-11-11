CREATE TABLE id_status (
    id INT AUTO_INCREMENT PRIMARY KEY,
    descricao VARCHAR(255) NOT NULL
);

CREATE TABLE animal (
    id INT AUTO_INCREMENT PRIMARY KEY,
    tipo_animal VARCHAR(255) NOT NULL,
    sexo VARCHAR(255) NOT NULL,
    nome_provisorio VARCHAR(255) NOT NULL,
    idade_estimada INT NOT NULL,
    raca VARCHAR(255) NOT NULL,
    data_entrada DATE NOT NULL,
    data_adocao DATE,
    condicoes_chegada VARCHAR(255) NOT NULL,
    nome_recebedor VARCHAR(255) NOT NULL,
    data_obito DATE,
    porte VARCHAR(50) NOT NULL,
    id_status INT,
    CONSTRAINT fk_status FOREIGN KEY (id_status) REFERENCES id_status(id)
);
