package me.dio.credit.application.system.Repository

import me.dio.credit.application.system.entity.Credit
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface CrediteRepository: JpaRepository<Credit, Long>
