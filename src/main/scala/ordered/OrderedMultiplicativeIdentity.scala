package com.alecdorrington.structures
package ordered

import com.alecdorrington.structures.MultiplicativeIdentity
import com.alecdorrington.structures.ordered.builder.OrderedMultiplicativeIdentityBuilder
import com.alecdorrington.structures.ordered.ops.OrderedMultiplicativeIdentityOps

/** An ordered version of [[MultiplicativeIdentity]]. */
trait OrderedMultiplicativeIdentity[X]
  extends MultiplicativeIdentity[X], Ordering[X]

/**
  * The companion object for [[OrderedMultiplicativeIdentity]]. Import as
  * ```scala
  * import com.alecdorrington.structures.ordered.OrderedMultiplicativeIdentity.{
  *   *, given,
  * }
  * ```
  * to receive all necessary syntax for working with ordered multiplicative
  * identity.
  */
object OrderedMultiplicativeIdentity
  extends OrderedMultiplicativeIdentityBuilder,
          OrderedMultiplicativeIdentityOps:

  export com.alecdorrington.structures.ordered.OrderedMultiplicativeIdentity

  /**
    * The [[OrderedMultiplicativeIdentity]] instance describing the current
    * algebra system.
    */
  inline def orderedMultiplicativeIdentity[
    X : OrderedMultiplicativeIdentity as orderedMultiplicativeIdentity,
  ]: OrderedMultiplicativeIdentity[X] = orderedMultiplicativeIdentity
