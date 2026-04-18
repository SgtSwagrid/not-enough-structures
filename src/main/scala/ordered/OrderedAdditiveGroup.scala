package com.alecdorrington.structures
package ordered

import com.alecdorrington.structures.AdditiveGroup
import com.alecdorrington.structures.ordered.builder.OrderedAdditiveGroupBuilder
import com.alecdorrington.structures.ordered.ops.OrderedAdditiveGroupOps

/** An ordered version of [[AdditiveGroup]]. */
trait OrderedAdditiveGroup[X]
  extends AdditiveGroup[X],
          OrderedDifferenceMonoid[X],
          OrderedAdditiveInverse[X]:

  /** Computes the absolute value of a value [[x]]. */
  def abs(x: X): X = if isNegative(x) then negate(x) else x

/**
  * The companion object for [[OrderedAdditiveGroup]]. Import as
  * ```scala
  * import com.alecdorrington.structures.ordered.OrderedAdditiveGroup.{
  *   *, given,
  * }
  * ```
  * to receive all necessary syntax for working with ordered additive groups.
  */
object OrderedAdditiveGroup
  extends OrderedAdditiveGroupBuilder, OrderedAdditiveGroupOps:

  export com.alecdorrington.structures.ordered.OrderedAdditiveGroup

  /**
    * The [[OrderedAdditiveGroup]] instance describing the current algebra
    * system.
    */
  inline def orderedAdditiveGroup[
    X : OrderedAdditiveGroup as orderedAdditiveGroup,
  ]: OrderedAdditiveGroup[X] = orderedAdditiveGroup
