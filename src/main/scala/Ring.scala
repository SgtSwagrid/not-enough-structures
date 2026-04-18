package com.alecdorrington.structures

import com.alecdorrington.structures.builder.RingBuilder
import com.alecdorrington.structures.ops.RingOps

/** For algebraic structures with addition, negation, and multiplication. */
trait Ring[X] extends AdditiveGroup[X], DifferenceSemiring[X]:

  /** The unique representation of `-1` in this algebra system. */
  def negativeOne: X = negate(one)

/**
  * The companion object for [[Ring]]. Import as
  * ```scala
  * import com.alecdorrington.structures.Ring.{*, given}
  * ```
  * to receive all necessary syntax for working with rings.
  */
object Ring extends RingBuilder, RingOps:

  export com.alecdorrington.structures.Ring

  /** The [[Ring]] instance describing the current algebra system. */
  inline def ring[X : Ring as ring]: Ring[X] = ring
