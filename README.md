# credit-application-system
<h1 align="center">API para Sistema de Avaliação de Créditos</h1>
<p>Uma empresa de empréstimo precisa criar um sistema de análise de solicitação de crédito. Sua tarefa será criar uma <strong>API REST SPRING BOOT E KOTLIN</strong> 🍃💜 para a empresa fornecer aos seus clientes as seguintes funcionalidades:</p>

<ul>
  <li>
    <h3>Cliente (Customer):</h3>
    <ul>
      <li><strong>Cadastrar:</strong>
        <ol>
          <li><strong>Request: </strong><em>firstName, lastName, cpf, income, email, password, zipCode e street</em></li>
          <li><strong>Response: </strong><em>String</em></li>
        </ol>
      </li>
      <li><strong>Editar cadastro:</strong>
        <ol>
          <li><strong>Request: </strong><em>id, firstName, lastName, income, zipCode, street</em></li>
          <li><strong>Response: </strong><em>firstName, lastName, income, cpf, email, income, zipCode, street</em></li>
        </ol>
      </li>
      <li><strong>Visualizar perfil:</strong>
        <ol>
          <li><strong>Request: </strong><em>id</em></li>
          <li><strong>Response: </strong><em>firstName, lastName, income, cpf, email, income, zipCode, street</em></li>
        </ol>
      </li>
      <li><strong>Deletar cadastro:</strong>
        <ol>
          <li><strong>Request: </strong><em>id</em></li>
          <li><strong>Response: </strong><em>sem retorno</em></li>
        </ol>
      </li>
    </ul>
  </li>
  <li>
    <h3>Solicitação de Empréstimo (Credit):</h3>
    <ul>
      <li><strong>Cadastrar:</strong>
        <ol>
          <li><strong>Request: </strong><em>creditValue, dayFirstOfInstallment, numberOfInstallments e customerId</em></li>
          <li><strong>Response: </strong><em>String</em></li>
        </ol>
      </li>
      <li><strong>Listar todas as solicitações de empréstimo de um cliente:</strong>
        <ol>
          <li><strong>Request: </strong><em>customerId</em></li>
          <li><strong>Response: </strong><em>creditCode, creditValue, numberOfInstallment</em></li>
        </ol>
      </li>
      <li><strong>Visualizar um empréstimo:</strong>
        <ol>
          <li><strong>Request: </strong><em>customerId e creditCode</em></li>
          <li><strong>Response: </strong><em>creditCode, creditValue, numberOfInstallment, status, emailCustomer e incomeCustomer</em></li>
        </ol>
      </li>
    </ul>
  </li>
</ul>

