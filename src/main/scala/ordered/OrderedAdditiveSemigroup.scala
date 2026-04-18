package com.alecdorrington.structures
package ordered

import com.alecdorrington.structures.AdditiveSemigroup
import com.alecdorrington.structures.ordered.builder.OrderedAdditiveSemigroupBuilder
import com.alecdorrington.structures.ordered.ops.OrderedAdditiveSemigroupOps

/** An ordered version of [[AdditiveSemigroup]]. */
trait OrderedAdditiveSemigroup[X] extends AdditiveSemigroup[X], Ordering[X]

/**
  * The companion object for [[OrderedAdditiveSemigroup]]. Import as
  * ```scala
  * import com.alecdorrington.structures.ordered.OrderedAdditiveSemigroup.{
  *   *, given,
  * }
  * ```
  * to receive all necessary syntax for working with ordered additive
  * semigroups.
  */
object OrderedAdditiveSemigroup
  extends OrderedAdditiveSemigroupBuilder, OrderedAdditiveSemigroupOps:

  export com.alecdorrington.structures.ordered.OrderedAdditiveSemigroup

  /**
    * The [[OrderedAdditiveSemigroup]] instance describing the current algebra
    * system.
    */
  inline def orderedAdditiveSemigroup[
    X : OrderedAdditiveSemigroup as orderedAdditiveSemigroup,
  ]: OrderedAdditiveSemigroup[X] = orderedAdditiveSemigroup
