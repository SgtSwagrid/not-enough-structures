package com.alecdorrington.structures.connector.algebird

/**
  * Introduces compatibility between "Algebird" type classes and our own.
  *
  * Import as:
  * ```scala
  * import com.alecdorrington.structures.connector.cats.CatsConversions.given
  * ```
  */
object AlgebirdConversions
  extends AdditiveSemigroupAlgebirdConversions,
          AdditiveMonoidAlgebirdConversions,
          AdditiveGroupAlgebirdConversions,
          RingAlgebirdConversions,
          FieldAlgebirdConversions
