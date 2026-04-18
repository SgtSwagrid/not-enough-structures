package com.alecdorrington.structures
package ordered

import com.alecdorrington.structures.Semiring
import com.alecdorrington.structures.ordered.builder.OrderedSemiringBuilder
import com.alecdorrington.structures.ordered.ops.OrderedSemiringOps

/** An ordered version of [[Semiring]]. */
trait OrderedSemiring[X]
  extends Semiring[X], OrderedAdditiveMonoid[X], OrderedMultiplicativeMonoid[X]

/**
  * The companion object for [[OrderedSemiring]]. Import as
  * ```scala
  * import com.alecdorrington.structures.ordered.OrderedSemiring.{*, given}
  * ```
  * to receive all necessary syntax for working with ordered semirings.
  */
object OrderedSemiring extends OrderedSemiringBuilder, OrderedSemiringOps:

  export com.alecdorrington.structures.ordered.OrderedSemiring

  /** The [[OrderedSemiring]] instance describing the current algebra system. */
  inline def orderedSemiring[X : OrderedSemiring as orderedSemiring]
    : OrderedSemiring[X] = orderedSemiring
