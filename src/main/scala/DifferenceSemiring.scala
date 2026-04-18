package com.alecdorrington.structures

import com.alecdorrington.structures.builder.DifferenceSemiringBuilder
import com.alecdorrington.structures.ops.DifferenceSemiringOps

/** For algebraic structures with addition, subtraction, and multiplication. */
trait DifferenceSemiring[X] extends Semiring[X], DifferenceMonoid[X]

/**
  * The companion object for [[DifferenceSemiring]]. Import as
  * ```scala
  * import com.alecdorrington.structures.DifferenceSemiring.{*, given}
  * ```
  * to receive all necessary syntax for working with difference semirings.
  */
object DifferenceSemiring
  extends DifferenceSemiringBuilder, DifferenceSemiringOps:

  export com.alecdorrington.structures.DifferenceSemiring

  /** The [[DifferenceSemiring]] instance describing the current algebra system. */
  inline def differenceSemiring[X : DifferenceSemiring as differenceSemiring]
    : DifferenceSemiring[X] = differenceSemiring
