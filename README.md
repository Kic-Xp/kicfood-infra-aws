# Microsserviços na AWS - Deploy com CDK e ECS Fargate

**Projeto desenvolvido como parte do curso [Deploy na AWS com CDK e ECS](link-do-curso) da Alura**

Implementação de uma arquitetura de microsserviços na AWS utilizando infraestrutura como código (IaC) com AWS CDK e serviços gerenciados.

## 🌩️ Arquitetura AWS

```mermaid
graph TD
    A[Client] --> B[Application Load Balancer]
    B --> C[ECS Fargate Service]
    C --> D[Microservice Containers]
    D --> E[RDS PostgreSQL]
    F[CloudWatch] -.-> C
    G[ECR] --> C
```

## 🛠️ Tecnologias e Serviços AWS

| Categoria        | Tecnologias/Serviços                          |
|------------------|---------------------------------------------|
| **Computação**   | ECS Fargate, Docker                         |
| **Banco de Dados** | RDS PostgreSQL                             |
| **Rede**         | VPC, ALB, Security Groups                  |
| **Monitoramento** | CloudWatch, X-Ray                         |
| **IaC**          | AWS CDK (TypeScript)                       |
| **Registry**     | ECR                                       |
| **Segurança**    | IAM Roles, Secrets Manager                |

## 📚 O Que Implementei (Conteúdo do Curso)

✔ **AWS CDK** - Infraestrutura como código com TypeScript  
✔ **ECS Fargate** - Containers sem gerenciamento de servidores  
✔ **RDS PostgreSQL** - Banco de dados gerenciado  
✔ **VPC Architecture** - Isolamento de recursos de rede  
✔ **Auto Scaling** - Escalabilidade automática baseada em métricas  
✔ **CloudWatch** - Monitoramento e logs centralizados  

## 🚀 Como Executar

### Pré-requisitos:
- AWS CLI configurada
- CDK instalado (`npm install -g aws-cdk`)
- Credenciais AWS com permissões adequadas

### Deployment:
```bash
# 1. Clone o repositório
git clone https://github.com/seu-usuario/aws-cdk-project.git
cd aws-cdk-project

# 2. Instale as dependências
npm install

# 3. Sintetize a infraestrutura
cdk synth

# 4. Faça o deploy
cdk deploy --all
```

### Comandos úteis:
```bash
# Visualizar diferenças
cdk diff

# Destruir recursos
cdk destroy

# Acessar logs
aws logs tail /ecs/your-service-name --follow
```

## 🔍 Aprendizados Chave

- **Padrões Cloud Native**: Arquitetura projetada para a nuvem
- **IaC**: Gerenciamento de infraestrutura como código
- **Serviços Gerenciados**: Vantagens do RDS e ECS Fargate
- **Segurança**: Configuração de IAM Roles e Security Groups
- **Observabilidade**: Implementação de monitoramento com CloudWatch
