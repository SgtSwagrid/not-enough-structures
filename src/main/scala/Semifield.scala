package com.alecdorrington.structures

import com.alecdorrington.structures.builder.SemifieldBuilder
import com.alecdorrington.structures.ops.SemifieldOps

/** For algebraic structures with addition, multiplication, and reciprocation. */
trait Semifield[X] extends Semiring[X], MultiplicativeGroup[X]

/**
  * The companion object for [[Semifield]]. Import as
  * ```scala
  * import com.alecdorrington.structures.Semifield.{*, given}
  * ```
  * to receive all necessary syntax for working with semifields.
  */
object Semifield extends SemifieldBuilder, SemifieldOps:

  export com.alecdorrington.structures.Semifield

  /** The [[Semifield]] instance describing the current algebra system. */
  inline def semifield[X : Semifield as semifield]: Semifield[X] = semifield
