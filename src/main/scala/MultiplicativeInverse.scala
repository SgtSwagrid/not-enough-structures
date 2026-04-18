package com.alecdorrington.structures

import com.alecdorrington.structures.builder.MultiplicativeInverseBuilder
import com.alecdorrington.structures.ops.MultiplicativeInverseOps

/** For algebraic structures with a multiplicative inverse. */
trait MultiplicativeInverse[X]:

  /**
    * Computes the multiplicative inverse (reciprocal) of a value [[x]], i.e.
    * `1 / x`.
    *
    * @note
    *   All implementations must be involutions, i.e.
    *   `reciprocate(reciprocate(x)) == x`.
    */
  def reciprocate(x: X): X

/**
  * The companion object for [[MultiplicativeInverse]]. Import as
  * ```scala
  * import com.alecdorrington.structures.MultiplicativeInverse.{*, given}
  * ```
  * to receive all necessary syntax for working with multiplicative inverses.
  */
object MultiplicativeInverse
  extends MultiplicativeInverseBuilder, MultiplicativeInverseOps:

  export com.alecdorrington.structures.MultiplicativeInverse

  /**
    * The [[MultiplicativeInverse]] instance describing the current algebra
    * system.
    */
  inline def multiplicativeInverse[
    X : MultiplicativeInverse as multiplicativeInverse,
  ]: MultiplicativeInverse[X] = multiplicativeInverse
