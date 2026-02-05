-- Criação da tabela

CREATE TABLE `filmes` (
  `id` int(11) NOT NULL,
  `nome` varchar(150) NOT NULL,
  `datalancamento` date NOT NULL,
  `categoria` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

ALTER TABLE `filmes`
  ADD PRIMARY KEY (`id`);

ALTER TABLE `filmes`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
COMMIT;

