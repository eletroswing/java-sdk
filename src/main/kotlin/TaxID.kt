@file:OptIn(ExperimentalSerializationApi::class)

package br.com.openpix.sdk

import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
public data class TaxID(
  @SerialName("taxID")
  public val text: String,

  @SerialName("type")
  public val kind: TaxIDKind? = null,
) {
  public fun kind(): TaxIDKind = kind ?: TaxIDKind.CPF
}

@Serializable
public enum class TaxIDKind {
  @SerialName("BR:CPF")
  CPF,

  @SerialName("BR:CNPJ")
  CNPJ,
}