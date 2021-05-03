use mysql;

create table if not exists `modulo` (
  `id` int auto_increment primary key ,
  `nome` varchar(255)
);

insert into `modulo` (nome) values
    ('Docker'),
    ('Fundamentos da Arquitetura de Software'),
    ('Comunicação'),
    ('RabbitMQ'),
    ('Autenticação e Keycloak'),
    ('Se funcionou essa linha vai estar na tela');