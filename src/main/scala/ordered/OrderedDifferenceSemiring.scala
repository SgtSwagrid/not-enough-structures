package com.alecdorrington.structures
package ordered

import com.alecdorrington.structures.DifferenceSemiring
import com.alecdorrington.structures.ordered.builder.OrderedDifferenceSemiringBuilder
import com.alecdorrington.structures.ordered.ops.OrderedDifferenceSemiringOps

/** An ordered version of [[DifferenceSemiring]]. */
trait OrderedDifferenceSemiring[X]
  extends DifferenceSemiring[X], OrderedSemiring[X], OrderedDifferenceMonoid[X]

/**
  * The companion object for [[OrderedDifferenceSemiring]]. Import as
  * ```scala
  * import com.alecdorrington.structures.ordered.OrderedDifferenceSemiring.{
  *   *, given,
  * }
  * ```
  * to receive all necessary syntax for working with ordered difference
  * semirings.
  */
object OrderedDifferenceSemiring
  extends OrderedDifferenceSemiringBuilder, OrderedDifferenceSemiringOps:

  export com.alecdorrington.structures.ordered.OrderedDifferenceSemiring

  /**
    * The [[OrderedDifferenceSemiring]] instance describing the current algebra
    * system.
    */
  inline def orderedDifferenceSemiring[
    X : OrderedDifferenceSemiring as orderedDifferenceSemiring,
  ]: OrderedDifferenceSemiring[X] = orderedDifferenceSemiring
