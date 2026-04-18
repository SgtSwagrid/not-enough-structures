package com.alecdorrington.structures
package ordered

import com.alecdorrington.structures.DifferenceMonoid
import com.alecdorrington.structures.ordered.builder.OrderedDifferenceMonoidBuilder
import com.alecdorrington.structures.ordered.ops.OrderedDifferenceMonoidOps

/** An ordered version of [[DifferenceMonoid]]. */
trait OrderedDifferenceMonoid[X]
  extends DifferenceMonoid[X], OrderedAdditiveMonoid[X]

/**
  * The companion object for [[OrderedDifferenceMonoid]]. Import as
  * ```scala
  * import com.alecdorrington.structures.ordered.OrderedDifferenceMonoid.{
  *   *, given,
  * }
  * ```
  * to receive all necessary syntax for working with ordered difference monoids.
  */
object OrderedDifferenceMonoid
  extends OrderedDifferenceMonoidBuilder, OrderedDifferenceMonoidOps:

  export com.alecdorrington.structures.ordered.OrderedDifferenceMonoid

  /**
    * The [[OrderedDifferenceMonoid]] instance describing the current algebra
    * system.
    */
  inline def orderedDifferenceMonoid[
    X : OrderedDifferenceMonoid as orderedDifferenceMonoid,
  ]: OrderedDifferenceMonoid[X] = orderedDifferenceMonoid
