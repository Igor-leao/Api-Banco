create table boletos (
                         boletosID uuid not null NOT NULL,
                         pagadoID uuid DEFAULT,
                         seuNumero varchar(255),
                         dataEmissao DATE(),
                         dataAtualizacaoSituacao DATE(),
                         dataVencimento varchar(255),
                         numero_predio bigint,
                         rua varchar(255),
                         desconto1 uuid DEFAULT,
                         valorNominal varchar(255),
                         private integer
);


 create table pagador (
                          pagadoID uuid not null NOT NULL,
                          seuNumero varchar(255),
                          cpfCnpj  varchar(255),
                          nome  varchar(255),
                          endereco  varchar(255)
 );


