package me.dio.credit.application.system.dto

import jakarta.validation.constraints.Future
import jakarta.validation.constraints.Min
import jakarta.validation.constraints.NotNull
import me.dio.credit.application.system.entity.Credit
import me.dio.credit.application.system.entity.Customer
import java.math.BigDecimal
import java.time.LocalDate

data class creditDto(
    @field:NotNull(message = "invalid input") val creditValue: BigDecimal,
    @field:Future(message = "Enter a valid date") val dayFirstOfInstallment: LocalDate,
    @field:Min(value = 1, message = "Number of installments must be at least 1") val numberOfInstallment: Int,
    @field:NotNull(message = "invalid input") val customerId: Long
) {

    fun toEntity(): Credit = Credit(
        creditValue = this.creditValue,
        dayFirstOfInstallment = this.dayFirstOfInstallment,
        numberOfInstallment = this.numberOfInstallment,
        customer = Customer(id = this.customerId)
    )

}
