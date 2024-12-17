-- Inserindo Status dos animais na tabela id_status
INSERT INTO id_status (descricao) VALUES ('Disponível');
INSERT INTO id_status (descricao) VALUES ('Adotado');
INSERT INTO id_status (descricao) VALUES ('Em Avaliação');

-- Inserções na tabela animal
INSERT INTO animal (tipo_animal, sexo, nome_provisorio, idade_estimada, raca, data_entrada, data_adocao, condicoes_chegada, nome_recebedor, porte, id_status)
VALUES ('Gato', 'macho', 'BOB', 5, 'SRD', CURRENT_DATE, CURRENT_DATE, 'Pulguento', 'Cleber', 'Pequeno', 2);

INSERT INTO animal (tipo_animal, sexo, nome_provisorio, idade_estimada, raca, data_entrada, condicoes_chegada, nome_recebedor, porte, id_status)
VALUES ('Cachorro', 'macho', 'Thor', 10, 'Pitbull', CURRENT_DATE -10 DAY, 'Velhinho', 'Ana', 'Grande', 1);

INSERT INTO animal (tipo_animal, sexo, nome_provisorio, idade_estimada, raca, data_entrada, condicoes_chegada, nome_recebedor, porte, id_status)
VALUES ('Cachorro', 'femea', 'Lady', 3, 'Pinscher', CURRENT_DATE, '50% raiva, 50% tremedeira', 'Cleber', 'Pequeno', 3);

INSERT INTO animal (tipo_animal, sexo, nome_provisorio, idade_estimada, raca, data_entrada, condicoes_chegada, nome_recebedor, porte, id_status)
VALUES ('Cachorro', 'macho', 'Rex', 3, 'Vira-lata', CURRENT_DATE, 'Encontrado na rua', 'Silva', 'Médio', 1);

INSERT INTO animal (tipo_animal, sexo, nome_provisorio, idade_estimada, raca, data_entrada, condicoes_chegada, nome_recebedor, porte, id_status)
VALUES ('Gato', 'femea', 'Luna', 2, 'Siamês', CURRENT_DATE -20 DAY, 'Resgatada de maus tratos', 'Ana', 'Pequeno', 3);

INSERT INTO animal (tipo_animal, sexo, nome_provisorio, idade_estimada, raca, data_entrada, condicoes_chegada, nome_recebedor, porte, id_status)
VALUES ('Peixe', 'masculino', 'Nemo', 1, 'Peixe Palhaço', CURRENT_DATE -5 DAY, 'Resgatados de maus tratos', 'João', 'Pequeno', 1);

INSERT INTO animal (tipo_animal, sexo, nome_provisorio, idade_estimada, raca, data_entrada, condicoes_chegada, nome_recebedor, porte, id_status)
VALUES ('Tartaruga', 'fêmea', 'Margarida', 12, 'Tartaruga Marinha', CURRENT_DATE -2 MONTH, 'Resgatada de pesca ilegal', 'Silva', 'Médio', 1);

INSERT INTO animal (tipo_animal, sexo, nome_provisorio, idade_estimada, raca, data_entrada, condicoes_chegada, nome_recebedor, porte, id_status)
VALUES ('Ave', 'macho', 'Azulão', 2, 'Periquito Australiano', CURRENT_DATE -15 DAY, 'Fechado em gaiola pequena, com sinais de doença', 'Maria', 'Pequeno', 1);

INSERT INTO animal (tipo_animal, sexo, nome_provisorio, idade_estimada, raca, data_entrada, condicoes_chegada, nome_recebedor, porte, id_status)
VALUES ('Papagaio', 'fêmea', 'Loro', 4, 'Papagaio Maracanã', CURRENT_DATE -5 DAY, 'Não se alimenta bem', 'Ana', 'Médio', 3);

INSERT INTO animal (tipo_animal, sexo, nome_provisorio, idade_estimada, raca, data_entrada, condicoes_chegada, nome_recebedor, porte, id_status)
VALUES ('Ave', 'macho', 'Sunny', 1, 'Canário Belga', CURRENT_DATE -10 DAY, 'Asa quebrada', 'Maria', 'Pequeno', 1);

INSERT INTO animal (tipo_animal, sexo, nome_provisorio, idade_estimada, raca, data_entrada, condicoes_chegada, nome_recebedor, porte, id_status)
VALUES ('Cavalo', 'fêmea', 'Princesa', 7, 'Mangalarga', CURRENT_DATE -3 MONTH, 'Resgatada de maus tratos', 'João', 'Grande', 1);

