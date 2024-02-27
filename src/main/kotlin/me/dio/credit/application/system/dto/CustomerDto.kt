package me.dio.credit.application.system.dto

import jakarta.validation.constraints.Email
import jakarta.validation.constraints.NotEmpty
import jakarta.validation.constraints.NotNull
import me.dio.credit.application.system.entity.Address
import me.dio.credit.application.system.entity.Customer
import org.hibernate.validator.constraints.br.CPF
import java.math.BigDecimal

data class CustomerDto (
  @field:NotEmpty(message = "invalid input") val firstName: String,
  @field:NotEmpty(message = "invalid input") val lastName: String,
  @field:NotEmpty(message = "invalid input")
  @field:CPF(message = "This invalid CPF") val cpf: String,
  @field:NotNull(message = "invalid input") val income: BigDecimal,
  @field:Email(message = "Invalid email")
  @field:NotEmpty(message = "invalid input")  val email: String,
  @field:NotEmpty(message = "invalid input")  val password: String,
  @field:NotEmpty(message = "invalid input")  val zipCode: String,
  @field:NotEmpty(message = "invalid input")  val street: String
){
    //vai montar o Customer para salvar
    fun toEntity(): Customer = Customer(
        firstName = this.firstName,
        lastName = this.lastName,
        cpf = this.cpf,
        income = this.income,
        email = this.email,
        password = this.password,
        address = Address(
            zipCode = this.zipCode,
            street = this.street
        )
    )
}
