-- Inserindo Status dos animais na tabela id_status
INSERT INTO id_status (descricao) VALUES ('Disponível');
INSERT INTO id_status (descricao) VALUES ('Adotado');
INSERT INTO id_status (descricao) VALUES ('Em Avaliação');

-- Inserções na tabela animal com o campo id_status incluído

-- Animal com status "Adotado" (id_status = 2)
INSERT INTO animal (tipo_animal, sexo, nome_provisorio, idade_estimada, raca, data_entrada, data_adocao, condicoes_chegada, nome_recebedor, porte, id_status)
VALUES ('Gato', 'macho', 'BOB', 5, 'SRD', CURRENT_DATE, CURRENT_DATE, 'Pulguento', 'Cleber', 'Pequeno', 2);

-- Animal com status "Disponível" (id_status = 1)
INSERT INTO animal (tipo_animal, sexo, nome_provisorio, idade_estimada, raca, data_entrada, condicoes_chegada, nome_recebedor, porte, id_status)
VALUES ('Cachorro', 'macho', 'Thor', 10, 'Pitbull', CURRENT_DATE -10 DAY, 'Velhinho', 'Ana', 'Grande', 1);

-- Animal com status "Em Avaliação" (id_status = 3)
INSERT INTO animal (tipo_animal, sexo, nome_provisorio, idade_estimada, raca, data_entrada, condicoes_chegada, nome_recebedor, porte, id_status)
VALUES ('Cachorro', 'femea', 'Lady', 3, 'Pinscher', CURRENT_DATE, '50% raiva, 50% tremedeira', 'Cleber', 'Pequeno', 3);

-- Animal com status "Disponível" (id_status = 1)
INSERT INTO animal (tipo_animal, sexo, nome_provisorio, idade_estimada, raca, data_entrada, condicoes_chegada, nome_recebedor, porte, id_status)
VALUES ('Cachorro', 'macho', 'Rex', 3, 'Vira-lata', CURRENT_DATE, 'Encontrado na rua', 'Silva', 'Médio', 1);

-- Animal com status "Em Avaliação" (id_status = 3)
INSERT INTO animal (tipo_animal, sexo, nome_provisorio, idade_estimada, raca, data_entrada, condicoes_chegada, nome_recebedor, porte, id_status)
VALUES ('Gato', 'femea', 'Luna', 2, 'Siamês', CURRENT_DATE -20 DAY, 'Resgatada de maus tratos', 'Ana', 'Pequeno', 3);
