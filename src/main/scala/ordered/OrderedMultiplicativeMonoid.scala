package com.alecdorrington.structures
package ordered

import com.alecdorrington.structures.MultiplicativeMonoid
import com.alecdorrington.structures.ordered.builder.OrderedMultiplicativeMonoidBuilder
import com.alecdorrington.structures.ordered.ops.OrderedMultiplicativeMonoidOps

/** An ordered version of [[MultiplicativeMonoid]]. */
trait OrderedMultiplicativeMonoid[X]
  extends MultiplicativeMonoid[X],
          OrderedMultiplicativeSemigroup[X],
          OrderedMultiplicativeIdentity[X]

/**
  * The companion object for [[OrderedMultiplicativeMonoid]]. Import as
  * ```scala
  * import com.alecdorrington.structures.ordered.OrderedMultiplicativeMonoid.{
  *   *, given,
  * }
  * ```
  * to receive all necessary syntax for working with ordered multiplicative
  * monoids.
  */
object OrderedMultiplicativeMonoid
  extends OrderedMultiplicativeMonoidBuilder, OrderedMultiplicativeMonoidOps:

  export com.alecdorrington.structures.ordered.OrderedMultiplicativeMonoid

  /**
    * The [[OrderedMultiplicativeMonoid]] instance describing the current
    * algebra system.
    */
  inline def orderedMultiplicativeMonoid[
    X : OrderedMultiplicativeMonoid as orderedMultiplicativeMonoid,
  ]: OrderedMultiplicativeMonoid[X] = orderedMultiplicativeMonoid
