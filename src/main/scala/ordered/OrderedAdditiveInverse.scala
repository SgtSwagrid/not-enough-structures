package com.alecdorrington.structures
package ordered

import com.alecdorrington.structures.AdditiveInverse
import com.alecdorrington.structures.ordered.builder.OrderedAdditiveInverseBuilder
import com.alecdorrington.structures.ordered.ops.OrderedAdditiveInverseOps

/** An ordered version of [[AdditiveInverse]]. */
trait OrderedAdditiveInverse[X] extends AdditiveInverse[X], Ordering[X]

/**
  * The companion object for [[OrderedAdditiveInverse]]. Import as
  * ```scala
  * import com.alecdorrington.structures.ordered.OrderedAdditiveInverse.{
  *   *, given,
  * }
  * ```
  * to receive all necessary syntax for working with ordered additive inverses.
  */
object OrderedAdditiveInverse
  extends OrderedAdditiveInverseBuilder, OrderedAdditiveInverseOps:

  export com.alecdorrington.structures.ordered.OrderedAdditiveInverse

  /**
    * The [[OrderedAdditiveInverse]] instance describing the current algebra
    * system.
    */
  inline def orderedAdditiveInverse[
    X : OrderedAdditiveInverse as orderedAdditiveInverse,
  ]: OrderedAdditiveInverse[X] = orderedAdditiveInverse
