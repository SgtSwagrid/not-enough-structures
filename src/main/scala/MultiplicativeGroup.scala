package com.alecdorrington.structures

import com.alecdorrington.structures.builder.MultiplicativeGroupBuilder
import com.alecdorrington.structures.ops.MultiplicativeGroupOps

/** For algebraic structures with multiplication and reciprocation. */
trait MultiplicativeGroup[X]
  extends EuclideanMonoid[X], MultiplicativeInverse[X]:

  override inline def divide(x: X, y: X): X = multiply(x, reciprocate(y))

  /** Computes [[x]] raised to the power [[n]], for any integer [[n]]. */
  override def pow(x: X, n: Int): X =
    super.pow(if n >= 0 then x else reciprocate(x), n.abs)

/**
  * The companion object for [[MultiplicativeGroup]]. Import as
  * ```scala
  * import com.alecdorrington.structures.MultiplicativeGroup.{*, given}
  * ```
  * to receive all necessary syntax for working with multiplicative groups.
  */
object MultiplicativeGroup
  extends MultiplicativeGroupBuilder, MultiplicativeGroupOps:

  export com.alecdorrington.structures.MultiplicativeGroup

  /**
    * The [[MultiplicativeGroup]] instance describing the current algebra
    * system.
    */
  inline def multiplicativeGroup[X : MultiplicativeGroup as multiplicativeGroup]
    : MultiplicativeGroup[X] = multiplicativeGroup
