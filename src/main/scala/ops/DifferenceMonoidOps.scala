package com.alecdorrington.structures
package ops

import com.alecdorrington.structures.DifferenceMonoid

/** Extension methods for [[DifferenceMonoid]]. */
trait DifferenceMonoidOps extends AdditiveMonoidOps:

  extension [X : DifferenceMonoid as X](x: X)

    /** Computes the difference between both operands. */
    inline infix def - (y: X): X = X.subtract(x, y)
