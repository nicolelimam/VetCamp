-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Tempo de geração: 28/11/2022 às 21:29
-- Versão do servidor: 10.4.27-MariaDB
-- Versão do PHP: 7.4.33

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `vetcamp`
--

-- --------------------------------------------------------

--
-- Estrutura para tabela `adm_cargo`
--

CREATE TABLE `adm_cargo` (
  `id_cargo` int(11) NOT NULL,
  `descricao` varchar(150) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `adm_cargo`
--

INSERT INTO `adm_cargo` (`id_cargo`, `descricao`) VALUES
(1, 'Administrador'),
(2, 'Atendente'),
(3, 'Veterinario');

-- --------------------------------------------------------

--
-- Estrutura para tabela `adm_control`
--

CREATE TABLE `adm_control` (
  `id_control` int(11) NOT NULL,
  `data_control` varchar(50) NOT NULL,
  `tipo_control` varchar(50) NOT NULL,
  `descricao_control` varchar(150) NOT NULL,
  `valor_control` varchar(100) NOT NULL,
  `funcionario_control` varchar(150) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `adm_control`
--

INSERT INTO `adm_control` (`id_control`, `data_control`, `tipo_control`, `descricao_control`, `valor_control`, `funcionario_control`) VALUES
(1, '18 / 09', 'Saída', 'Salários', '150.00', 'ligia'),
(2, '', 'Entrada', 'Vendas', '7.4', 'Carlos'),
(3, '', 'Entrada', 'Vendas', '11.100000000000001', 'Carlos'),
(4, '', 'Entrada', 'Vendas', '11.100000000000001', 'Carlos'),
(5, '', 'Entrada', 'Vendas', '18.5', 'Carlos');

-- --------------------------------------------------------

--
-- Estrutura para tabela `adm_est`
--

CREATE TABLE `adm_est` (
  `id_est` int(11) NOT NULL,
  `data_est` varchar(20) NOT NULL,
  `produto_est` varchar(11) NOT NULL,
  `quantidade` varchar(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `adm_est`
--

INSERT INTO `adm_est` (`id_est`, `data_est`, `produto_est`, `quantidade`) VALUES
(4, '19 / 09', 'Vermifugo', '10'),
(5, '17/ 10', 'Medicamento', '13'),
(6, '19 / 08', 'Vermifugo', '15'),
(7, '15 / 09', 'Medicamento', '16'),
(8, '19 / 7', 'Vermifugo', '17'),
(9, '19 / 07', 'Pedgree', '3'),
(11, '18 / 8', 'Racao', '2'),
(15, '18 / 09', 'Medicamento', '17'),
(16, '17 / 09', 'Vacina', '12'),
(17, '14 / 06', 'Cortador', '7');

-- --------------------------------------------------------

--
-- Estrutura para tabela `adm_estsaida`
--

CREATE TABLE `adm_estsaida` (
  `id_est` int(11) NOT NULL,
  `data_est` varchar(100) NOT NULL,
  `prod_est` varchar(100) NOT NULL,
  `quant_est` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `adm_estsaida`
--

INSERT INTO `adm_estsaida` (`id_est`, `data_est`, `prod_est`, `quant_est`) VALUES
(1, '16 / 08', 'Medicamento', '2'),
(2, '12 / 09', 'Medicamento', '1'),
(3, '12 / 08', 'Medicamento', '4'),
(4, '18 / 09', 'Medicamento', '4'),
(5, '19 / 9', 'Vacina', '5'),
(6, '19/09', 'Vermifugo', '2'),
(7, '18 / 09', 'Medicamento', '1'),
(8, '18 / 09', 'Vacina', '2'),
(9, '19 /8', 'Medicamento', '2'),
(10, '18 / 08', 'Medicamento', '7'),
(11, '17 /09', 'Medicamento', '3'),
(12, '17 / 08', 'Medicamento', '3'),
(13, '13 / 07', 'Medicamento', '5');

-- --------------------------------------------------------

--
-- Estrutura para tabela `adm_fornecedor`
--

CREATE TABLE `adm_fornecedor` (
  `id_fornecedor` int(11) NOT NULL,
  `nome_fornecedor` varchar(150) NOT NULL,
  `cnpj_fornecedor` varchar(50) NOT NULL,
  `endereco_fornecedor` varchar(150) NOT NULL,
  `telefone_fornecedor` varchar(50) NOT NULL,
  `email_fornecedor` varchar(150) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `adm_fornecedor`
--

INSERT INTO `adm_fornecedor` (`id_fornecedor`, `nome_fornecedor`, `cnpj_fornecedor`, `endereco_fornecedor`, `telefone_fornecedor`, `email_fornecedor`) VALUES
(1, 'Avifort', 'test 03', 'test 03', 'Avifort', 'aijais@'),
(2, 'DogShow', 'teste01', 'teste01', 'DogShow', 'sjais@asa.com'),
(3, 'PremierPet', 'asokaoa', 'asokaoa', 'PremierPet', 'ksako@oaksoa');

-- --------------------------------------------------------

--
-- Estrutura para tabela `adm_produto`
--

CREATE TABLE `adm_produto` (
  `id_produto` int(11) NOT NULL,
  `nome_produto` varchar(150) NOT NULL,
  `quantidade_produto` varchar(50) NOT NULL,
  `validade_produto` varchar(50) NOT NULL,
  `preco_unitario` varchar(50) NOT NULL,
  `preco_venda` varchar(50) NOT NULL,
  `fk_fornecedor` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `adm_produto`
--

INSERT INTO `adm_produto` (`id_produto`, `nome_produto`, `quantidade_produto`, `validade_produto`, `preco_unitario`, `preco_venda`, `fk_fornecedor`) VALUES
(1, 'Medicamento', '12', '13/10', '2.50', '3.70', 1),
(2, 'Vacina', '12', '12/09', '2.50', '390', 1),
(3, 'Vermifugo', '17', '18/04', '2;40', '2.90', 2),
(4, 'Ração', '10', '14.05', '13.5', '17.5', 1),
(5, 'Medicamento', '16', '13/10', '2.50', '3.70', 1),
(6, 'Vermifugo', '9', '18/04', '2;40', '2.90', 2),
(7, 'Remédios', '13', '12/07', '2.7', '5.6', 3),
(8, 'Pedgree', '3', '18 / 08', '8.90', '13.40', 2),
(9, 'Medicamento', '14', '13/10', '2.50', '3.70', 3),
(10, 'Racao', '2', '12 / 07', '5.98', '8.90', 2),
(11, 'Pedgree', '3', '18 / 08', '8.90', '13.40', 2),
(12, 'Medicamento', '14', '13/10', '2.50', '3.70', 3),
(13, 'Cortador', '12', '13 / 05', '3.50', '5.90', 3);

-- --------------------------------------------------------

--
-- Estrutura para tabela `adm_servico`
--

CREATE TABLE `adm_servico` (
  `id_servico` int(11) NOT NULL,
  `descricao` varchar(150) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estrutura para tabela `adm_usuario`
--

CREATE TABLE `adm_usuario` (
  `id_usuario` int(11) NOT NULL,
  `nome_usuario` varchar(150) NOT NULL,
  `cpf_usuario` varchar(50) NOT NULL,
  `endereco_usuario` varchar(150) NOT NULL,
  `telefone_usuario` varchar(50) NOT NULL,
  `login_usuario` varchar(150) NOT NULL,
  `login_senha` varchar(150) NOT NULL,
  `fk_cargo` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `adm_usuario`
--

INSERT INTO `adm_usuario` (`id_usuario`, `nome_usuario`, `cpf_usuario`, `endereco_usuario`, `telefone_usuario`, `login_usuario`, `login_senha`, `fk_cargo`) VALUES
(1, 'Mary', '400321', 'Rua Aloísio', '3144 6500', 'mary', '123', 3),
(2, 'Ligia', '123456789', 'Rua 2', '3122 5342', 'ligia', '123', 1),
(3, 'Carlos', '12345', 'Rua 01', '3144 54', 'Carlos', '123', 2);

-- --------------------------------------------------------

--
-- Estrutura para tabela `atn_agenda`
--

CREATE TABLE `atn_agenda` (
  `id_agenda` int(11) NOT NULL,
  `data_agenda` varchar(50) NOT NULL,
  `tipo_agenda` varchar(100) NOT NULL,
  `sexo_agenda` varchar(20) NOT NULL,
  `categoria_agenda` varchar(50) NOT NULL,
  `descricao_agenda` varchar(100) NOT NULL,
  `nome_animal` varchar(100) NOT NULL,
  `fk_animal` int(11) NOT NULL,
  `vet_agenda` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estrutura para tabela `atn_animal`
--

CREATE TABLE `atn_animal` (
  `id_animal` int(11) NOT NULL,
  `nome_animal` varchar(150) NOT NULL,
  `idade_animal` varchar(50) NOT NULL,
  `sexo_animal` varchar(50) NOT NULL,
  `descricao_animal` varchar(150) NOT NULL,
  `fk_cliente` int(11) NOT NULL,
  `categoria_animal` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `atn_animal`
--

INSERT INTO `atn_animal` (`id_animal`, `nome_animal`, `idade_animal`, `sexo_animal`, `descricao_animal`, `fk_cliente`, `categoria_animal`) VALUES
(1, 'Mel', '12', 'Femea', 'Cega', 1, 'Cao'),
(2, 'Maricota', '5', 'Macho', 'Gato Bravo', 2, 'Gatinho');

-- --------------------------------------------------------

--
-- Estrutura para tabela `atn_categoria`
--

CREATE TABLE `atn_categoria` (
  `id_categoria` int(11) NOT NULL,
  `descricao` varchar(150) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estrutura para tabela `atn_cliente`
--

CREATE TABLE `atn_cliente` (
  `id_cliente` int(11) NOT NULL,
  `nome_cliente` varchar(150) NOT NULL,
  `cpf_cliente` varchar(50) NOT NULL,
  `endereco_cliente` varchar(150) NOT NULL,
  `telefone_cliente` varchar(150) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `atn_cliente`
--

INSERT INTO `atn_cliente` (`id_cliente`, `nome_cliente`, `cpf_cliente`, `endereco_cliente`, `telefone_cliente`) VALUES
(1, 'Carlos Roberto', '12345678', 'Rua Federico Jose', '3144 5479'),
(2, 'Zé Carlos', '12345678', 'Rua Federico Jose', '3144 5478');

-- --------------------------------------------------------

--
-- Estrutura para tabela `atn_vendas`
--

CREATE TABLE `atn_vendas` (
  `id_venda` int(11) NOT NULL,
  `valor_venda` varchar(50) NOT NULL,
  `prod_venda` varchar(100) NOT NULL,
  `quant_venda` varchar(50) NOT NULL,
  `data_venda` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `atn_vendas`
--

INSERT INTO `atn_vendas` (`id_venda`, `valor_venda`, `prod_venda`, `quant_venda`, `data_venda`) VALUES
(9, '3.7', 'Medicamento', '1', '18 / 09'),
(10, '7.4', 'Medicamento', '2', '15 / 07'),
(11, '7.4', 'Medicamento', '2', '16 / 08'),
(12, '3.7', 'Medicamento', '1', '12 / 09'),
(13, '14.8', 'Medicamento', '4', '12 / 08'),
(14, '14.8', 'Medicamento', '4', '18 / 09'),
(15, '1950.0', 'Vacina', '5', '19 / 9'),
(16, '5.8', 'Vermifugo', '2', '19/09'),
(17, '3.7', 'Medicamento', '1', '18 / 09'),
(18, '780.0', 'Vacina', '2', '18 / 09'),
(19, '7.4', 'Medicamento', '2', '19 /8'),
(20, '25.900000000000002', 'Medicamento', '7', '18 / 08'),
(21, '11.100000000000001', 'Medicamento', '3', '17 /09'),
(22, '11.100000000000001', 'Medicamento', '3', '17 / 08'),
(23, '18.5', 'Medicamento', '5', '13 / 07');

-- --------------------------------------------------------

--
-- Estrutura para tabela `vet_ficha`
--

CREATE TABLE `vet_ficha` (
  `id_ficha` int(11) NOT NULL,
  `nome_ficha` varchar(100) NOT NULL,
  `idade_ficha` varchar(50) NOT NULL,
  `sexo_ficha` varchar(50) NOT NULL,
  `categoria_ficha` varchar(100) NOT NULL,
  `descricao_ficha` varchar(100) NOT NULL,
  `prescricao_ficha` varchar(500) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `vet_ficha`
--

INSERT INTO `vet_ficha` (`id_ficha`, `nome_ficha`, `idade_ficha`, `sexo_ficha`, `categoria_ficha`, `descricao_ficha`, `prescricao_ficha`) VALUES
(1, 'Mel', '12', 'Femea', 'Cao', 'Cega', 'Diabete.'),
(2, 'Maricota', '5', 'Macho', 'Gatinho', 'Gato Bravo', 'Hipertenso'),
(3, 'Maricota', '5', 'Macho', 'Gatinho', 'Gato Bravo', 'Cardíaco.'),
(4, 'Maricota', '5', 'Macho', 'Gatinho', 'Gato Bravo', 'Pressão alta.');

--
-- Índices para tabelas despejadas
--

--
-- Índices de tabela `adm_cargo`
--
ALTER TABLE `adm_cargo`
  ADD PRIMARY KEY (`id_cargo`);

--
-- Índices de tabela `adm_control`
--
ALTER TABLE `adm_control`
  ADD PRIMARY KEY (`id_control`);

--
-- Índices de tabela `adm_est`
--
ALTER TABLE `adm_est`
  ADD PRIMARY KEY (`id_est`);

--
-- Índices de tabela `adm_estsaida`
--
ALTER TABLE `adm_estsaida`
  ADD PRIMARY KEY (`id_est`);

--
-- Índices de tabela `adm_fornecedor`
--
ALTER TABLE `adm_fornecedor`
  ADD PRIMARY KEY (`id_fornecedor`);

--
-- Índices de tabela `adm_produto`
--
ALTER TABLE `adm_produto`
  ADD PRIMARY KEY (`id_produto`),
  ADD KEY `fk_fornecedor` (`fk_fornecedor`);

--
-- Índices de tabela `adm_servico`
--
ALTER TABLE `adm_servico`
  ADD PRIMARY KEY (`id_servico`);

--
-- Índices de tabela `adm_usuario`
--
ALTER TABLE `adm_usuario`
  ADD PRIMARY KEY (`id_usuario`);

--
-- Índices de tabela `atn_agenda`
--
ALTER TABLE `atn_agenda`
  ADD PRIMARY KEY (`id_agenda`),
  ADD KEY `fk_animal` (`fk_animal`);

--
-- Índices de tabela `atn_animal`
--
ALTER TABLE `atn_animal`
  ADD PRIMARY KEY (`id_animal`),
  ADD KEY `fk_cliente` (`fk_cliente`);

--
-- Índices de tabela `atn_categoria`
--
ALTER TABLE `atn_categoria`
  ADD PRIMARY KEY (`id_categoria`);

--
-- Índices de tabela `atn_cliente`
--
ALTER TABLE `atn_cliente`
  ADD PRIMARY KEY (`id_cliente`);

--
-- Índices de tabela `atn_vendas`
--
ALTER TABLE `atn_vendas`
  ADD PRIMARY KEY (`id_venda`);

--
-- Índices de tabela `vet_ficha`
--
ALTER TABLE `vet_ficha`
  ADD PRIMARY KEY (`id_ficha`);

--
-- AUTO_INCREMENT para tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `adm_cargo`
--
ALTER TABLE `adm_cargo`
  MODIFY `id_cargo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de tabela `adm_control`
--
ALTER TABLE `adm_control`
  MODIFY `id_control` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de tabela `adm_est`
--
ALTER TABLE `adm_est`
  MODIFY `id_est` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=18;

--
-- AUTO_INCREMENT de tabela `adm_estsaida`
--
ALTER TABLE `adm_estsaida`
  MODIFY `id_est` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- AUTO_INCREMENT de tabela `adm_fornecedor`
--
ALTER TABLE `adm_fornecedor`
  MODIFY `id_fornecedor` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de tabela `adm_produto`
--
ALTER TABLE `adm_produto`
  MODIFY `id_produto` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- AUTO_INCREMENT de tabela `adm_servico`
--
ALTER TABLE `adm_servico`
  MODIFY `id_servico` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `adm_usuario`
--
ALTER TABLE `adm_usuario`
  MODIFY `id_usuario` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de tabela `atn_agenda`
--
ALTER TABLE `atn_agenda`
  MODIFY `id_agenda` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de tabela `atn_animal`
--
ALTER TABLE `atn_animal`
  MODIFY `id_animal` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de tabela `atn_categoria`
--
ALTER TABLE `atn_categoria`
  MODIFY `id_categoria` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `atn_cliente`
--
ALTER TABLE `atn_cliente`
  MODIFY `id_cliente` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de tabela `atn_vendas`
--
ALTER TABLE `atn_vendas`
  MODIFY `id_venda` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=24;

--
-- AUTO_INCREMENT de tabela `vet_ficha`
--
ALTER TABLE `vet_ficha`
  MODIFY `id_ficha` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- Restrições para tabelas despejadas
--

--
-- Restrições para tabelas `adm_produto`
--
ALTER TABLE `adm_produto`
  ADD CONSTRAINT `fk_fornecedor` FOREIGN KEY (`fk_fornecedor`) REFERENCES `adm_fornecedor` (`id_fornecedor`);

--
-- Restrições para tabelas `atn_agenda`
--
ALTER TABLE `atn_agenda`
  ADD CONSTRAINT `fk_animal` FOREIGN KEY (`fk_animal`) REFERENCES `atn_animal` (`id_animal`);

--
-- Restrições para tabelas `atn_animal`
--
ALTER TABLE `atn_animal`
  ADD CONSTRAINT `fk_cliente` FOREIGN KEY (`fk_cliente`) REFERENCES `atn_cliente` (`id_cliente`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
