package com.alecdorrington.structures

import com.alecdorrington.structures.builder.SemiringBuilder
import com.alecdorrington.structures.ops.SemiringOps

/** For algebraic structures with both addition and multiplication. */
trait Semiring[X] extends AdditiveMonoid[X], MultiplicativeMonoid[X]:

  /** The unique representation of `2` in this algebra system. */
  def two: X = add(one, one)

/**
  * The companion object for [[Semiring]]. Import as
  * ```scala
  * import com.alecdorrington.structures.Semiring.{*, given}
  * ```
  * to receive all necessary syntax for working with semirings.
  */
object Semiring extends SemiringBuilder, SemiringOps:

  export com.alecdorrington.structures.Semiring

  /** The [[Semiring]] instance describing the current algebra system. */
  inline def semiring[X : Semiring as semiring]: Semiring[X] = semiring
