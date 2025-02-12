-- Criando uma lista de tarefas
INSERT INTO tb_task_list (id, created) VALUES (1, CURRENT_TIMESTAMP);

-- Criando algumas tarefas associadas à lista
INSERT INTO tb_task (id, title, description, done, task_id) VALUES (1, 'Fazer compras', 'Comprar leite e pão', false, 1);
INSERT INTO tb_task (id, title, description, done, task_id) VALUES (2, 'Estudar Java', 'Revisar JPA e Hibernate', true, 1);
INSERT INTO tb_task (id, title, description, done, task_id) VALUES (3, 'Academia', 'Treino de pernas', false, 1);
INSERT INTO tb_task (id, title, description, done, task_id) VALUES (4, 'Lavar o carro', 'Limpeza completa interna e externa', false, 1);
INSERT INTO tb_task (id, title, description, done, task_id) VALUES (5, 'Responder emails', 'Verificar e responder mensagens pendentes', true, 1);
INSERT INTO tb_task (id, title, description, done, task_id) VALUES (6, 'Reunião com equipe', 'Discutir andamento do projeto', false, 1);
INSERT INTO tb_task (id, title, description, done, task_id) VALUES (7, 'Organizar documentos', 'Separar arquivos importantes', true, 1);