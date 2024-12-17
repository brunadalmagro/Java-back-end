-- Sequências
CREATE SEQUENCE sequence_usuario START WITH 1 INCREMENT BY 50;
CREATE SEQUENCE sequence_categoria_meme START WITH 1 INCREMENT BY 50;
CREATE SEQUENCE sequence_meme START WITH 1 INCREMENT BY 50;

-- Tabela usuário
CREATE TABLE usuario (
  id BIGINT NOT NULL DEFAULT NEXTVAL('sequence_usuario'),
  nome VARCHAR(255) NOT NULL,
  email VARCHAR(255) NOT NULL,
  data_cadastro DATE NOT NULL DEFAULT CURRENT_DATE,
  CONSTRAINT pk_usuario PRIMARY KEY (id)
);

-- Tabela categoria_meme
CREATE TABLE categoria_meme (
  id BIGINT NOT NULL DEFAULT NEXTVAL('sequence_categoria_meme'),
  nome VARCHAR(255) NOT NULL,
  descricao VARCHAR(255) NOT NULL,
  data_cadastro DATE NOT NULL DEFAULT CURRENT_DATE,
  usuario_id BIGINT,
  CONSTRAINT pk_categoria_meme PRIMARY KEY (id),
  CONSTRAINT fk_categoria_meme_usuario FOREIGN KEY (usuario_id) REFERENCES usuario (id)
);

-- Tabela meme
CREATE TABLE meme (
  id BIGINT NOT NULL DEFAULT NEXTVAL('sequence_meme'),
  nome VARCHAR(255) NOT NULL,
  descricao VARCHAR(255) NOT NULL,
  data_cadastro DATE NOT NULL DEFAULT CURRENT_DATE,
  categoria_meme_id BIGINT,
  usuario_id BIGINT,
  CONSTRAINT pk_meme PRIMARY KEY (id),
  CONSTRAINT fk_meme_categoria_meme FOREIGN KEY (categoria_meme_id) REFERENCES categoria_meme (id),
  CONSTRAINT fk_meme_usuario FOREIGN KEY (usuario_id) REFERENCES usuario (id)
);
