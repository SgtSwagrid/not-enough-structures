package com.alecdorrington.structures
package ordered

import com.alecdorrington.structures.MultiplicativeInverse
import com.alecdorrington.structures.ordered.builder.OrderedMultiplicativeInverseBuilder
import com.alecdorrington.structures.ordered.ops.OrderedMultiplicativeInverseOps

/** An ordered version of [[MultiplicativeInverse]]. */
trait OrderedMultiplicativeInverse[X]
  extends MultiplicativeInverse[X], Ordering[X]

/**
  * The companion object for [[OrderedMultiplicativeInverse]]. Import as
  * ```scala
  * import com.alecdorrington.structures.ordered.OrderedMultiplicativeInverse.{
  *   *, given,
  * }
  * ```
  * to receive all necessary syntax for working with ordered multiplicative
  * inverses.
  */
object OrderedMultiplicativeInverse
  extends OrderedMultiplicativeInverseBuilder, OrderedMultiplicativeInverseOps:

  export com.alecdorrington.structures.ordered.OrderedMultiplicativeInverse

  /**
    * The [[OrderedMultiplicativeInverse]] instance describing the current
    * algebra system.
    */
  inline def orderedMultiplicativeInverse[
    X : OrderedMultiplicativeInverse as orderedMultiplicativeInverse,
  ]: OrderedMultiplicativeInverse[X] = orderedMultiplicativeInverse
