package com.alecdorrington.structures
package ordered

import com.alecdorrington.structures.MultiplicativeGroup
import com.alecdorrington.structures.ordered.builder.OrderedMultiplicativeGroupBuilder
import com.alecdorrington.structures.ordered.ops.OrderedMultiplicativeGroupOps

/** An ordered version of [[MultiplicativeGroup]]. */
trait OrderedMultiplicativeGroup[X]
  extends MultiplicativeGroup[X],
          OrderedEuclideanMonoid[X],
          OrderedMultiplicativeInverse[X]

/**
  * The companion object for [[OrderedMultiplicativeGroup]]. Import as
  * ```scala
  * import com.alecdorrington.structures.ordered.OrderedMultiplicativeGroup.{
  *   *, given,
  * }
  * ```
  * to receive all necessary syntax for working with ordered multiplicative
  * groups.
  */
object OrderedMultiplicativeGroup
  extends OrderedMultiplicativeGroupBuilder, OrderedMultiplicativeGroupOps:

  export com.alecdorrington.structures.ordered.OrderedMultiplicativeGroup

  /**
    * The [[OrderedMultiplicativeGroup]] instance describing the current algebra
    * system.
    */
  inline def orderedMultiplicativeGroup[
    X : OrderedMultiplicativeGroup as orderedMultiplicativeGroup,
  ]: OrderedMultiplicativeGroup[X] = orderedMultiplicativeGroup
