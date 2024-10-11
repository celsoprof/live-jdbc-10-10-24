## Criando a tabela no banco de dados

```sql
CREATE TABLE produtos (
    id INT PRIMARY KEY,
    title VARCHAR2(100) NOT NULL,
    valor DECIMAL(10,2) NOT NULL,
    description VARCHAR(100)
);
