package com.alecdorrington.structures.connector.spire

/**
  * Introduces compatibility between "Spire" type classes and our own.
  *
  * Import as:
  * ```scala
  * import com.alecdorrington.structures.connector.spire.SpireConversions.given
  * ```
  */
object SpireConversions
  extends AdditiveSemigroupSpireConversions,
          AdditiveMonoidSpireConversions,
          AdditiveGroupSpireConversions,
          MultiplicativeSemigroupSpireConversions,
          MultiplicativeMonoidSpireConversions,
          MultiplicativeGroupSpireConversions,
          SemiringSpireConversions,
          RingSpireConversions,
          EuclideanRingSpireConversions,
          FieldSpireConversions
