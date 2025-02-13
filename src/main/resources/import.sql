-- Criando uma lista de tarefas
INSERT INTO tb_task_list (id, created) VALUES (100, CURRENT_TIMESTAMP);

-- Criando algumas tarefas associadas à lista
INSERT INTO tb_task (id, title, description, task_id) VALUES (20, 'Estudar Java', 'Revisar JPA e Hibernate', 100);
INSERT INTO tb_task (id, title, description, task_id) VALUES (10, 'Fazer compras', 'Comprar leite e pão', 100);
INSERT INTO tb_task (id, title, description, task_id) VALUES (30, 'Academia', 'Treino de pernas', 100);
INSERT INTO tb_task (id, title, description, task_id) VALUES (40, 'Lavar o carro', 'Limpeza completa interna e externa', 100);
INSERT INTO tb_task (id, title, description, task_id) VALUES (50, 'Responder emails', 'Verificar e responder mensagens pendentes', 100);
INSERT INTO tb_task (id, title, description, task_id) VALUES (60, 'Reunião com equipe', 'Discutir andamento do projeto', 100);
INSERT INTO tb_task (id, title, description, task_id) VALUES (70, 'Organizar documentos', 'Separar arquivos importantes', 100);