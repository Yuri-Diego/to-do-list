-- Criando uma lista de tarefas
INSERT INTO tb_task_list (id, created) VALUES (1, CURRENT_TIMESTAMP);

-- Criando algumas tarefas associadas à lista
INSERT INTO tb_task (id, title, description, task_id) VALUES (2, 'Estudar Java', 'Revisar JPA e Hibernate', 1);
INSERT INTO tb_task (id, title, description, task_id) VALUES (1, 'Fazer compras', 'Comprar leite e pão', 1);
INSERT INTO tb_task (id, title, description, task_id) VALUES (3, 'Academia', 'Treino de pernas', 1);
INSERT INTO tb_task (id, title, description, task_id) VALUES (4, 'Lavar o carro', 'Limpeza completa interna e externa', 1);
INSERT INTO tb_task (id, title, description, task_id) VALUES (5, 'Responder emails', 'Verificar e responder mensagens pendentes', 1);
INSERT INTO tb_task (id, title, description, task_id) VALUES (6, 'Reunião com equipe', 'Discutir andamento do projeto', 1);
INSERT INTO tb_task (id, title, description, task_id) VALUES (7, 'Organizar documentos', 'Separar arquivos importantes', 1);