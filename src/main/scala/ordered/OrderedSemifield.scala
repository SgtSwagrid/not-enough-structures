package com.alecdorrington.structures
package ordered

import com.alecdorrington.structures.Semifield
import com.alecdorrington.structures.ordered.builder.OrderedSemifieldBuilder
import com.alecdorrington.structures.ordered.ops.OrderedSemifieldOps

/** An ordered version of [[Semifield]]. */
trait OrderedSemifield[X]
  extends Semifield[X], OrderedSemiring[X], OrderedMultiplicativeGroup[X]

/**
  * The companion object for [[OrderedSemifield]]. Import as
  * ```scala
  * import com.alecdorrington.structures.ordered.OrderedSemifield.{*, given}
  * ```
  * to receive all necessary syntax for working with ordered semifields.
  */
object OrderedSemifield extends OrderedSemifieldBuilder, OrderedSemifieldOps:

  export com.alecdorrington.structures.ordered.OrderedSemifield

  /** The [[OrderedSemifield]] instance describing the current algebra system. */
  inline def orderedSemifield[X : OrderedSemifield as orderedSemifield]
    : OrderedSemifield[X] = orderedSemifield
