package com.alecdorrington.structures
package ordered

import com.alecdorrington.structures.AdditiveMonoid
import com.alecdorrington.structures.ordered.builder.OrderedAdditiveMonoidBuilder
import com.alecdorrington.structures.ordered.ops.OrderedAdditiveMonoidOps

/** An ordered version of [[AdditiveMonoid]]. */
trait OrderedAdditiveMonoid[X]
  extends AdditiveMonoid[X],
          OrderedAdditiveSemigroup[X],
          OrderedAdditiveIdentity[X]

/**
  * The companion object for [[OrderedAdditiveMonoid]]. Import as
  * ```scala
  * import com.alecdorrington.structures.ordered.OrderedAdditiveMonoid.{
  *   *, given,
  * }
  * ```
  * to receive all necessary syntax for working with ordered additive monoids.
  */
object OrderedAdditiveMonoid
  extends OrderedAdditiveMonoidBuilder, OrderedAdditiveMonoidOps:

  export com.alecdorrington.structures.ordered.OrderedAdditiveMonoid

  /**
    * The [[OrderedAdditiveMonoid]] instance describing the current algebra
    * system.
    */
  inline def orderedAdditiveMonoid[
    X : OrderedAdditiveMonoid as orderedAdditiveMonoid,
  ]: OrderedAdditiveMonoid[X] = orderedAdditiveMonoid
